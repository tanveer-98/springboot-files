package com.tanveer.spring.springadvanced.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/tanveer/spring/springcore/propertyplaceholder/setconfig.xml");
		
		MyDAO dao = (MyDAO)		ctx.getBean("myDAO");
    	System.out.println(dao);
    	
    	
				
	}
}
