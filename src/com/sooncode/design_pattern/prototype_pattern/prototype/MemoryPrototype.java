package com.sooncode.design_pattern.prototype_pattern.prototype;

import com.sooncode.design_pattern.prototype_pattern.entity.Memory;

public class MemoryPrototype implements Prototype<Memory> {

	@Override
	public Memory cloneObject(Memory object) {
	String brand = 	object.getBrand() == null ? null : new String(object.getBrand());
	Double frequency = 	object.getFrequency() == null ? null : new Double(object.getFrequency());
	String producingArea = 	object.getProducingArea() == null ? null :new String(object.getProducingArea());
	Memory m = new Memory();
	m.setBrand(brand);
	m.setFrequency(frequency);
	m.setProducingArea(producingArea);
	return m;
	
	}
 

	 
}
