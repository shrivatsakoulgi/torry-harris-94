package com.torryharris.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.SpringDemo.config.LaptopConfig;
import com.torryharris.SpringDemo.model.HardDisk;
import com.torryharris.SpringDemo.model.Laptop;
import com.torryharris.SpringDemo.model.MotherBoard;
import com.torryharris.SpringDemo.model.RAM;

public class LaptopDemo2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfig.class);
		
		Laptop hp = new Laptop();
		hp.setHardDisk(context.getBean(HardDisk.class));
		hp.setRam(context.getBean(RAM.class));
		hp.setMotherBoard(context.getBean(MotherBoard.class));
		
		hp.setName("HP Pavilion");
		hp.getRam().setCapacity(8);
		hp.getRam().setName("TerraByte");
		
		hp.getHardDisk().setName("WD Elements");
		hp.getHardDisk().setCapacity(2048);
		
		hp.getMotherBoard().setName("Intel");
		
		System.out.println("Laptop Details...");
		System.out.println("Name:"+hp.getName());
		System.out.println("RAM: "+hp.getRam());
		System.out.println("Hard Disk:"+hp.getHardDisk());
		System.out.println("Mother Board:"+hp.getMotherBoard());
		System.out.println();
		
		Laptop asus = new Laptop();
		asus.setHardDisk(context.getBean(HardDisk.class));
		asus.setRam(context.getBean(RAM.class));
		asus.setMotherBoard(context.getBean(MotherBoard.class));
		
		asus.setName("ASUS VM");
		asus.getRam().setCapacity(16);
		asus.getRam().setName("Samsung");
		
		asus.getHardDisk().setName("Segate");
		asus.getHardDisk().setCapacity(4096);
		
		asus.getMotherBoard().setName("Asus");
		
		System.out.println("Laptop Details...");
		System.out.println("Name:"+asus.getName());
		System.out.println("RAM: "+asus.getRam());
		System.out.println("Hard Disk:"+asus.getHardDisk());
		System.out.println("Mother Board:"+asus.getMotherBoard());

	}

}
