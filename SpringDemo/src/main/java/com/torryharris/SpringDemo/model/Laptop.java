package com.torryharris.SpringDemo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {

	private String name;

	
	private RAM ram;
	private HardDisk hardDisk;
	private MotherBoard motherBoard;
	
	public Laptop() {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}
	
	
}
