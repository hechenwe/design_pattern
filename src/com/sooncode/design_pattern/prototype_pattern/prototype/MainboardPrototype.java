package com.sooncode.design_pattern.prototype_pattern.prototype;

import com.sooncode.design_pattern.prototype_pattern.entity.Mainboard;

public class MainboardPrototype implements Prototype<Mainboard> {

	@Override
	public Mainboard cloneObject(Mainboard object) {
		if(object == null) {
			return null;
		}
		
		String brand = object.getBrand() == null ? null : new String(object.getBrand());
		Integer memorySize = object.getMemorySize() == null ? null : new Integer(object.getMemorySize());
		
		Mainboard m = new Mainboard();
		m.setBrand(brand);
		m.setMemorySize(memorySize);
		return m ;
		
	}
 

	 
}
