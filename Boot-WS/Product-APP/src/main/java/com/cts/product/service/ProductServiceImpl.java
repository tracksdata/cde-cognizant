package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	public void persistProduct(Product product) {
		System.out.println("service: Saving " + product.getProductName() + " to DB");
		prodDao.saveProduct(product);
	}

	public List<Product> displayAll() {
		System.out.println("service: Listing all products");
		return prodDao.listAll();
	}

	public Product find(String prodId) {
		System.out.println("service: Finding product");
		return prodDao.findById(prodId);
	}

	public void remove(String prodId) {
		System.out.println("service: Deleting product");
		prodDao.delete(prodId);
	}

}
