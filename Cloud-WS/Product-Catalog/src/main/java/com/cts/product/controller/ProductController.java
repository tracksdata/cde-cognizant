package com.cts.product.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RefreshScope
public class ProductController {
	
	private double discount;
	
	@Autowired
	private ProductDao productDao;
	
	@Value("${product.discount}")
	private double discountPrice;
	
	@GetMapping("/products")
	public List<Product> listAll(){
		System.out.println("-----> Discount applied: "+discountPrice);
		return  productDao.findAll();
	}
	
	
	@GetMapping(value="/products/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Product findProduct(@PathVariable("id") int id) {
		return productDao.findById(id).orElse(null);
	}

}
