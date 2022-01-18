package com.torryharris.SpringJDBCDemo.model;

public class Employee {
	
	private int empId;
	private String name;
	private String designation;
	private int salary;
	private int sumAssured;
	
	public Employee() {
	}

	public Employee(int empId, String name, String designation, int salary, int sumAssured) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.sumAssured = sumAssured;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", sumAssured=" + sumAssured + "]";
	}
	
	

}
