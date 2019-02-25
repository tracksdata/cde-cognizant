package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class Test {

	@Value("${cityName}")
	private String city;
	
	@GetMapping("/getCity")
	public String testName() {
		
		return "Your City Name is "+city;
	}
	
	
}
