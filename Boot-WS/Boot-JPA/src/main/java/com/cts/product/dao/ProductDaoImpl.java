package com.cts.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	@Override
	public void saveProduct(Product product) {

		em.persist(product);

		System.out.println("Dao: Saved " + product.getProdName());
	}

	@Transactional
	@Override
	public List<Product> listAll() {
		Query qry = em.createQuery("from Product");
		return qry.getResultList();
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
