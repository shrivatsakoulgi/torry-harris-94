package com.torryharris.SpringJDBCDemo.dao;

import java.util.List;

import com.torryharris.SpringJDBCDemo.model.Employee;

public interface EmployeeDAO {
	
	Employee getEmployeeById(int empID);
	List<Employee> getAllEmployees();
	boolean insertEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(Employee employee);
	}
