package com.cts.product.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.product.entity.Product;

public interface ProductDao extends MongoRepository<Product, String> {

}
