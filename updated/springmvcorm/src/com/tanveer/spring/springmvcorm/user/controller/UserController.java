package com.tanveer.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tanveer.spring.springmvcorm.user.User;
import com.tanveer.spring.springmvcorm.user.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	private UserService userservice;
	
	
	public UserService getUserservice() {
		return userservice;
	}


	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	
	
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
	
	
	@RequestMapping("getUsers")
	public String getUsers(ModelMap model) {
		List<User> users = userservice.getUsers();
		model.addAttribute("users" , users);
		return "displayUsers";
	}
	
	// @ResponseBody is used to tell it's response to ajax call 
	
	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		User user  = userservice.getUser(id);
		String msg = "";
		
		if(user!=null) {
			msg = id+ "already Exists";
		}
		return msg;
		
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
