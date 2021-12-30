package com.torryharris.model;

public class Eagle implements Bird {

	@Override
	public void fly() {
		System.out.println("Eagle is Flying High...");

	}

	@Override
	public void eat() {
		System.out.println("Eagle is eating small animals like mice/rat/rabbit...");

	}

}
