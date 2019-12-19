package com.codegym.demo_jpa.repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAll();

    void save(T temp);

    T findById(Long id);

    void delete(T t);
}
