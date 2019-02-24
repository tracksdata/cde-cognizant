package com.cts.product.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.product.entity.ItemLine;

public interface ItemLineDao extends MongoRepository<ItemLine, Integer>{

}
