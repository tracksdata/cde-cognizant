package com.cts.product.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@RestController
@RequestMapping("/api")
@CrossOrigin
@RefreshScope
public class ProductController {
	
	@Value("${product.discount}")
	private double discount;
	
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping("/products")
	public List<Product> listAll(){
		
		Product p=new Product();
		p.setId(10);
		p.setName("Pen");
		p.setPrice(766);
		p.setImageUrl("Images/one.png");
		p.setDate(new Date());
		p.setDescription("Good");
		//productDao.save(p);
		
		System.out.println("---> Discount: "+discount);
		return  productDao.findAll();
	}

}
