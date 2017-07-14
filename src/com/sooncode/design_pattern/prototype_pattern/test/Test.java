package com.sooncode.design_pattern.prototype_pattern.test;

import com.sooncode.design_pattern.prototype_pattern.entity.CPU;
import com.sooncode.design_pattern.prototype_pattern.entity.Computer;
import com.sooncode.design_pattern.prototype_pattern.prototype.ComputerPrototype;

public class Test {

	public static void main(String[] args) {
		CPU cpu = new CPU();
		cpu.setBrand("Intel");
		cpu.setFrequency(34.0);
		cpu.setVersion("I7");
		
		
		Computer c = new Computer();
		c.setCpu(cpu);
		
		
		Computer c2 = new ComputerPrototype().cloneObject(c);
		c2.getCpu().setBrand("AMD");
		System.out.println(  c);
		System.out.println(  c2);
	}
}
