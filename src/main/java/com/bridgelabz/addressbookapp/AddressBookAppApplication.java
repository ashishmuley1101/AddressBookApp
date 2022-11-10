package com.bridgelabz.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// Use lombok Lib for Logging @Slf4j
@Slf4j
public class AddressBookAppApplication {

    //log.info giving information on start screen
    public static void main(String[] args) {
        SpringApplication.run(AddressBookAppApplication.class, args);
        log.info("Address Book App Started");
    }

}
