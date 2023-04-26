package com.tanveer.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// controller bean
// process the incoming http requests 

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		modelAndView.addObject("id" , 123);
		modelAndView.addObject("name" , "Bharath");
		modelAndView.addObject("salary" , 10000);
		
		
		
		return modelAndView;
		
	}
}
