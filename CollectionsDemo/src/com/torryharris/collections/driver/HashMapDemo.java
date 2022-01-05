package com.torryharris.collections.driver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.torryharris.collections.model.Employee;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1001, "Ram");
		hm.put(1002, "Shyam");
		hm.put(1003, "Sita");
		hm.put(1004, "Radha");
		
		System.out.println(hm);
		hm.put(1001, "Lakshman");

		System.out.println("Display using Entry Set...");
		for(Map.Entry<Integer, String> entry:hm.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		
		
		
		HashMap<Integer,Employee> empHashMap = new HashMap<Integer, Employee>();
		Employee e1 = new Employee(1001, "Ram", "Manager", 100000);
		Employee e2 = new Employee(1002, "Shyam", "Sr. Manager", 80000);
		Employee e3 = new Employee(1003, "Sita", "Architect", 90000);
		Employee e4 = new Employee(1004, "Radha", "Sr. Architect", 130000);
		
		empHashMap.put(e1.getEmpId(), e1);
		empHashMap.put(e2.getEmpId(), e2);
		empHashMap.put(e3.getEmpId(), e3);
		empHashMap.put(e4.getEmpId(), e4);
		
		System.out.println("--- using For Each Loop---\n");
		for(Integer key:empHashMap.keySet()) {
			System.out.println("Key = "+key+" Value = "+empHashMap.get(key));
		}
		
		System.out.println("--- Entry Set with Iterator---\n");
		
		Iterator<Map.Entry<Integer,Employee>> itr = empHashMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, Employee> entry = itr.next();
			System.out.println("Key = "+entry.getKey()+" value = "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
