package com.sooncode.design_pattern.prototype_pattern.entity;

import java.util.List;

public class Computer {
	private CPU cpu;

	private List<Memory> memory;

	private Mainboard mainboard;

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	 

	public List<Memory> getMemory() {
		return memory;
	}

	public void setMemory(List<Memory> memory) {
		this.memory = memory;
	}

	public Mainboard getMainboard() {
		return mainboard;
	}

	public void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}

	 
 
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", memory=" + memory + ", mainboard=" + mainboard + "]";
	};

	
}
