package com.cts.product.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.ItemLine;

@Repository
public class CarRepositoryImpl implements CartRepository {

	// inject the actual template
	@Autowired
	private RedisTemplate<String, String> template;

	// inject the template as ListOperations
	// can also inject as Value, Set, ZSet, and HashOperations
	@Resource(name = "redisTemplate")
	private ListOperations<String, ItemLine> listOps;

	@Override
	public ItemLine save(String user, ItemLine itemLine) {
		listOps.leftPush(user, itemLine);
		System.out.println("Item(s) saved to redis on key  "+user);
		return itemLine;
	}
	
	public String getMessage(int itemCode) {
		return "No Item Code found in  db with given ItemCode "+itemCode;
	}

	@Override
	public List<ItemLine> findAll(String user) {
		return listOps.range(user, 0, -1);
	}

	@Override
	public void clear(String user) {
		template.delete(user);
	}

}
