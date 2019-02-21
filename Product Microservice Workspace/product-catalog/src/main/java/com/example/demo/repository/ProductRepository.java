package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Product;
import com.example.demo.model.Review;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("from Review r where r.product.id=:id")
	List<Review> findReviewsByProduct(int id);

}
