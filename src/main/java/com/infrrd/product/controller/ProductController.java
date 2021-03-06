package com.infrrd.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infrrd.product.entity.Product;
import com.infrrd.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable String id) {
		return productService.getProductById(id);
	}
	
	@DeleteMapping("/{id}")
	public List<Product> deleteProductById(@PathVariable String id) {
		return productService.deleteProductById(id);
	}
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return product;
		
		
		
	}

	
}
