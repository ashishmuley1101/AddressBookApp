package com.bridgelabz.addressbookapp.controllers;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get call success..!", HttpStatus.OK);
    }

    // Getting Address book data using id @GetMapping

    @GetMapping("/get/{personId}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("personId") int personId) {
        return new ResponseEntity<String>("Get call success for id: "+personId, HttpStatus.OK);
    }


    //Creating employee data using @PostMapping

    @PostMapping(path = "/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Created employee payroll data for: "+addressBookDTO, HttpStatus.OK);
    }

    //Updating employee data using @PutMapping

    @PutMapping(path = "/update")
    public ResponseEntity<String> updateEmployeePayrollData(@PathVariable("personId") int personId,
                                                            @RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Updated employee payroll data for: "+addressBookDTO, HttpStatus.OK);
    }

    //Deleting employee data using @DeleteMapping

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("personId") int personId) {
        return new ResponseEntity<String>("Delete call success for id: "+personId, HttpStatus.OK);
    }
}
