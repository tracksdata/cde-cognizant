package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	List<Product> listAll();

	Product findById(String productId);

	void updateProduct(Product product);

	void removeProduct(Product product);
	public void removeById(String productId);

}