package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	void saveProduct(Product product);

	List<Product> listAll();

}