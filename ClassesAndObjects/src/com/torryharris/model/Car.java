package com.torryharris.model;

public class Car {
	
	
	private String name;
	private String fuelType;
	private int engineCapacity;
	private double power;
	private String carType;
	private int noOfGears;
	

	public Car() {
		
		
	}


	public Car(String name, String fuelType, int engineCapacity, double power, String carType, int noOfGears) {
		System.out.println("Inside Parameterized constructor");
	
		this.name = name;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.power = power;
		this.carType = carType;
		this.noOfGears = noOfGears;
	}
	
	public static void anotherMethod() {
		System.out.println("Inside static method of Car");
	}

	public void displayFeatures() {
		
		System.out.println("Car name:"+name);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Engine Capacity:"+engineCapacity+" CC");
		System.out.println("Power:"+power+" BHP");
		System.out.println("Car Type:"+carType);
		System.out.println("Number of Gears:"+noOfGears);
		
		
	}
	

	public void accelerate() {
		System.out.println(name+" car is acclerating...");
	}

	public void steer() {
		System.out.println(name+" car is changing Directions...");
	}
	
	public void changeGear() {
		System.out.println(name+" car is changing the gears..");
	}

	public void applyBrake() {
		System.out.println(name+" car is slowing down/stopping...");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public int getEngineCapacity() {
		return engineCapacity;
	}


	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}


	public double getPower() {
		return power;
	}


	public void setPower(double power) {
		this.power = power;
	}


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}


	public int getNoOfGears() {
		return noOfGears;
	}


	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
		
	}


	@Override
	public String toString() {
		return " name=" + name + ", fuelType=" + fuelType + ", engineCapacity=" + engineCapacity + ", power="
				+ power + ", carType=" + carType + ", noOfGears=" + noOfGears;
	}


	
}
