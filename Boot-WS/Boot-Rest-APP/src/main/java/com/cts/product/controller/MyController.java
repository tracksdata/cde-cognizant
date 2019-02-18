package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.model.Product;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class MyController {

	@GetMapping("/")
	public ResponseEntity<List<Product>> test() {

		Product p1 = new Product("P001", "Pen", 76, "Red Ink", "https://www.abc.com");
		Product p2 = new Product("P002", "Book", 736, "Red Ink", "https://www.abc.com");
		Product p3 = new Product("P003", "Ball Pen", 74446, "Red Ink", "https://www.abc.com");
		Product p4 = new Product("P004", "Laptop", 4576, "Red Ink", "https://www.abc.com");
		Product p5 = new Product("P005", "Mobile", 7446, "Red Ink", "https://www.abc.com");

		List<Product> prods = new ArrayList<>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);

		return  ResponseEntity.ok(prods);
	}

	@GetMapping("/product")
	public Product getProduct() {
		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setDescription("Dell");
		prod.setPrice(96000);
		prod.setImagePath("https://abc.com/laptop.jpeg");

		return prod;

	}

}
