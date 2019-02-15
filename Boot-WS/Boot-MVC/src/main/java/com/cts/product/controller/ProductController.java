package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/s1")
	public String f1() {
		System.out.println("-- f1 method got called");
		return "test";
	}

}
