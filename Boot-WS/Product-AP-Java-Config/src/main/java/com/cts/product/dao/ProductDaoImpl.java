package com.cts.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	public void saveProduct(Product product) {
		System.out.println("Dao: Saving " + product.getProductName() + " to DB");
	}

	public List<Product> listAll() {
		System.out.println("Dao: Listing all products");
		return null;
	}

	public Product findById(String prodId) {
		System.out.println("Dao: Finding product");
		return null;
	}

	public void delete(String prodId) {
		System.out.println("Dao: Deleting product");
	}

}
