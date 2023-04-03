package com.tanveer.spring.springadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tanveer/spring/springadvanced/stereotype/annotations/setconfig.xml");
		
		Instructor instructor1 = (Instructor) ctx.getBean("instructor");
		
		System.out.println(instructor1);
		

		Instructor instructor2 = (Instructor) ctx.getBean("instructor");
		
		System.out.println(instructor2);
		
		
	}
}	
