package com.sooncode.design_pattern.builder_pattern.computer;
/**
 * 构建过程 
 * @author hechenwe@gmail.com
 *
 */
public class BuilderProcess {

	public static Computer getComputer() {
		Builder builder = new DellComputerBuilder();
		builder.builderMainboard();
		builder.builderMemory();
		builder.builderCPU();
		Computer computer =  builder.builderComputer();
		return computer;
	}
}
