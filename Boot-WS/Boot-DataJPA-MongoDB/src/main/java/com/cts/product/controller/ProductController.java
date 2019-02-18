package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDao prodDao;
	
	@GetMapping("test")
	public String test() {
		
		//prodDao.
		
		return "Welcome";
	}

}
