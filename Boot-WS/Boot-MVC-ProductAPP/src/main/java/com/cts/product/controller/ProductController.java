package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller("/products")
public class ProductController {

	@Autowired
	private ProductService prodService;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/listAll")
	public ModelAndView listAll() {

		ModelAndView mav = new ModelAndView();

		List<Product> prods = prodService.listAll();

		if (prods.size() != 0) {
			mav.addObject("products", prods);

		} else {
			mav.addObject("msg", "No Products Avialabe");
		}
		
		mav.setViewName("Products");
		
		return mav;
	}

	@RequestMapping("/findProduct")
	public String loadFindProductForm() {
		return "FindProduct";
	}

	@RequestMapping("/findById")
	public ModelAndView findById(@RequestParam("productId") String productId) {

		ModelAndView mav = new ModelAndView();

		String viewName = null;

		Product product = prodService.findById(productId);

		if (product != null) {
			viewName = "Product";
			mav.addObject("product", product);
		} else {
			mav.addObject("msg", "Product Id Does not exists");
			viewName = "FindProduct";
		}

		mav.setViewName(viewName);
		return mav;

	}

	@RequestMapping("/saveProduct")
	public void saveProduct(@ModelAttribute Product product) {
		prodService.updateProduct(product);
	}

	@RequestMapping("/updateProduct")
	public void updateProduct(@ModelAttribute Product product) {
		prodService.updateProduct(product);
	}

	@RequestMapping("/removeById")
	public void removeProductById(@RequestParam("prodId") String productId) {
		prodService.removeById(productId);
	}

	@RequestMapping("/removeProduct")
	public void removeProduct(@ModelAttribute Product product) {
		prodService.removeProduct(product);
	}

}
