package com.tanveer.spring.springadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = 	
	new ClassPathXmlApplicationContext(""
			+ "com/tanveer/spring/s"
			+ "pringadvanced/"
			+ "standalone/collections/setconfig.xml");
		ProductList pl = (ProductList) context.getBean("productsList");
		System.out.println(pl);
	}

}
