package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void saveProduct(Product product);

	List<Product> listAll();

}