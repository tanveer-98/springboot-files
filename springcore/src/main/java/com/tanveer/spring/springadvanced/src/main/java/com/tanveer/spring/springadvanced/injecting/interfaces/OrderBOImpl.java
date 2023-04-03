package com.tanveer.spring.springadvanced.injecting.interfaces;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeHolder() {
		
		// TODO Auto-generated method stub
		System.out.println("hello");
		dao.createOrder();

	}

}
