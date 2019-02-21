package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.ItemLine;

public interface CartRepository {

	ItemLine save(String user, ItemLine itemLine);

	List<ItemLine> findAll(String user);
	
	void clear(String user);

}
