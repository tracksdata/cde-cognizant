package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.Review;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ReviewRepository;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/v1/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ReviewRepository reviewRepository;

	@GetMapping
	public List<Product> get() {
		return productRepository.findAll();
	}

	@GetMapping("/{id}/reviews")
	public List<Review> getReviews(@PathVariable int id) {
		return productRepository.findReviewsByProduct(id);
	}

	@PostMapping("/{id}/reviews")
	public Review saveReview(@PathVariable int id, @RequestBody Review review) {
		review.setProduct(productRepository.findById(id).get());
		return reviewRepository.save(review);
	}

}
