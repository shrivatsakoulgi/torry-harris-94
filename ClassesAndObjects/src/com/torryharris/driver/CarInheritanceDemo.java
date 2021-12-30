package com.torryharris.driver;


import com.torryharris.model.Car;
import com.torryharris.model.HatchBack;
import com.torryharris.model.SUV;
import com.torryharris.model.Sedan;

public class CarInheritanceDemo {
	

	public static void main(String[] args) {
		
		Car car1 =new SUV("Tata Nexon", "Petrol", 1200, 95.3, "SUV", 6, "ECO", true); 
		
		car1.accelerate();
		
		car1.anotherMethod();
	//	car1.suvMethod();
		System.exit(0);
		HatchBack swift = new HatchBack("MS Swift", "Petrol", 1200, 85.4,
				"HatchBack", 5, 21.4);
		
		Sedan verna  = new Sedan("Hyundai Verna", "Petrol", 1500, 97.8,
				"Sedan", 5, 400, "Harman");
		
		swift.displayFeatures();
		//verna.displayFeatures();
		System.out.println(verna);
		
		SUV nexon = new SUV("Tata Nexon", "Petrol", 1200, 95.3, "SUV", 6, "ECO", true);
		nexon.displayFeatures();
		nexon.accelerate();
		nexon.setDriveMode("CITY");
		nexon.accelerate();
		nexon.setDriveMode("SPORTS");
		nexon.accelerate();
		nexon.applyBrake();
		System.out.println(nexon);
		
	}

}
