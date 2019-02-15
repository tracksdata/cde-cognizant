package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(BootJpaApplication.class, args);
		
		Product prod=new Product();
		prod.setProdId("P03");
		prod.setProdName("Mobile");
		prod.setPrice(12500);
		
		ProductService ps=ac.getBean(ProductService.class);
		
		//ps.saveProduct(prod);
		
		for(Product product:ps.listAll()) {
			
			System.out.println(product.getProdId());
			System.out.println(product.getProdName());
			System.out.println(product.getPrice());
			System.out.println("------------------------");
		}
		
		
		
		
		
		
		
		
		
	}

}

