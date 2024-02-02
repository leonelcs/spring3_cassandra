package com.example.cassandra.model;


import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

@Data
@Table
public class Customer {

    @PrimaryKey
    private UUID id;

    private final String firstname;
    private final String lastname;
    private final Integer age;
    private final String email;
    private final String street;
    private final String city;
    private final String zip;
    private final String country;
    private final String number;

    private Instant createdAt;
    private Instant updatedAt;

    public Customer(String firstname, String lastname, Integer age, String email, String street, String city, String zip, String country, String number) {
        this.id = UUID.randomUUID();
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.number = number;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

}
