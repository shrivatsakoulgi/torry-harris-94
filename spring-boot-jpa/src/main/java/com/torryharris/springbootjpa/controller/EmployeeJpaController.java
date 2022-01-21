package com.torryharris.springbootjpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.torryharris.springbootjpa.model.Employee;
import com.torryharris.springbootjpa.repository.EmployeeRepository;

@RestController
public class EmployeeJpaController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/jpa/employees")
	public ArrayList<Employee> getAllEmployees(){
		ArrayList<Employee> empList = new ArrayList<>();
		for(Employee emp:employeeRepository.findAll()) {
			empList.add(emp);
		}
		return empList;
	}
	
	@GetMapping("/jpa/employee/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
			return employeeRepository.findById(empId).get();
	}
	
	@PostMapping("/jpa/add_employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		System.out.println(employee);
		System.out.println("Inserted successfully...!!!");
	}
	
	
	
	
	
	
	
	
	
	
}
