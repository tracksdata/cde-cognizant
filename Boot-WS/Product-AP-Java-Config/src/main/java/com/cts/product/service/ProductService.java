package com.cts.product.service;

import java.util.List;

import com.cts.product.model.Product;

public interface ProductService {

	void persistProduct(Product product);

	List<Product> displayAll();

	Product find(String prodId);

	void remove(String prodId);

}