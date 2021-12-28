package com.torryharris.model;

public class Employee {
	private String name;
	private int employeeId;
	private String designation;
	private int salary;
	private int sumInsured;
	
	public Employee(String name, int employeeId, String designation, int salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.designation = designation;
		this.salary = salary;
		sumInsured=0;
		
	}

	public int getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
		System.out.println();
	}
	
	public void incrementSalary(int percentage) {
		salary=salary+(salary*percentage/100);
	}
	
}
