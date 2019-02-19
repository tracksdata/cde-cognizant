package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, String>{

	// custom method
	
	List<Product> findProductByProductNameIsLike(String prodName);
	List<Product> findProductByPriceIsGreaterThanEqual(double price);
	
	//@Query(value="from Product as p where p.product_name like ?")
	//List<Product> findAllElectonicProducts(String storeName);
	
}