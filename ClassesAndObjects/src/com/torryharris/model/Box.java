package com.torryharris.model;

public class Box {

	private int length;
	private int width;
	private int height;
	
	public Box() {
		System.out.println("Inside Constructot of Box");
	}
	
	public Box(int length,int width,int height) {
		System.out.println
		("Inside Parameterized Constructor of Box");
		this.length=length;
		this.width=width;
		this.height=height;	
	}
	

	public void display() {
		System.out.println("Box length:"+length);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
	}
	
	public int getVolume() {
		return length*width*height;
	}
}
