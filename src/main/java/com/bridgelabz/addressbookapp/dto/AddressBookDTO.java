package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {

    public String name;
    public String address;
    public long phoneNumber;
    public String city;
    public String state;
    public String zipCode;
    public String email;

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public AddressBookDTO(String name, String address, long phoneNumber, String city, String state, String zipCode, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
    }
}



