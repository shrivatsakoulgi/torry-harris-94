package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.Insurance;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee ram = new Employee("Ram", 1001, "Manager", 50000);
		Employee shyam = new Employee("Shyam", 1002, "Architect", 55000);
		Employee sita = new Employee("Sita", 1003, "Sr. Manager", 52000);
		Employee radha = new Employee("Radha", 1004, "Tech Lead", 40000);
		
		ram.display();
		shyam.display();
		sita.display();
		radha.display();
		
		Insurance lic = new Insurance("LIC", "Term");
		Insurance mediBuddy = new Insurance("Medi Buddy", "Health");
		Insurance vidal = new Insurance("Vidal", "Accident");

		lic.assignInsurance(ram);
		mediBuddy.assignInsurance(shyam);
		vidal.assignInsurance(radha);
		
		System.out.println("Sum assured for "+ram.getName()+
				" is: "+ram.getSumInsured());
		
		System.out.println("Sum assured for "+shyam.getName()+
				" is: "+shyam.getSumInsured());
		System.out.println("Sum assured for "+radha.getName()+
				" is: "+radha.getSumInsured());

	}

}
