package com.cts.product.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	private ProductServiceImpl ps;

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
		
		ps.saveProduct();

		mav.addObject("user", "Ozvitha");

		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
