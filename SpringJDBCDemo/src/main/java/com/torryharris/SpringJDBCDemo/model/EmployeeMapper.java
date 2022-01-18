package com.torryharris.SpringJDBCDemo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("emp_id"));
		employee.setName(rs.getString("emp_name"));
		employee.setDesignation(rs.getString("designation"));
		employee.setSalary(rs.getInt("salary"));
		employee.setSumAssured(rs.getInt("sum_assured"));
		return employee;
	}

}
