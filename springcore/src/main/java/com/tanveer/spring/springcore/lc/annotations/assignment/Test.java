package com.tanveer.spring.springcore.lc.annotations.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		// AbstractApplicationContext is the superclass of ApplicationContext
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tanveer/spring/springcore/lc/annotations/assignment/config.xml");
		
		TicketReservation ticket = (TicketReservation)context.getBean("ticketreservation");
		
		System.out.println(ticket);
		
		context.registerShutdownHook(); // invokes the destroy method
	}
}
 