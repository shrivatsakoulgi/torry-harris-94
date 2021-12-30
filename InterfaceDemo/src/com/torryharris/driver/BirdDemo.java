package com.torryharris.driver;

import com.torryharris.model.Bird;
import com.torryharris.model.Eagle;
import com.torryharris.model.Pigeon;

public class BirdDemo {

	public static void main(String[] args) {
		
		Bird bird = new Pigeon();
		bird.fly();
		bird.eat();
		System.out.println();
		
		bird = new Eagle();
		bird.fly();
		bird.eat();
		

	}

}
