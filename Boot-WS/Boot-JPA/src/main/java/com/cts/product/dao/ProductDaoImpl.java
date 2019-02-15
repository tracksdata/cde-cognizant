package com.cts.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
@Transactional()
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	@Override
	public void saveProduct(Product product) {

		em.persist(product);

		System.out.println("Dao: Saved " + product.getProductName());
	}

	@Transactional
	@Override
	public List<Product> listAll() {
		Query qry = em.createQuery("from Product");
		return qry.getResultList();
	}

	@Override
	@Transactional
	public Product findById(String prodId) {
		return em.find(Product.class, prodId);
	}

	@Override
	public void updateProduct(Product product) {
			em.merge(product);
	}

	@Override
	public void removeProduct(Product product) {

		em.remove(product);
	}

	@Override
	public void removeProductById(String prodId) {
		Product prod=em.find(Product.class, prodId);
		if(prod!=null) {
			em.remove(prod);
		}
	}

	@Override
	public List<Product> findProductByName(String prodName) {

		String q1="select prod.id,prod.product_name,prod.price "
				+ "from Product as prod where prod.product_name "
				+ "like %"+prodName+"%";
		Query qry=em.createQuery(q1);
		return qry.getResultList();
	}

}
