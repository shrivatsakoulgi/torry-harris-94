package com.torryharris.SpringDemo.model;

import org.springframework.stereotype.Component;

@Component
public class RAM {
	
	private String name;
	private int capacity;
	public RAM() {
		
	}
	
	public String toString() {	
		return(capacity+"GB DDR5 "+ name +" RAM...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}
