package com.codegym.quanlytinh_jpa.services.impl;

import com.codegym.quanlytinh_jpa.models.Customer;
import com.codegym.quanlytinh_jpa.services.CustomerService;
import com.codegym.quanlytinh_jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll ();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save ( customer );
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById ( id ).orElse (  null);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById ( id );
    }

}
