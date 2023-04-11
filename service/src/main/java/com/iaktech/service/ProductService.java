package com.iaktech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iaktech.domain.Product;
import com.iaktech.dto.ProductRepository;



public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void updateProduct(long id, Product product) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(long id) {
		
		productRepository.deleteById(id);
	}

	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

}
