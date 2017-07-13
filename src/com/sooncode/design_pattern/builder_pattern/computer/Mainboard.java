package com.sooncode.design_pattern.builder_pattern.computer;

public class Mainboard {

	private String brand;
	
	private Integer memorySize;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
	}

	@Override
	public String toString() {
		return "Mainboard [brand=" + brand + ", memorySize=" + memorySize + "]";
	}
	
	Mainboard(){
		
	}
	 
}
