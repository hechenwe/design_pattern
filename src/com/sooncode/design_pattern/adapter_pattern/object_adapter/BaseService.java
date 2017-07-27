package com.sooncode.design_pattern.adapter_pattern.object_adapter;

public class BaseService<T>  implements Service<T>  {

	//用 Spring 注入一下
	private CommonDao<T> commonDao;
	
	@Override
	public int getSize(T t) {
		return 0;
	}

	@Override
	public int save(T t) {
		return commonDao.save(t);
	}

	@Override
	public int delete(T t) {
		 
		return commonDao.delete(t);
	}

	@Override
	public int update(T t) {
		 
		return commonDao.update(t);
	}

	@Override
	public T get(T t) {
		return commonDao.get(t);
	}
	
}
