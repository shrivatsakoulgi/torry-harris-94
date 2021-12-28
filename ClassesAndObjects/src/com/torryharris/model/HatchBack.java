package com.torryharris.model;

public class HatchBack extends Car{

	private double mileage;
		
	public HatchBack() {
		super();
		
	}

	public HatchBack(String name, String fuelType, int engineCapacity,
			double power, String carType, int noOfGears, double mileage) {
		super(name, fuelType, engineCapacity, power, carType, noOfGears);
		
		this.mileage=mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
}
