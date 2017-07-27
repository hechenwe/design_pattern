package com.sooncode.design_pattern.adapter_pattern.class_adapter;

public interface Dao<T> {

	public int save(T t);
	public int delete(T t);
	public int update(T t);
	public T get(T t);
	
	
	public int getSize(T t);
}
