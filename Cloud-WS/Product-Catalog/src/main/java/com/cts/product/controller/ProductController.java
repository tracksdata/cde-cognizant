package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/products")
	public List<Product> listAll(){
		return  productDao.findAll();
	}

}
