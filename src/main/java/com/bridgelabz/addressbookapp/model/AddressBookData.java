package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "address_book")
public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "email")
    private String email;

    @Column(name = "date_Of_birth")
    private LocalDate dateOfBirth;

    public AddressBookData(){}



    public AddressBookData(AddressBookDTO addressBookDTO) {

        this.updateAddressBookData(addressBookDTO);
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
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
