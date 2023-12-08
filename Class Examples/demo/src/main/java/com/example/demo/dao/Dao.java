package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface Dao {
	
	public abstract String addProduct(Product product);
	
	public abstract String updateProduct(Product product);
	
	public abstract String deleteProduct(int productId);
	
	public abstract Product getProduct(int productId);
	
	public abstract List<Product> getAllProducts();

}
