package com.torryharris.SpringDemo.model;

import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	private String name;
	private int capacity;
	
	public HardDisk() {
		
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


	@Override
	public String toString() {
		return "HardDisk [name=" + name + ", capacity=" + capacity + "GB ]";
	}


}
