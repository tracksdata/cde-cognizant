package com.cts.product.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	
	@Autowired
	private JdbcTemplate jt;

	public void saveProduct(Product product) {
		
		String qry="insert into product values(?,?,?)";
	    jt.update(qry,product.getProductId(),product.getProductName(),product.getPrice());
		
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
