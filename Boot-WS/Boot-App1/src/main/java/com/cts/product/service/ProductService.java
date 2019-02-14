package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void saveProduct(Product product);

	List<Product> listAll();

	Product findById(String prodId);

	void updateProduct(Product product);

	void removeProduct(Product product);

	void removeProductById(String prodId);

	List<Product> findProductByName(String prodName);

}