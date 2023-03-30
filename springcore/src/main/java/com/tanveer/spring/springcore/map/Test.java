package com.tanveer.spring.springcore.map;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(""
				+ "com/tanveer/spring/springcore/map/config.xml");
//		Hospital hospital  = new Hospital();
//		hospital.setName("ARBA");
//		hospital.setDepartments( List.of("Medicine" ,
//				"Radiology" , "Heart"))
		
		
		//injecting values 
		
		Customer customer = (Customer) context.getBean("customer");
		
		
		
		
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
	}
}
