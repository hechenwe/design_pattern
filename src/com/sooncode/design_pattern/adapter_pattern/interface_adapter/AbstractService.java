package com.sooncode.design_pattern.adapter_pattern.interface_adapter;

public abstract class AbstractService<T>  implements Service<T> {

	
	
	@Override
	public int save(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	 

}
