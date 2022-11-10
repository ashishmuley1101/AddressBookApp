package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import java.time.LocalDate;

public @Data class AddressBookData {
    private int personId;
    private String name;
    private String address;
    private long phoneNumber;
    private String city;
    private String state;
    private String zipCode;
    private String email;

    private LocalDate dateOfBirth;

    public AddressBookData(){}


    public AddressBookData(int personId, AddressBookDTO addressBookDTO) {
        this.personId = personId;
        this.name= addressBookDTO.name;
        this.address=addressBookDTO.address;
        this.phoneNumber=addressBookDTO.phoneNumber;
        this.city=addressBookDTO.city;
        this.state=addressBookDTO.state;
        this.zipCode=addressBookDTO.address;
        this.email=addressBookDTO.email;
        this.dateOfBirth=addressBookDTO.dateOfBirth;
    }


}
