package com.codegym.blog_jpa.repository.impl;

import com.codegym.blog_jpa.models.Blog;
import com.codegym.blog_jpa.repository.BlogRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = entityManager.createQuery ( "select b from Blog b", Blog.class );
        return query.getResultList ();
    }
}
