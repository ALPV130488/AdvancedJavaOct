package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DaoImplementation implements Dao {

	@PersistenceContext
	EntityManager em;

	@Override
	public String addProduct(Product product) {
		em.persist(product); // inserting obj into db
		return "Product inserted successfully";
	}

	@Override
	public String updateProduct(Product product) {
		em.merge(product);
		return "Product is updated sucessfully";
	}

	@Override
	public Product getProduct(int productId) {

		return em.find(Product.class,productId);
	}

	@Override
	public String deleteProduct(int productId) {
		Product product = em.find(Product.class, productId);

		em.remove(product);

		return "Product is deleted successfully";
	}

	@Override
	public List<Product> getAllProducts() {
	
		TypedQuery<Product> query = em.createQuery("select p from Product p",Product.class);
		
		return query.getResultList();
	}

}
