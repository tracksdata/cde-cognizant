package com.pricematrix;

// Dependency
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrix Obj created");
	}
	

	@Override
	public double getItemPrice(String itemCode) {
		// steps to connect with DB and fectch price of a given item
		return 100.00;
	}

}
