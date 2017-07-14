package com.sooncode.design_pattern.prototype_pattern.prototype;

import java.util.ArrayList;
import java.util.List;

import com.sooncode.design_pattern.prototype_pattern.entity.CPU;
import com.sooncode.design_pattern.prototype_pattern.entity.Computer;
import com.sooncode.design_pattern.prototype_pattern.entity.Mainboard;
import com.sooncode.design_pattern.prototype_pattern.entity.Memory;

public class ComputerPrototype implements Prototype<Computer> {

	@Override
	public Computer cloneObject(Computer computer) {

		CPU cpu = new CPUPrototype().cloneObject(computer.getCpu());
		List<Memory> list = null;
		if (computer.getMemory() != null) {
			for (Memory m : computer.getMemory()) {
				Memory mem = new MemoryPrototype().cloneObject(m);
				list = new ArrayList<>();
				list.add(mem);
			}
		}
		Mainboard mb = new MainboardPrototype().cloneObject(computer.getMainboard());
		Computer c = new Computer();
		c.setCpu(cpu);
		c.setMainboard(mb);
		c.setMemory(list);
		return c;
	}

}
