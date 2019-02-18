package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void saveProduct(Product product);

	List<Product> listAll();

	Product findById(String prodId);
	public Product findById_v1(String prodId);
	List<Product> findProductByPriceIsGreaterThanEqual(double price);


	void updateProduct(Product product);

	void removeProduct(Product product);

	void removeProductById(String prodId);

	List<Product> findProductByName(String prodName);

}