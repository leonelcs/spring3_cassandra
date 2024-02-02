package com.example.cassandra.controllers;

import com.example.cassandra.dto.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface CustomerOperations {

    @GetMapping(
            value = "/customers/{id}",
            produces = "application/json"
    )
    Mono<ResponseEntity<CustomerDto>> getCustomer(@PathVariable UUID id);

    @PostMapping(
            value = "/customers",
            produces = "application/json"
    )
    Mono<ResponseEntity<CustomerDto>> createCustomer(@RequestBody CustomerDto newCustomer);

}
