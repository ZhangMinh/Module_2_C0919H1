package com.codegym.demo_jpa.repository.impl;

import com.codegym.demo_jpa.models.Customer;
import com.codegym.demo_jpa.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Customer> getAll() {
        TypedQuery<Customer> query = entityManager.createQuery ( "select c from Customer c", Customer.class );
        return query.getResultList ();
    }

    @Override
    public void save(Customer temp) {
        if (temp.getId () != null) {
            entityManager.merge ( temp );
        } else entityManager.persist ( temp );
    }



    @Override
    public Customer findById(Long id) {
        TypedQuery<Customer> query = entityManager.createQuery ( "select c from Customer c where c.id like :id", Customer.class )
                .setParameter ( "id", id );
        return query.getSingleResult ();
    }

    @Override
    public void delete(Customer customer){
         entityManager.remove ( customer );
    }
}
