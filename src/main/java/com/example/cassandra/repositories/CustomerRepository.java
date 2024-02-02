package com.example.cassandra.repositories;

import com.example.cassandra.model.Customer;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface CustomerRepository extends CassandraRepository<Customer, UUID> {

    @Override
    Customer save(Customer entity);

    Customer findBy(UUID id);

    @Override
    List<Customer> findAll();

    List<Customer> findByLastname(String lastname);

}
