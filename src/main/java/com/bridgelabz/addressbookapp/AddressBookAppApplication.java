package com.bridgelabz.addressbookapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// Use lombok Lib for Logging @Slf4j
@Slf4j
public class AddressBookAppApplication {

    //log.info giving information on start screen
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);
        log.info("Address Book App Started in {} Environmet",context.getEnvironment().getProperty("environment"));

    }

}
