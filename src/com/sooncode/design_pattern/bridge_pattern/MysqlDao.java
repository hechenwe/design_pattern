package com.sooncode.design_pattern.bridge_pattern;

import java.util.List;

public class MysqlDao<T> implements Dao<T>{

	@Override
	public int save(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> get(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

 

}
