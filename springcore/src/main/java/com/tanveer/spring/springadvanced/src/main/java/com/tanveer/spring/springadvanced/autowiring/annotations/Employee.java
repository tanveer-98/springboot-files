package com.tanveer.spring.springadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int id ; 

	
	//Autowiring at field level
	
	// we can use qualifier annotation to say the tell the container too choose any particular bean 
	
	
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	
	// autowiring at setter level 
	
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address.getCity() + "]";
	}
}
