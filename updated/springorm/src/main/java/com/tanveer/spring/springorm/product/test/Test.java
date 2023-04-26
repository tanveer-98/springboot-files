package com.tanveer.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tanveer.spring.springorm.product.dao.ProductDao;
import com.tanveer.spring.springorm.product.entity.Product;



public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = 
		new ClassPathXmlApplicationContext("com/tanveer/spring/springorm/product/test/setconfig.xml");
		// while using annotaions with classes beans are created according to the class Names 
		
		ProductDao productDao = (ProductDao) ctx.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("Apple Macbook");
		product.setDesc("It's awesome");
		product.setPrice(700);
		
		productDao.create(product);
		
		
	}
	

}
