package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RefreshScope
public class CityController {
	
	@Value("${cityName}")
	private String city;
	
	@GetMapping("/getCity")
	public String getCity() {
		return "Your City is "+city;
	}

}
