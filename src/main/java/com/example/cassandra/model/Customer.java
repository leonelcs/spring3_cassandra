package com.example.cassandra.model;


import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.Instant;
import java.util.UUID;

@Table
public record Customer(
        @PrimaryKey
        UUID id,
        String firstname,
        String lastname,
        Integer age,
        String email,
        String street,
        String city,
        String zip,
        String country,
        String number,
        Instant createdAt,
        Instant updatedAt
) {

    public Customer(String firstname, String lastname, Integer age, String email, String street, String city, String zip, String country, String number) {
        this(UUID.randomUUID(), firstname, lastname, age, email, street, city, zip, country, number, Instant.now(), Instant.now());
    }

}
