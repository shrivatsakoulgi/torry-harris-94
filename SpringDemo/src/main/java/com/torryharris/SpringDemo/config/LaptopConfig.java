package com.torryharris.SpringDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.torryharris.SpringDemo.model.HardDisk;
import com.torryharris.SpringDemo.model.MotherBoard;
import com.torryharris.SpringDemo.model.Processor;
import com.torryharris.SpringDemo.model.RAM;

@Configuration
@ComponentScan(basePackages =
{"com.torryharris.SpringDemo.model"})
public class LaptopConfig {
/*
	@Bean("RAM")
	public RAM getRAM() {
		return new RAM();
	}
	
	@Bean
	public Processor getProcessor() {
		return new Processor();
	}
	
	@Bean
	public HardDisk getHardDisk() {
		return new HardDisk();
	}
	
	@Bean
	public MotherBoard getMotherBoard() {
		return new MotherBoard();
	}
*/
}
