package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{
    private List<AddressBookData> addressBookList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int empId) {
        return addressBookList.get(empId-1);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressData = null;
        addressData= new AddressBookData(addressBookList.size()+1,addressBookDTO);
        addressBookList.add(addressData);
        return addressData;
    }

    @Override
    public AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
        AddressBookData addressData = this.getAddressBookDataById(personId);
        addressData.setName(addressBookDTO.name);
        addressData.setAddress(addressBookDTO.address);
        addressData.setPhoneNumber(addressBookDTO.phoneNumber);
        addressData.setCity(addressBookDTO.city);
        addressData.setState(addressBookDTO.state);
        addressData.setZipCode(addressBookDTO.zipCode);
        addressData.setEmail(addressBookDTO.email);
        addressBookList.set(personId-1, addressData);
        return addressData;
    }

    @Override
    public void deleteAddressBookData(int personId) {
        addressBookList.remove(personId-1);

    }
}
