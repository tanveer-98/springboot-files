package com.tanveer.spring.springcore.ref;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(""
				+ "com/tanveer/spring/springcore/ref/config.xml");
//		Hospital hospital  = new Hospital();
//		hospital.setName("ARBA");
//		hospital.setDepartments( List.of("Medicine" ,
//				"Radiology" , "Heart"))
		
		
		//injecting values 
		
		Student student = (Student) context.getBean("student");
		
		System.out.println(student);
//		System.out.println(customer.getProducts());
		
	
	}
}