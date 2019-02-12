package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.product.model.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		Product prod=new Product();
		prod.setPrice(747);
		prod.setProductId("P001");
		prod.setProductName("Mouse");
		
		//--------------------------------
		
		ProductService ps=ac.getBean(ProductService.class);
		
		ps.persistProduct(prod);
		
		ps.displayAll();
		ps.find("P001");
		ps.remove("P002");
		
		
		
	}

}
