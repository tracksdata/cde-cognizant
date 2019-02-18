package com.cts.product.model;

public class Product {
	
	private String prodId;
	private String prodName;
	private double price;
	private String description;
	private String imagePath;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String prodId, String prodName, double price, String description, String imagePath) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.description = description;
		this.imagePath = imagePath;
	}


	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	

}
