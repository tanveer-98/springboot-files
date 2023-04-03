package com.tanveer.spring.springcore.properties;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(""
				+ "com/tanveer/spring/springcore/properties/config.xml");
//		Hospital hospital  = new Hospital();
//		hospital.setName("ARBA");
//		hospital.setDepartments( List.of("Medicine" ,
//				"Radiology" , "Heart"))
		
		
		//injecting values 
		
		CountriesAndLanguages customer = (CountriesAndLanguages) context.getBean("countriesAndLang");
		
		System.out.println(customer);
//		System.out.println(customer.getProducts());
		
		
	}
}