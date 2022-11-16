package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.IAddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService, UserDetailsService {

    @Autowired
    private IAddressBookRepository addressBookRepository;

//    @Autowired
//    private ModelMapper modelMapper;


    @Override
    public List<AddressBookData> getAddressBookData() {

        return addressBookRepository.findAll();
    }

    // Throwing Exception when person id not in Address Book App while retrieving from method
    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        return addressBookRepository.findById(personId).orElseThrow(()
                -> new AddressBookException("Person with PersonId "+personId+" does not exit..!"));
    }
    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressData = null;
        addressData= new AddressBookData(addressBookDTO);
        log.debug("Address Data: "+addressData.toString());
        return addressBookRepository.save(addressData);
    }

    @Override
        public AddressBookData updateAddressBookData(int personId,AddressBookDTO addressBookDTO) {
            AddressBookData addressData = this.getAddressBookDataById(personId);
            addressData.updateAddressBookData(addressBookDTO);
            return addressBookRepository.save(addressData);
    }

    @Override
    public void deleteAddressBookData(int personId) {
        AddressBookData addressData = this.getAddressBookDataById(personId);
        addressBookRepository.delete(addressData);

    }

    @Override
    public List<AddressBookData> getAddressBookDataByCity(String city) {
        return addressBookRepository.findAddressBookByCity(city);
    }

    @Override
    public List<AddressBookData> getAddressBookDataByName(String name) {
            return addressBookRepository.findAddressBookByName(name);
        }

        // UserDetails class calling method loadUserByUsername passing the name
        // from the login page from the browser and matching with the name and password with DB stored data
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        AddressBookData addressBookData = addressBookRepository.findByName(name);
        return new org.springframework.security.core.userdetails.User(addressBookData.getName(), addressBookData.getCity(),new ArrayList<>()) {
        };
    }
}


