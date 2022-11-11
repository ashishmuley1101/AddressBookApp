package com.bridgelabz.addressbookapp.repository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAddressBookRepository extends JpaRepository<AddressBookData,Integer> {
    //@Query for custom query annotation to retrieve the data
    @Query(value = "select * from address_book WHERE city =:city",nativeQuery = true)
    List<AddressBookData> findAddressBookByCity(String city);

}

