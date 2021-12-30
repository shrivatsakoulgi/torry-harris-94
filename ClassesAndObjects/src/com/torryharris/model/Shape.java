package com.torryharris.model;

public abstract class Shape {
	private int noOfSides;
	
	public abstract void area();	//abstract method
	
	public int getNoOfSides() {		//Concrete method
		return noOfSides;
	}
	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
		

}
