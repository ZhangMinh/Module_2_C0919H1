package com.codegym.quanlytinh_jpa.services.impl;

import com.codegym.quanlytinh_jpa.models.Customer;
import com.codegym.quanlytinh_jpa.models.Province;
import com.codegym.quanlytinh_jpa.repository.ProvinceRepository;
import com.codegym.quanlytinh_jpa.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll ();
    }

    @Override
    public void save(Province province) {
        provinceRepository.save ( province );
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById ( id ).orElse ( null );
    }

    @Override
    public void delete(Long id) {
        provinceRepository.deleteById ( id );
    }
}
