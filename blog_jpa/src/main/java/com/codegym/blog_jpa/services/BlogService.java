package com.codegym.blog_jpa.services;

import com.codegym.blog_jpa.models.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
}
