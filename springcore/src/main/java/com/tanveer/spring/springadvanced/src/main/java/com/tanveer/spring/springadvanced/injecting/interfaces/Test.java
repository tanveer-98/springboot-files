package com.tanveer.spring.springadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main (String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tanveer/spring/springadvanced/injecting/interfaces/setconfig.xml");
			
		OrderBO bo = (OrderBO) ctx.getBean("bo");
		
		bo.placeHolder();

		
	}

}
