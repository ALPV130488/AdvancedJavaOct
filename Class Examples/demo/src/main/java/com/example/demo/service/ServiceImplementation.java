package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;
import com.example.demo.entity.Product;

@Service
public class ServiceImplementation implements ServiceEx{

	@Autowired
	Dao dao;
	
	@Override
	public String addProduct(Product product) {
		
		return dao.addProduct(product);
	}

	@Override
	public String updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}



	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.getProduct(productId);
	}

	@Override
	public String deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(productId);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

}
