package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	void saveProduct(Product product);

	List<Product> listAll();

	Product findById(String prodId);

	void updateProduct(Product product);

	void removeProduct(Product product);

	void removeProductById(String prodId);
	List<Product> findProductByName(String prodName);

}