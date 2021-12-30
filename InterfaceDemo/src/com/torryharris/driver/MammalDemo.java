package com.torryharris.driver;

import com.torryharris.model.Cow;
import com.torryharris.model.Mammal;
import com.torryharris.model.Tiger;

public class MammalDemo {

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		cow.eat();
		cow.feed();
		
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.feed();
		System.out.println();
		
		Mammal m = new Cow();
		m.eat();
		m.feed();
		
		m = new Tiger();
		m.eat();
		m.feed();
		
		

	}

}
