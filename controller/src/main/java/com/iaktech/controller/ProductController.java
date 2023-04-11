package com.iaktech.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iaktech.domain.Product;
import com.iaktech.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/ping")
	public String ping() {
		return "pong";
		
	}
	
	@GetMapping("/products")	
	public List<Product> getProducts(){
		
		return productService.getProducts();
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		if(product.getName()== null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		productService.addProduct(product);
		System.out.println(product);
		return new ResponseEntity<>(product,HttpStatus.CREATED);
	}
	
	@PutMapping("products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable long id,@RequestBody Product product) {
		
		productService.updateProduct(id,product);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	@DeleteMapping("products/{id}")
	public ResponseEntity<Product> delete(@PathVariable long id){
		 productService.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
