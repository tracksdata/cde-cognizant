package com.cts.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductSDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;
	@Transactional
	public void saveProduct(Product product) {
		Session ses=sf.getCurrentSession();
		ses.save(product);
		System.out.println("Dao: Saved " + product.getProdName() + " to DB");
	}

	@Transactional
	public List<Product> listAll() {
		Session ses=sf.getCurrentSession();
		
		Criteria cr=ses.createCriteria(Product.class);
		return cr.list();
	}

}
