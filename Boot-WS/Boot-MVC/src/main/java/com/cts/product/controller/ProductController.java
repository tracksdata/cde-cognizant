package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/s1")
	public String f1(Model obj) {
		
		String[] cities= {"Pune","Hyderabad","Chennai","Delhi","Bangalore"};
		obj.addAttribute("myCities",cities);
		
		System.out.println("-- f1 method got called");
		return "test";
	}

}
