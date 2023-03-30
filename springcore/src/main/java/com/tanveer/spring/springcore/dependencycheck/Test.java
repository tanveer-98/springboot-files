package com.tanveer.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// AbstractApplicationContext is the superclass of ApplicationContext
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(""
						+ "com/tanveer/spring/springcore/dependencycheck/config.xml");
		
		Prescription pres = (Prescription )context.getBean("prescription");
		
		System.out.println(pres);
		
//		context.registerShutdownHook(); // invokes the destroy method
	}
}
 