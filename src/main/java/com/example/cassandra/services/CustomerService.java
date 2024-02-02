package com.example.cassandra.services;

import com.example.cassandra.dto.AddressDto;
import com.example.cassandra.dto.CustomerDto;
import com.example.cassandra.model.Customer;
import com.example.cassandra.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CustomerService {

    final private CustomerRepository customerRepository;

    public CustomerDto saveCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(
                customerDto.firstname(),
                customerDto.lastname(),
                customerDto.age(),
                customerDto.email(),
                customerDto.address().street(),
                customerDto.address().city(),
                customerDto.address().zip(),
                customerDto.address().country(),
                customerDto.address().number()
        );
        Customer output = customerRepository.save(customer);
        var customerDtoOutput = new CustomerDto(
                output.getId(),
                output.getFirstname(),
                output.getLastname(),
                output.getAge(),
                output.getEmail(),
                new AddressDto(
                        output.getStreet(),
                        output.getCity(),
                        output.getZip(),
                        output.getCountry(),
                        output.getNumber()
                )
        );
        return customerDtoOutput;
    }

    public CustomerDto getCustomer(UUID id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        var customerDtoOutput = new CustomerDto(
                customer.getId(),
                customer.getFirstname(),
                customer.getLastname(),
                customer.getAge(),
                customer.getEmail(),
                new AddressDto(
                        customer.getStreet(),
                        customer.getCity(),
                        customer.getZip(),
                        customer.getCountry(),
                        customer.getNumber()
                )
        );
        return customerDtoOutput;
    }
}
