package com.codegym.quanlytinh_jpa.services;


import com.codegym.quanlytinh_jpa.models.Customer;

public interface CustomerService {
    Iterable<Customer> findAll();

    void save(Customer customer);

    Customer findById(Long id);

    void delete(Long id);
}
