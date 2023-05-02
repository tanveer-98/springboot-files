package com.tanveer.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tanveer.spring.springmvc.dto.User;

@Controller
public class UserController {
	
	
	// using modelAndView
//	@RequestMapping("/userReg")
//	public ModelAndView showRegistrationPage() {
//		ModelAndView modelView = new ModelAndView();		
//		modelView.setViewName("userReg");
//		return modelView;
//	}
	
	// using model and Map 
	
	@RequestMapping("registrationPage") // /registration
	public  String showRegistrationPage() {
		return "userReg";
	}
	
	
//	
	/// what is ModelAttribute ? 
//	@RequestMapping(value="registerUser" , method=RequestMethod.POST)
//	public ModelAndView registerUser(@ModelAttribute("user") User user) {
//		
//		System.out.println(user);
//		ModelAndView mv = new ModelAndView(); 
//		mv.setViewName("regResult");
//		return mv; 
//	}
	
	// Using Model -  Map
	
	
	@RequestMapping(value = "registerUser" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user , ModelMap model ) {
		
	  System.out.println(user);
	  model.addAttribute("user" , user);
	  
	  
		return "regResult";
		
	}
	
}
