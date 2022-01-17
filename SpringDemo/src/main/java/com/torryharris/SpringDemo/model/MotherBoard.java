package com.torryharris.SpringDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MotherBoard {
	
	@Autowired
	private Processor processor;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MotherBoard() {
		
	}
	
	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public String toString() {
		
		return(name+" Mother board .."+processor.toString());
	}
	
}
