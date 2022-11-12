package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    //AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int personId);

    List<AddressBookData> getAddressBookDataByCity(String city);

    List<AddressBookData> getAddressBookDataByName(String name);



    AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO);
}
