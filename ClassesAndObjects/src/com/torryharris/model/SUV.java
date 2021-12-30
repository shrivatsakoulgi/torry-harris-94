package com.torryharris.model;

public class SUV extends Car {

	private String driveMode;
	private boolean sunRoof;
	
	public SUV() {
		
	}

	public SUV(String name, String fuelType, int engineCapacity, double power, 
			String carType, int noOfGears,String driveMode,boolean sunRoof) {
		super(name, fuelType, engineCapacity, power, carType, noOfGears);
		
		this.driveMode=driveMode;
		this.sunRoof=sunRoof;
	}
	
	public static void anotherMethod() {
		System.out.println("Inside static method of SUV");
	}
	
	public String getDriveMode() {
		return driveMode;
	}

	public void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}
	
	public void suvMethod() {
		System.out.println("Method Exclusively for SUV class");
	}
	
	public void displayFeatures() {
		super.displayFeatures();
		System.out.println("Drive Mode:"+driveMode);
		System.out.println("Sun Roof:"+sunRoof);
		System.out.println();
	}
	
	public void accelerate() {
		if(driveMode.equals("ECO")) {
			System.out.println(this.getName()+" Car is accelerating slowly in "+driveMode+" Mode...");
		}
		else if(driveMode.equals("CITY")) {
			System.out.println(this.getName()+" Car is accelerating moderately in "+driveMode+" Mode...");
		}
		else if(driveMode.equals("SPORTS")) {
			System.out.println(this.getName()+" Car is accelerating rapidly in "+driveMode+" Mode...");
		}
		else {
			System.out.println("Invalid Drive Mode specified...!!");
		}
		
	}
	
	public String toString() {
		return "Car name:"+getName()+"\n"+"Fuel Type:"+getFuelType()+"\n"+
	"Engine Capacity:"+getEngineCapacity()+"\nPower:"+getPower()+"\n"+
				"Car Type:"+getCarType()+"\nNo of Gears:"+getNoOfGears()+"\n"+
				"Drive Mode:"+driveMode+"\nSun Roof:"+sunRoof+"\n";
	}

}
