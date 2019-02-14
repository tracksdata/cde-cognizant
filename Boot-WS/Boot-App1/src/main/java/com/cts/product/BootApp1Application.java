package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootApp1Application {

	public static void main(String[] args) {
	 ApplicationContext ac=	SpringApplication.run(BootApp1Application.class, args);
	 
	 Product product=new Product();
	 product.setProdId("P001");
	 product.setProdName("Laptop");
	 product.setPrice(35600);
	 
	 ProductService ps=ac.getBean(ProductService.class);
	 ps.saveProduct(product);
	 
	 
	 
	 
	}

}

