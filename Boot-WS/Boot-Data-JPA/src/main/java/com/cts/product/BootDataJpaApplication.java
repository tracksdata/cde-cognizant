package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class BootDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(BootDataJpaApplication.class, args);
		ProductService ps=ac.getBean(ProductService.class);
		
		Product prod=new Product();
		prod.setProductId("P001");
		prod.setProductName("Dell Laptop");
		prod.setPrice(187654);
		
		//ps.saveProduct(prod);
		
		/*
		for(Product p:ps.listAll()) {
			System.out.println(p.getProductId());
			System.out.println(p.getProductName());
			System.out.println(p.getPrice());
			System.out.println("------------------");
		}
		*/
		
	/*	Product p=ps.findById_v1("P001");
		if(p!=null) {
			System.out.println(p.getProductId());
			System.out.println(p.getProductName());
			System.out.println(p.getPrice());
			System.out.println("------------------");
		}else {
			System.out.println("Product id does not exists");
		}
		*/
		
		//Product prod=new Product();
		//prod.setProductId("P001");
		//prod.setProductName("Mac Book Pro");
		//prod.setPrice(250000);
		
		//ps.updateProduct(prod);
		
		//ps.removeProductById("P001");
		//ps.removeProduct(prod);
		
		
	
		/*
		for(Product p:ps.findProductByName("%a%")) {
			System.out.println(p.getProductId());
			System.out.println(p.getProductName());
			System.out.println(p.getPrice());
			System.out.println("------------------");
		}
		*/
		
		for(Product p:ps.findProductByPriceIsGreaterThanEqual(2000)) {
			System.out.println(p.getProductId());
			System.out.println(p.getProductName());
			System.out.println(p.getPrice());
			System.out.println("------------------");
		}
		
	}

}

