package com.example.cassandra.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CustomerDto(
        UUID id,
        @NotEmpty(message= "Firstname cannot be empty")
        String firstname,
        @NotEmpty(message= "Lastname cannot be empty")
        String lastname,
        Integer age,
        @NotEmpty(message= "Email cannot be empty")
        String email,
        @NotNull(message= "Address cannot be null")
        AddressDto address) {
}
