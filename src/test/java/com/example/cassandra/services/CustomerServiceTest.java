package com.example.cassandra.services;


import com.example.cassandra.dto.AddressDto;
import com.example.cassandra.dto.CustomerDto;

import java.util.UUID;

public class CustomerServiceTest {

    CustomerDto customer = new CustomerDto(
            UUID.randomUUID(),
            "John",
            "Doe",
            42,
            "jdoe@gmail.com",
            new AddressDto(
                    "Main Street",
                    "New York",
                    "10044",
                    "USA",
                    "42"
            ));
}
