package com.infrrd.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.infrrd.product.entity.Product;
import com.infrrd.product.repositry.ProductRepository;

@Service
public class ProductService {
	
//	@Autowired
	//private ProductRepository productRepository;
	
	public List<Product> getProducts(){		
		
		return ProductRepository.dBUtlis();
	}
	
	public Product getProductById(String id) {
		Product product = ProductRepository.dBUtlis().stream()
				  .filter(p -> id.equals(p.getProductId()))
				  .findAny()
				  .orElse(null);
		return product;
	}
	
	public List<Product> deleteProductById(String id) {
		
		Product product = getProductById(id);
		
		List<Product> removeProduct = new ArrayList<Product>();
		removeProduct.add(product);

		List<Product> productList = ProductRepository.dBUtlis().stream()
		                       .filter(item -> !removeProduct.contains(item))
		                        .collect(Collectors.toList());
		return productList;
		
	}
	
	public Product save(Product product) {
		List<Product> productList = ProductRepository.dBUtlis();
		productList.add(product);
		return product;
		
	}

}
