package com.sooncode.design_pattern.prototype_pattern.prototype;

import com.sooncode.design_pattern.prototype_pattern.entity.CPU;

public class CPUPrototype implements Prototype<CPU> {

	@Override
	public CPU cloneObject(CPU object) {
		String brand = object.getBrand() != null ? new String(object.getBrand()) : null;
		String version = object.getVersion() != null ? new String(object.getVersion()) : null;
		Double frequency = object.getFrequency() !=null ? new Double(object.getFrequency()) : null;
		CPU cpu = new CPU();
		cpu.setBrand(brand);
		cpu.setFrequency(frequency);
		cpu.setVersion(version);
		return cpu;
	}
 

	 
}
