package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootJdbcTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(BootJdbcTemplateApplication.class, args);
		
		 Product product=new Product();
		 product.setProdId("P02");
		 product.setProdName("Mobile");
		 product.setPrice(135600);
		 
		 ProductService ps=ac.getBean(ProductService.class);
		 
		 ps.saveProduct(product);
	}

}

