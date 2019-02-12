package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

public interface ProductDao {

	void saveProduct(Product product);

	List<Product> listAll();

	Product findById(String prodId);

	void delete(String prodId);

}