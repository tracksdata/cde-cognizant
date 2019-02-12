package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.JavaConfig;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		//ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
		
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
