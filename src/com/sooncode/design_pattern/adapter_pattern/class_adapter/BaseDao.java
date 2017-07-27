package com.sooncode.design_pattern.adapter_pattern.class_adapter;

public class BaseDao<T> extends CommonDao<T> implements Dao<T>  {

	@Override
	public int getSize(T t) {
		return 0;
	}
	
}
