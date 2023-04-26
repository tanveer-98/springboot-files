package com.tanveer.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main (String[] args) {
		ClassPathXmlApplicationContext ctx  = new ClassPathXmlApplicationContext("config.xml");
//		Object emp =  ctx.getBean("emp"); // Default it returns an object 
		
		Employee emp = (Employee) ctx.getBean("emp");
//		NOte getBean is case Sensitive
		
		System.out.println("employee id : " + emp.getId());
		System.out.println("employee name : "+ emp.getName());
		
		
	}
}
