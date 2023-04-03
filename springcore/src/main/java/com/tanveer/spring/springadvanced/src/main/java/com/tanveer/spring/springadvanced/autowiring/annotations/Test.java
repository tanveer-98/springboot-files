package com.tanveer.spring.springadvanced.autowiring.annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/tanveer/spring/springadvanced/autowiring/annotations/setconfig.xml");
		
    	Employee e = (Employee) ctx.getBean("employee");
    	System.out.println(e);
				
	}
}
