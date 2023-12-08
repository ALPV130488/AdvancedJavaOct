package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ServiceEx;

@RestController
@RequestMapping("/product")
public class Controller {
	
	@Autowired
	ServiceEx service;
	
	@PostMapping("/addproduct")			//http://localhost:6666/product/addproduct
	public String insertProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@PutMapping("/updateproduct")			//http://localhost:6666/product/updateproduct
	public String updateProduct(@RequestBody Product product) {
		 return service.updateProduct(product);
	}
	
	@GetMapping("/getproduct/{pid}")	//http://localhost:6666/product/getproduct/100
	public Product getProduct(@PathVariable("pid") int productId) {
		
		return service.getProduct(productId);
	}

	@DeleteMapping("/deleteproduct/{pid}")	//http://localhost:6666/product/deleteproduct/100
	public String deleteProduct(@PathVariable("pid") int productId) {
		return service.deleteProduct(productId);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
}
