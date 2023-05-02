package com.tanveer.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tanveer.spring.springmvc.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView  = new ModelAndView();
		
		modelAndView.setViewName("displayList");
		
		Employee employee  = new Employee();
		employee.setId(1);
		employee.setName("Tanveer Ahmed");
		employee.setSalary(810000);
		

		Employee employee1  = new Employee();
		employee1.setId(2);
		employee1.setName("bishwaraj Paul");
		employee1.setSalary(802000);
		
		
		

		Employee employee2  = new Employee();
		employee2.setId(3);
		employee2.setName("Aniket Paul");
		employee2.setSalary(800100);
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee);
		employeeList.add(employee1);
		employeeList.add(employee2);
		
		modelAndView.addObject("employees" , employeeList);
		
		return modelAndView;
	}

}
