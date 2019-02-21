package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public List<Product> listAll() {
		return prodDao.findAll();
	}

	@Override
	public Product findById(String productId) {

		return prodDao.findById(productId).orElse(null);
	}

	@Override
	public void updateProduct(Product product) {
		prodDao.save(product);
	}

	@Override
	public void removeProduct(Product product) {
		prodDao.delete(product);
	}
	
	public void removeById(String productId) {
		 prodDao.deleteById(productId);
	}

}
