package com.tanveer.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tanveer.spring.springjdbc.employee.dao.EmployeeDao;
import com.tanveer.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.tanveer.spring.springjdbc.employee.dto.Employee;


@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into employee values(?,?,?)";

		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update employee set fname=? , lname=? where id=?";

		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(),employee.getId());

		return result;
	}
	
	@Override
	public int delete(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "delete from  employee where id=?";

		int result = jdbcTemplate.update(sql,employee.getId());

		return result;
	}

	@Override
	public Employee read(int id) {
		System.out.println("inside employee read");
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowMapper, id);	
		return emp;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> emps = jdbcTemplate.query(sql,rowMapper);
		return emps;
	}



	

}
