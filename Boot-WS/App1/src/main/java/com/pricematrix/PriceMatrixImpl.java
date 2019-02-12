package com.pricematrix;

import org.springframework.stereotype.Repository;

// Dependency
@Repository("priceMatrix")
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrix Obj created");
	}
	

	
	public double getItemPrice(String itemCode) {
		// steps to connect with DB and fectch price of a given item
		return 100.00;
	}

}
