package com.sooncode.design_pattern.adapter_pattern.class_adapter;

public class CommonDao<T>  {  //由于某种原因,不能实现 Dao 接口, 
 
	public int save(T t) {
		return 0;
	}

	 
	public int delete(T t) {
		return 0;
	}

	 
	public int update(T t) {
		return 0;
	}

	public T get(T t) {
		return t;
	}
	 
}
