package com.example.cassandra.controllers;


import com.example.cassandra.dto.AddressDto;
import com.example.cassandra.dto.CustomerDto;
import com.example.cassandra.services.CustomerService;
import jakarta.annotation.Nonnull;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class CustomerController implements CustomerOperations {

    final private CustomerService service;

    @Override
    public Mono<ResponseEntity<CustomerDto>> getCustomer(UUID id) {

        return Mono.just(ResponseEntity.status(200).body(service.getCustomer(id)));
    }

    @Override
    public Mono<ResponseEntity<CustomerDto>> createCustomer(@Valid @Nonnull CustomerDto newCustomer) {
        return Mono.just(ResponseEntity.status(200).body(service.saveCustomer(newCustomer)));
    }
}
