package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;
	
	
	@Transactional
	@Override
	public void saveProduct(Product product) {
		prodDao.saveProduct(product);
	}
	
	@Override
	public List<Product> listAll(){
		return prodDao.listAll();
	}
	
	
	@Override
	public Product findById(String prodId) {
		return prodDao.findById(prodId);
	}
	
	
	@Override
	public void updateProduct(Product product) {
		prodDao.updateProduct(product);
	}
	
	@Override
	public void removeProduct(Product product) {
		prodDao.removeProduct(product);
	}
	
	@Override
	public void removeProductById(String prodId) {
		prodDao.removeProductById(prodId);
	}
	
	@Override
	public List<Product> findProductByName(String prodName){
		
		return prodDao.findProductByName(prodName);
	}

}
