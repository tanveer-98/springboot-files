package com.tanveer.spring.springcore.set;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tanveer/spring/springcore/set/setconfig.xml");
//		Hospital hospital  = new Hospital();
//		hospital.setName("ARBA");
//		hospital.setDepartments( List.of("Medicine" ,
//				"Radiology" , "Heart"))

		// injecting values

		CarDealer cd = (CarDealer) context.getBean("cardealer");

		System.out.println(cd.getName());
		System.out.println(cd.getModels());
	}
}
