package com.torryharris.collections.driver;

import java.util.Map;
import java.util.TreeMap;

import com.torryharris.collections.model.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
		
			TreeMap<String,Double> scores = new TreeMap<String, Double>();
			
			scores.put("Amar", 8.7);
			scores.put("Rahul", 9.5);
			scores.put("Disha", 8.9);
			scores.put("Akbar",8.2);
			
			System.out.println(scores);
			for(String key:scores.keySet()) {
				System.out.println("Key:"+key+" Value:"+scores.get(key));
			}
			
			Employee e1 = new Employee(1001, "Ram", "Manager", 100000);
			Employee e2 = new Employee(1020, "Shyam", "Sr. Manager", 80000);
			Employee e3 = new Employee(1010, "Sita", "Architect", 90000);
			Employee e4 = new Employee(1005, "Radha", "Sr. Architect", 130000);
			Employee e5 = new Employee(1005, "Rukmini", "Sr. Architect", 130000);
			
			TreeMap<Employee,String> empNames = new TreeMap<Employee, String>();
			empNames.put(e1, e1.getName());
			empNames.put(e2, e2.getName());
			empNames.put(e3, e3.getName());
			empNames.put(e4, e4.getName());
			empNames.put(e5, e5.getName());
			
			for(Map.Entry<Employee, String> entry:empNames.entrySet()) {
				System.out.println("Key: "+entry.getKey());
				System.out.println("Value:"+entry.getValue());
				System.out.println();
			}
		}

}
