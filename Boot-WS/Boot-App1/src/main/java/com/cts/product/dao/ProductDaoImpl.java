package com.cts.product.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Override
	public void saveProduct(Product product) {
		System.out.println("Dao: Saving product "+product.getProdName());
	}
	
	@Override
	public List<Product> listAll(){
		return null;
	}
	
	@Override
	public Product findById(String prodId) {
		return null;
	}
	
	@Override
	public void updateProduct(Product product) {
		
	}
	@Override
	public void removeProduct(Product product) {
		
	}
	@Override
	public void removeProductById(String prodId) {
		
	}
	
	
	@Override
	public List<Product> findProductByName(String prodName){
		
		return null;
	}

}
