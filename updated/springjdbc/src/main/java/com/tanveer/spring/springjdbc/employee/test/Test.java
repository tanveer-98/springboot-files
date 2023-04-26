package com.tanveer.spring.springjdbc.employee.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import com.tanveer.spring.springjdbc.employee.dao.EmployeeDao;
import com.tanveer.spring.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/tanveer/spring/springjdbc/employee/test/config_autowire.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");

		// update

		Employee employee = new Employee();
		employee.setFirstName("Tanveeasdasdsd");
		employee.setLastName("Ahmed");
		employee.setId(3);
//		
//		int result = dao.create(employee);	
//		int updatedRows = dao.update(employee);
//		System.out.println("number of records inserted:  " + updatedRows);
//		 
//		int deletedRows = dao.delete(employee);
//		Employee emp = dao.read(1);
		
		List<Employee> emps = dao.read();
		
//		System.out.println("number of records inserted:  " + deletedRows);
		for(Employee x : emps) {
			
			System.out.println("employee details" + x.getFirstName() + " : "+ x.getLastName());
		}
		
		// 

	}

}
