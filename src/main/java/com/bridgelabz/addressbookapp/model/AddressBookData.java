package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
    private int personId;
    private String name;
    private String address;
    private long phoneNumber;
    private String city;
    private String state;

    public AddressBookData(){}

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressBookData(int personId, AddressBookDTO addressBookDTO) {
        this.personId = personId;
        this.name= addressBookDTO.name;
        this.address=addressBookDTO.address;
        this.phoneNumber=addressBookDTO.phoneNumber;
        this.city=addressBookDTO.city;
        this.state=addressBookDTO.state;
        this.zipCode=addressBookDTO.address;
        this.email=addressBookDTO.email;
    }

    private String zipCode;
    private String email;
}
