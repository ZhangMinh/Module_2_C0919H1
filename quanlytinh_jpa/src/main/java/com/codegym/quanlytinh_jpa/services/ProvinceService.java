package com.codegym.quanlytinh_jpa.services;

import com.codegym.quanlytinh_jpa.models.Customer;
import com.codegym.quanlytinh_jpa.models.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    void save(Province customer);

    Province findById(Long id);

    void delete(Long id);
}
