package com.torryharris.model;

public class Sedan extends Car {

	private int bootSpace;
	private String musicSystem;
	
	public Sedan() {
		
	}

	public Sedan(String name, String fuelType, int engineCapacity,double power,
			String carType, int noOfGears,int bootSpace,String musicSystem ) {
		
		super(name, fuelType, engineCapacity, power, carType, noOfGears);
		
		this.bootSpace=bootSpace;
		this.musicSystem=musicSystem;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	
	public void displayFeatures() {
		super.displayFeatures();
		System.out.println("Boot Space:"+bootSpace+" Litres");
		System.out.println("Music System:"+musicSystem);
		System.out.println();
	}

	@Override
	public String toString() {
		
		return " Sedan ["+super.toString()+" bootSpace=" + bootSpace + ", musicSystem=" + musicSystem + "]";
	}
	
	

}
