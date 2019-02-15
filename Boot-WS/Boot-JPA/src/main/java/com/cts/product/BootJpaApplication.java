package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(BootJpaApplication.class, args);
		
		Product prod=new Product();
	//	prod.setProductId("P03");
		prod.setProductName("Mobile");
		prod.setPrice(12500);
		
		ProductService ps=ac.getBean(ProductService.class);
		
		ps.saveProduct(prod);
		
		/*
		for(Product product:ps.listAll()) {
			
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
			System.out.println("------------------------");
		}
		*/
		
		
		
		
		
		
		
		
		
	}

}

