package com.pricematrix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.BillingImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		BillingImpl bill=ac.getBean(BillingImpl.class);
		
	//----------------------------------------------------------------
		
		//PriceMatrix price=new PriceMatrixImpl(); // dependency obj
		

		//BillingImpl bill = new BillingImpl(); // dependent obj
		
		//bill.setPrice(price); // DI
	//------------------------------------------------------------	

		double total = bill.getCartPrice(cart1);

		System.out.println("--- Total for Cart1 -v1: " + total);

		total = bill.getCartPrice(cart2);

		System.out.println("--- Total for Cart2 -v1: " + total);

	}

}
