package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;
	
	public void saveProduct(Product product) {
		System.out.println("---- saving product service...");
		prodDao.saveProduct(product);
	}
	
	public List<Product> listAll(){
		return prodDao.listAll();
	}

}
