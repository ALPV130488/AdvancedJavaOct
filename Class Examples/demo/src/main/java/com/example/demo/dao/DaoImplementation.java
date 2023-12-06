package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class DaoImplementation implements Dao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public String addProduct(Product product) {
		em.persist(product);           //inserting obj into db
		return "Product inserted successfully";
	}

}
