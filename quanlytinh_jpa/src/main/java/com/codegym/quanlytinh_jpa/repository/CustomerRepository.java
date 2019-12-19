package com.codegym.quanlytinh_jpa.repository;

import com.codegym.quanlytinh_jpa.models.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
