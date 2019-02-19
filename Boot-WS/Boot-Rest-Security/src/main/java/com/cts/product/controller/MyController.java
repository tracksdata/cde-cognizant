package com.cts.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@GetMapping("/user/d1")
	public String userAcess() {
		
		return "User Level Access";
	}
	
	@GetMapping("/admin/d1")
	public String adminAcess() {
		
		return "Admin Level Access";
	}

}
