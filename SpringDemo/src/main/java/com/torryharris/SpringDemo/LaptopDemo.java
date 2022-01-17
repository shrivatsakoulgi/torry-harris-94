package com.torryharris.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.SpringDemo.config.LaptopConfig;
import com.torryharris.SpringDemo.model.HardDisk;
import com.torryharris.SpringDemo.model.MotherBoard;
import com.torryharris.SpringDemo.model.RAM;

public class LaptopDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new
				AnnotationConfigApplicationContext(LaptopConfig.class);
		
		
		RAM ram = (RAM)context.getBean("RAM");
		ram.setName("Samsung");
		ram.setCapacity(32);
		HardDisk hd = (HardDisk) context.getBean("hardDisk");
		hd.setCapacity(1000);
		hd.setName("Segate");
		
		MotherBoard mb = context.getBean(MotherBoard.class);
		mb.setName("Asus");
		System.out.println(ram);
		System.out.println(hd);
		System.out.println(mb);
		

	}

}
