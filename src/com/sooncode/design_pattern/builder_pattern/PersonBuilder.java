package com.sooncode.design_pattern.builder_pattern;

public interface PersonBuilder {
	public void buildHead();

	public void buildBody();

	public void buildFoot();

	public Person buildPerson();
}