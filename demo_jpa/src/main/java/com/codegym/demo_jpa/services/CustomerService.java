package com.codegym.demo_jpa.services;

import com.codegym.demo_jpa.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Long id);

    List<Customer> delete(Long id);
}
