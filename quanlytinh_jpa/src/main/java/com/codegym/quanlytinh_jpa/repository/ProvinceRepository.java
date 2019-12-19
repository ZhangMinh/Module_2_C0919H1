package com.codegym.quanlytinh_jpa.repository;

import com.codegym.quanlytinh_jpa.models.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends PagingAndSortingRepository<Province,Long> {
}
