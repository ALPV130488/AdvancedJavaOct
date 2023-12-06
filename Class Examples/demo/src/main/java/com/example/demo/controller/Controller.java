package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

}
