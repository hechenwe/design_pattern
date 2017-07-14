package com.sooncode.design_pattern.prototype_pattern.entity;

public class CPU {

	private Double frequency;
	private String brand;
	private String version;
	public Double getFrequency() {
		return frequency;
	}
	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "CPU [frequency=" + frequency + ", brand=" + brand + ", version=" + version + "]";
	}
	
	 
}
