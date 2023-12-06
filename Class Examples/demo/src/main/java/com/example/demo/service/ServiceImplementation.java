package com.example.demo.service;

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

}
