package com.torryharris.driver;

import com.torryharris.model.Box;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box b1=new Box(5,6,7);
		Box b2=new Box(10,20,30);
		Box b3=new Box(10,11,12);
		System.out.println("Hashcode of b1:"+b1.hashCode());
		System.out.println("Hashcode of b2:"+b2.hashCode());
		System.out.println("Hashcode of b3:"+b3.hashCode());
		
		System.out.println("Volume of Box b1 is:"+b1.getVolume());
		System.out.println("Volume of Box b2 is:"+b2.getVolume());
		System.out.println("Volume of Box b3 is:"+b3.getVolume());
	}
}
