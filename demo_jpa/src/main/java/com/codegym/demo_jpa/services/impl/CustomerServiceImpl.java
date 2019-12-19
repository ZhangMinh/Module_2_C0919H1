package com.codegym.demo_jpa.services.impl;

import com.codegym.demo_jpa.models.Customer;
import com.codegym.demo_jpa.repository.CustomerRepository;
import com.codegym.demo_jpa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.getAll ();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save ( customer );
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById ( id );
    }

    @Override
    public List<Customer> delete(Long id) {
        Customer customer = findById ( id );
        customerRepository.delete (customer);
        return findAll ();
    }

}
