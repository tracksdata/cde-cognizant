package com.cts.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

	
	@GetMapping("/user/f1")
	public String test1() {
		return "User message";
	}
	
	@GetMapping("/admin/f1")
	public String test2() {
		return "Admin message";
	}
	
}
