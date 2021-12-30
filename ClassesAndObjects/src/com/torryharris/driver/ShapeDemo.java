package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;
public class ShapeDemo {
	public static void main(String[] args) {	
		Triangle t1 = new Triangle(10, 5);
		t1.area();	
		Rectangle r1 = new Rectangle(10, 8);
		r1.area();
		
		Shape s1 = new Triangle(10, 10);
		s1.area();
		
		s1 = new Rectangle(4,7);
		s1.area();
		
	}

}
