package com.torryharris.driver;

import com.torryharris.model.HatchBack;
import com.torryharris.model.Sedan;

public class CarInheritanceDemo {

	public static void main(String[] args) {
		
		HatchBack swift = new HatchBack("MS Swift", "Petrol", 1200, 85.4,
				"HatchBack", 5, 21.4);
		
		Sedan verna  = new Sedan("Hyundai Verna", "Petrol", 1500, 97.8,
				"Sedan", 5, 400, "Harman");
		
		swift.displayFeatures();
		verna.displayFeatures();
				

	}

}
