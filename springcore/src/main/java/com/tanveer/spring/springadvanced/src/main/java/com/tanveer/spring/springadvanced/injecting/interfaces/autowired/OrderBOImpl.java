package com.tanveer.spring.springadvanced.injecting.interfaces.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOImpl implements OrderBO {

	@Autowired
	private OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		
		// TODO Auto-generated method stub
		System.out.println("hello");
		dao.createOrder();

	}

}
