package com.cts.product.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CartItems")
public class ItemLine implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String user;
	@Id
	private Item item;
	private int qty;
	
	public ItemLine() {
		// TODO Auto-generated constructor stub
	}

	public ItemLine(Item item, int qty) {
		super();
		this.item = item;
		this.qty = qty;
	}
	
	
	
	

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
