package com.cts.product.entity;

import java.io.Serializable;

public class ItemLine implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
