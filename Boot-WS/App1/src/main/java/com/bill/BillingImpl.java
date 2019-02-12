package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

//Dependent
@Service("billing")
public class BillingImpl {

	/*
	 * Design Issues 1. too many dependency obj creations. --> memory management -->
	 * per issues
	 * 
	 * Why these issues happened? -------------------------------
	 * 
	 * --> dependent class itself creating dependency class object
	 * 
	 * What is the solution? --------------------------
	 * 
	 * -> Do not create dependency object in the dependent class
	 * 
	 * -> Do not create, insted find it from any other source like JNDI
	 * 
	 * -> JNDI location is tightky binded with dependenct class
	 * 
	 * What is the Best solution? ------------------------------ -> Do not create,
	 * do not find, insted ask some one (IoC)
	 * 
	 * Dependecny Injection ------------------------ -> Injecting a depedency to a
	 * dependent. (DI)
	 * 
	 * 1. setter based 2. constructor based
	 * 
	 * 
	 * 
	 */

	@Autowired
	private PriceMatrix price;

	

	public double getCartPrice(String[] cart) {

		// PriceMatrix price = new PriceMatrixImpl();

		double total = 0.0;

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}
		return total;
	}

}
