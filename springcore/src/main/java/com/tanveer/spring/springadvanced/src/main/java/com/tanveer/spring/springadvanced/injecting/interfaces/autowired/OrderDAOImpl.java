package com.tanveer.spring.springadvanced.injecting.interfaces.autowired;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl implements OrderDAO {
	
	@Override
	public void createOrder() {
		System.out.println("INSIDE ORDER DAPO IMPLEMANTATION IN CI ");

	}
	

}
