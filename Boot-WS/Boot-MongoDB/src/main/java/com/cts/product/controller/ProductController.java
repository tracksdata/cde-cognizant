package com.cts.product.controller;

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

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductDao prodDao;
	@GetMapping("/products")
	public List<Product> listAll(){
		return prodDao.findAll();
	}
	@PostMapping("/products")
	public void saveProduct(@RequestBody Product product) {
		prodDao.save(product);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product product) {
		prodDao.save(product);
	}
	@DeleteMapping("/products/{prodId}")
	public void deleteById(@PathVariable("prodId")String prodId) {
		prodDao.deleteById(prodId);
	}
	
	
	
	
	
	

}
