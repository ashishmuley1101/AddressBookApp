package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new AddressBookDTO("Ashish", "kamal chowk",
                95789983,"nagpur","MH","440017","ashish@gmail.com")));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        AddressBookData addressData= null;
        addressData = new AddressBookData(1, new AddressBookDTO("Ashish Muley", "kamal chowk",
                95789983,"nagpur","MH","440017","ashish@gmail.com"));
        return addressData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressData = null;
        addressData = new AddressBookData(1, addressBookDTO);
        return addressData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressData = null;
        addressData = new AddressBookData(1, addressBookDTO);
        return addressData;
    }

    @Override
    public void deleteAddressBookData(int empId) {

    }
}
