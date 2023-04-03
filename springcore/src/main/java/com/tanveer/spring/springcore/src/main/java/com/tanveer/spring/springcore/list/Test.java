package com.tanveer.spring.springcore.list;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(""
				+ "com/tanveer/spring/springcore/list/listconfig.xml");
//		Hospital hospital  = new Hospital();
//		hospital.setName("ARBA");
//		hospital.setDepartments( List.of("Medicine" ,
//				"Radiology" , "Heart"))
		
		
		//injecting values 
		
		Hospital hospital = (Hospital) context.getBean("hospital");
		
		
		
		
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
	}
}
