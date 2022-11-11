package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exception.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.IAddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{

    @Autowired
    private IAddressBookRepository addressBookRepository;


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
}
