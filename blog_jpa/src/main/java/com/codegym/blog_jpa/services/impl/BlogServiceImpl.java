package com.codegym.blog_jpa.services.impl;

import com.codegym.blog_jpa.models.Blog;
import com.codegym.blog_jpa.repository.BlogRepository;
import com.codegym.blog_jpa.repository.impl.BlogRepositoryImpl;
import com.codegym.blog_jpa.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll ();
    }
}
