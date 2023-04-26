package com.tanveer.spring.springcore.lc.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// AbstractApplicationContext is the superclass of ApplicationContext
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tanveer/spring/springcore/lc/annotations/config.xml");
		
		Patient patient = (Patient)context.getBean("patient");
		
		System.out.println(patient);
		
		context.registerShutdownHook(); // invokes the destroy method
	}
}
 