package com.tanveer.spring.springadvanced.injecting.interfaces.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main (String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tanveer/spring/springadvanced/injecting/interfaces/autowired/setconfig.xml");
			
		OrderBO bo = (OrderBO) ctx.getBean("bo");
		
		bo.placeOrder();

		
	}

}
