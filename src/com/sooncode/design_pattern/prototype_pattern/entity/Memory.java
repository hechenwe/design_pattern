package com.sooncode.design_pattern.prototype_pattern.entity;


public class Memory {
	private String brand;
	
	private Double frequency;
	
	private String producingArea;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getFrequency() {
		return frequency;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

	public String getProducingArea() {
		return producingArea;
	}

	public void setProducingArea(String producingArea) {
		this.producingArea = producingArea;
	}

	@Override
	public String toString() {
		return "Memory [brand=" + brand + ", frequency=" + frequency + ", producingArea=" + producingArea + "]";
	}
	
	 
}
