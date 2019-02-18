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

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService ps;

	@GetMapping("/products")
	public List<Product> listAll() {
		return ps.listAll();
	}

	@GetMapping("/products/{prodId}")
	public Product getOne(@PathVariable("prodId") String prodId) {
		// Product prod=ps.f
		return ps.findById_v1(prodId);
	}

	@PostMapping("/products")
	public void saveProduct(@RequestBody Product prod) {
		ps.saveProduct(prod);

	}

	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		ps.saveProduct(prod);

	}

	
	@DeleteMapping("/products/{prodId}")
	public void deleteProductById(@PathVariable("prodId")String prodId) {
		ps.removeProductById(prodId);
	}

	@DeleteMapping("/products")
	public void deleteProduct(@RequestBody Product prod) {
		ps.removeProduct(prod);
	}

}
