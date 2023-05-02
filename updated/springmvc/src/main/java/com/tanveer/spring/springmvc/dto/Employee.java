package com.tanveer.spring.springmvc.dto;

import java.util.*;


public class Employee {
	private int id ; 
	private String name; 
	private double salary;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
