package com.sooncode.design_pattern.builder_pattern;

public class WomanBuilder implements PersonBuilder {
	Person person;

	public WomanBuilder() {
		person = new Woman();
	}

	public void buildBody() {
		person.setBody("����Ů�˵�����");
	}

	public void buildFoot() {
		person.setFoot("����Ů�˵Ľ�");
	}

	public void buildHead() {
		person.setHead("����Ů�˵�ͷ");
	}

	public Person buildPerson() {
		return person;
	}

}