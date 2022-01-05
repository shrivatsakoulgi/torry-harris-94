package com.torryharris.collections.driver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.torryharris.collections.model.Employee;

public class HashSetDemo {
	
	public static void main(String []args) {
		
		HashSet<Integer> intHs=  new HashSet<Integer>();	
		intHs.add(10);
		intHs.add(20);
		intHs.add(50);
		intHs.add(40);
		intHs.add(10);
		System.out.println(intHs);
		
		HashSet<String> strHashSet = new HashSet<String>();
		
		strHashSet.add("Hello");
		strHashSet.add("Good");
		strHashSet.add("Afternoon");
		strHashSet.add("Everyone");
		strHashSet.add("Everyone");
		System.out.println(strHashSet);
		
		for(String str:strHashSet) {
			System.out.println(str);
		}
			
		System.out.println("--- Using Iterator ---");
		
		Iterator<String> itr = strHashSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// HashSet of Employees
		
		HashSet<Employee> empHashSet = new HashSet<Employee>();
		
		Employee e1 = new Employee(1001, "Ram", "Manager", 100000);
		Employee e2 = new Employee(1012, "Shyam", "Sr. Manager", 80000);
		Employee e3 = new Employee(1025, "Sita", "Architect", 90000);
		Employee e4 = new Employee(1004, "Radha", "Sr. Architect", 130000);
		Employee e5 = new Employee(1004, "Radha", "Sr. Architect", 130000);
		
		empHashSet.add(e1);
		empHashSet.add(e2);
		empHashSet.add(e3);
		empHashSet.add(e4);
		empHashSet.add(e5);
		
		System.out.println("e4 Hashcode:"+e4.hashCode());
		System.out.println("e5 Hashcode:"+e5.hashCode());
		System.out.println("--- Employee data using Iterator---");
		Iterator<Employee> empItr = empHashSet.iterator();
		
		while(empItr.hasNext()) {
			System.out.println(empItr.next());
		}
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		lhs.add(100);
		lhs.add(50);
		lhs.add(200);
		lhs.add(90);
		lhs.add(500);
		lhs.add(100);
		
		System.out.println("---Linked Hash Set---");
		System.out.println(lhs);
		
	}

}
