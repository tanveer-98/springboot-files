package com.tanveer.spring.springjdbc;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("" + "com/tanveer/spring/springjdbc/setconfig.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");

		// update

		String sql = "insert into Employee values (?,?,?)";

		int result = jdbcTemplate.update(sql, new Integer(1), "tanveer", "ahmed");

		System.out.println("number of records inserted" + result);
		
		// 

	}

}
