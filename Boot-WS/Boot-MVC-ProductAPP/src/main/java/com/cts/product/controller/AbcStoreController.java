package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.User;
import com.cts.product.service.UserService;

@Controller
public class AbcStoreController {

	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public String loadRegForm() {
		return "RegistrationPage";
	}

	@RequestMapping("registerUser")
	public String registerUser(@ModelAttribute User user, Model model) {
		User check = userService.findUser(user.getUserId());
		String msg = null;
		if (check == null) {
			userService.saveUser(user);
			msg = "User Registration success";
		} else {
			msg = "User with " + user.getUserId() + " ALready Exists";
		}

		model.addAttribute("msg", msg);

		return "RegistrationPage";
	}

	@RequestMapping("/userLogin")
	public String loadLoginForm() {
		return "LoginForm";
	}

	@RequestMapping(value = "validateUser", method = RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute User user) {
		ModelAndView mav = new ModelAndView();

		
		  String viewName = null; 
		  
		  User u=userService.validateUser(user);
		  if(u!=null) {
			  viewName="Welcome";
			  mav.addObject("user", user);
		  }else {
			 viewName="LoginForm";
			 mav.addObject("msg", "Invalid user Name or Password");
		  }
		  
		  
		  mav.setViewName(viewName);
		 
		return mav;

	}

}
