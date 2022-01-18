package com.torryharris.SpringJDBCDemo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.torryharris.SpringJDBCDemo.model.Employee;
import com.torryharris.SpringJDBCDemo.model.EmployeeMapper;

@Component
public class EmployeeDAOImpl implements EmployeeDAO{
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_FIND_EMPLOYEE = "select * from employee where emp_id=?";
	private final String SQL_DELETE_EMPLOYEE = "delete from employee where emp_id=?";
	private final String SQL_UPDATE_EMPLOYEE = "update employee set emp_name=?, designation=?,"
			+ "salary=?, sum_assured=? where emp_id=?";
	private final String SQL_GET_ALL_EMPLOYEES = "select * from employee";
	private final String SQL_INSERT_EMPLOYEE = "insert into employee values(?,?,?,?,?)";
	
	@Autowired
	public EmployeeDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	public Employee getEmployeeById(int empID) {
		
	return jdbcTemplate.queryForObject(SQL_FIND_EMPLOYEE, new Object[] {empID},new EmployeeMapper());

	}

	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query(SQL_GET_ALL_EMPLOYEES, new EmployeeMapper());
		
	}
	
	public boolean insertEmployee(Employee employee) {
		return (jdbcTemplate.update(SQL_INSERT_EMPLOYEE,employee.getEmpId(),employee.getName(),employee.getDesignation(),
				employee.getSalary(),employee.getSumAssured())>0);
		
	}

	public boolean updateEmployee(Employee employee) {
		return (jdbcTemplate.update(SQL_UPDATE_EMPLOYEE,employee.getName(),employee.getDesignation(),
				employee.getSalary(),employee.getSumAssured(),employee.getEmpId())>0);
		
	}

	public boolean deleteEmployee(Employee employee) {
		return (jdbcTemplate.update(SQL_DELETE_EMPLOYEE,employee.getEmpId())>0);
		
	}

	
}
