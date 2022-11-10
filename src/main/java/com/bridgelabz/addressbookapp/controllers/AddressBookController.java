package com.bridgelabz.addressbookapp.controllers;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // Getting employee data in the form of JSON
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("Tom", "Kamal chowk",9579112,
                "Nagpur","MH","440017",
                "ashishmuley1101@gmail.com"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    // Getting Address book data using id @GetMapping
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int empId) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(empId, new AddressBookDTO("jerry", "Kamal chowk",9579112,
                "Nagpur","MH","440017",
                "ashishmuley11011@gmail.com"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    // Creating the address book data using @PostMapping Method
    @PostMapping(path = "/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully!", addressBookDTO);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    //Updating Address Book data using @PutMapping
    @PutMapping(path = "/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("personId") int personId,
                                                                 @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(personId, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully! ", addressBookDTO);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    //Delete Address Book data using @DeleteMapping Method
    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressBoookData(@PathVariable("empId") int personId) {
        ResponseDTO respDTO = new ResponseDTO("Deleted Address Book Data Successfully..! ", "Deleted Id :"+personId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
