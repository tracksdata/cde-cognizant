package com.cts.product.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping("d1")
	public void f1() {
		System.out.println("---- ProductController f1 git executed");
	}

	@RequestMapping("d2")
	public String f2() {
		System.out.println("---- ProductController f2 git executed");
		return "test";
	}

	@RequestMapping("d3")
	public String f3(Model model) {
		System.out.println("---- ProductController f3 git executed");
		model.addAttribute("user", "Praveen");
		return "display";
	}
	
	/*
	void demo(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("user", "Ozvitja");
		RequestDispatcher rd=request.getRequestDispatcher("/display.jsp");
		rd.forward(request, response);
	}
	*/

	@RequestMapping("d4")
	public ModelAndView f4() {
		

		ModelAndView mav = new ModelAndView();
		mav.setViewName("display");
		
		Product prod=new Product();
		prod.setProdId("P001");
		prod.setProdName("Laptop");
		prod.setPrice(6554);
		
		ps.saveProduct(prod);

		mav.addObject("user", "Ozvitha");

		return mav;
	}
	
	
	@RequestMapping("loadForm")
	public String loadForm() {
		return "form";
	}
	
	
	@RequestMapping("saveProduct")
	public String saveProduct(@RequestParam("prodId") String pid,@RequestParam("prodName")String pname,@RequestParam("price")double price) {
		
		Product prod=new Product();
		prod.setProdId(pid);
		prod.setProdName(pname);
		prod.setPrice(price);
		
        ps.saveProduct(prod);		
		
		return "redirect:/";
	}
	
	@RequestMapping("saveProduct_v1")
	public String saveProduct_v1(@ModelAttribute Product prod,Model model) {
		
		ps.saveProduct(prod);
		model.addAttribute("product",prod);
		
		return "redirect:/loadAll";
	}
	
	
	@RequestMapping("loadAll")
	public String loadAll(Model model) {
		
		List<Product> prods=ps.listAll();
		System.out.println(prods);
		model.addAttribute("products",prods);
		
		
		return "products";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
