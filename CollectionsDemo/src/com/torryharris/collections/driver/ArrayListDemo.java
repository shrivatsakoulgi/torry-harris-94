package com.torryharris.collections.driver;

import java.util.ArrayList;

import com.torryharris.collections.model.Employee;
import com.torryharris.collections.model.EmployeeSortByNameComparator;
import com.torryharris.collections.model.EmployeeSortBySalaryComparator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		ArrayList<Integer> iList = new ArrayList<>();
//
//		iList.add(40);
//		iList.add(10);
//		iList.add(20);
//		iList.add(30);
//		
//		iList.add(2, 50);
//		
//		System.out.println(iList);
//		iList.sort(null);
//		System.out.println("Integer List after sorting...");
//		System.out.println(iList);
//		
//		
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("Ram");
//		strList.add("Shyam");
//		strList.add("Radha");
//		strList.add("Sita");
//		strList.add("Ram");
//		System.out.println(strList);		// Print at once
//		
//		for(String s: strList) {
//			System.out.println(s);
//		}
//		
//		strList.sort(null);
//		System.out.println("... Sorted Strings...");
//		System.out.println(strList);		
		
		Employee e1 = new Employee(1001, "Ram", "Manager", 100000);
		Employee e2 = new Employee(1002, "Shyam", "Sr. Manager", 80000);
		Employee e3 = new Employee(1003, "Sita", "Architect", 90000);
		Employee e4 = new Employee(1004, "Radha", "Sr. Architect", 130000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(e3);
		empList.add(e1);
		empList.add(e4);
		empList.add(e2);
		
		
		System.out.println("----Employee details----");
		for(Employee e:empList) {
			System.out.println(e);
		}
		System.out.println();
		empList.sort(null);		// Trying to sort Employee List
		System.out.println("----Employee details after "
				+ "sorting by Id----");
		for(Employee e:empList) {
			System.out.println(e);
		}	
		System.out.println(); 		// Sort by Name
		empList.sort(new EmployeeSortByNameComparator());
		System.out.println("----Employee details after"
				+ " sorting by Name----");
		for(Employee e:empList) {
			System.out.println(e);
		}
		
		System.out.println();		// Sort by Salary
		empList.sort(new EmployeeSortBySalaryComparator());
		System.out.println("----Employee details after "
				+ "sorting by Salary----");
		for(Employee e:empList) {
			System.out.println(e);
		}
	}

}
