package com.infrrd.product.repositry;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infrrd.product.entity.Product;

@Repository
public class ProductRepository {

	
	  public static List<Product> dBUtlis(){
	
		
		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product("1001", "rohit", "542345"));
		productList.add(new Product("1002", "abc", "542345"));
		productList.add(new Product("1003", "asf", "542345"));
		
		return productList;
	}
	
	
	}

