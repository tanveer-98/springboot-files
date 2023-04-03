package com.tanveer.spring.springcore.lc.annotations.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/// make sure to add dependencies before using javax.annotations
// LC methods using InitializingBean

// to enable these annotations u have to use special bean
public class TicketReservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		System.out.println("Inside Hi Method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye method");
	}

	@Override
	public String toString() {
		return "Ticket  [id=" + id + "]";
	}
	
	

}
