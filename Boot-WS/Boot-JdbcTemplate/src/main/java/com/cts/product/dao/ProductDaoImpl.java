package com.cts.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jt;

	@Override
	public void saveProduct(Product product) {
		String qry = "insert into product values(?,?,?)";
		jt.update(qry, product.getProdId(), 
				product.getProdName(), 
				product.getPrice());
		
		System.out.println("Dao: Saved " + product.getProdName());
	}

	@Override
	public List<Product> listAll() {
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
	public List<Product> findProductByName(String prodName) {

		return null;
	}

}
