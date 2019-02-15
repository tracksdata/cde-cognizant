package com.cts.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	private ProductDao prodDao;
	
	
	@Override
	public void saveProduct(Product product) {
		
		prodDao.save(product);
		
	}
	
	@Override
	public List<Product> listAll(){
		
		return prodDao.findAll();
	}
	
	
	@Override
	public Product findById(String prodId) {
		return prodDao.getOne(prodId);
	}
	
	public Product findById_v1(String prodId) {
		
		return prodDao.findById(prodId).orElse(null);
	}
	
	
	@Override
	public void updateProduct(Product product) {
		prodDao.save(product);
	}
	
	@Override
	public void removeProduct(Product product) {
		prodDao.delete(product);
	}
	
	@Override
	public void removeProductById(String prodId) {
		prodDao.deleteById(prodId);
		
	}
	
	@Override
	public List<Product> findProductByName(String prodName){

		return prodDao.findProductByProductNameIsLike(prodName);
	}

	@Override
	public List<Product> findProductByPriceIsGreaterThanEqual(double price) {
		// TODO Auto-generated method stub
		return prodDao.findProductByPriceIsGreaterThanEqual(price);
	}

}
