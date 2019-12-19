package com.codegym.blog_jpa.repository;

import com.codegym.blog_jpa.models.Blog;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
}
