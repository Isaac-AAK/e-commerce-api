package com.iaktech.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iaktech.domain.Product;
import com.iaktech.dto.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product updateProduct(long id, Product newProduct) {
		return productRepository.findById(id)
				.map(product ->
		{
			product.setName(newProduct.getName());
			product.setDecription(newProduct.getDecription());
			product.setPrice(newProduct.getPrice());
			return productRepository.save(product);
		}).orElseGet(() ->{
			return productRepository.save(newProduct);
		});
				
		
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
