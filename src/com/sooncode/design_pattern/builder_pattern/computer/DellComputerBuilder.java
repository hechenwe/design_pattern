package com.sooncode.design_pattern.builder_pattern.computer;

import java.util.ArrayList;
import java.util.List;

public class DellComputerBuilder implements Builder {

	private CPU cpu;
	private List<Memory> memories;
	private Mainboard mainboard;

	@Override
	public void builderCPU() {
		CPU cpu = new CPU();
		cpu.setBrand("Intel");
		cpu.setFrequency(4.0);
		cpu.setVersion("I7");
		this.cpu = cpu;
	}

	@Override
	public void builderMemory() {
		 
		if (this.mainboard != null) {
			List<Memory> list = new ArrayList<>();
			for (int i = 0; i < this.mainboard.getMemorySize(); i++) {
				Memory m = new Memory();
				m.setBrand("SAMSUNG");
				m.setFrequency(1330.0);
				m.setProducingArea("CHINA");
				list.add(m);
			}
			this.memories = list;
		}
	}

	@Override
	public void builderMainboard() {
		Mainboard m = new Mainboard();
		m.setBrand("Dell");
		m.setMemorySize(6);
		this.mainboard = m;
	}

	@Override
	public Computer builderComputer() {
		Computer c = new Computer();
		c.setCpu(this.cpu);
		c.setMemory(this.memories);
		c.setMainboard(this.mainboard);
		return c;
	}

}
