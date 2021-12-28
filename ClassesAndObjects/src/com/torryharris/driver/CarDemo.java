package com.torryharris.driver;

import com.torryharris.model.Car;

public class CarDemo {

	public static void main(String[] args) {
		
		Car duster = new Car("Duster", "Diesel", 1500, 95.4, "SUV", 5);
		Car nano = new Car("Tata Nano", "Petrol", 640, 60.2, "Mini HatchBack", 4);
		Car nexonEV = new Car("Nexon EV", "Electric", 1000, 70.6, "Mini SUV", 5);
		
		duster.displayFeatures();
		nano.displayFeatures();
		nexonEV.displayFeatures();
		
		nexonEV.accelerate();
		nexonEV.changeGear();
		nexonEV.steer();
		nexonEV.applyBrake();

		System.out.println("Type of car "+nano.getName()+" is "+nano.getCarType());
		
	}
}
