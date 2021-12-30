package com.torryharris.model;

public class Bat implements Mammal,Bird{

	@Override
	public void fly() {
		System.out.println("Bats fly in the Caves...");
		
	}

	@Override
	public void eat() {
		System.out.println("Bats eat small insects...");
		
	}

	@Override
	public void feed() {
		System.out.println("Bats feed their children...");
		
	}

}
