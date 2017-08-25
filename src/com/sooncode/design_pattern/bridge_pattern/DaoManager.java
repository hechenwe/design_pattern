package com.sooncode.design_pattern.bridge_pattern;

import java.util.List;

public class DaoManager<T> implements Dao<T> {

	private Dao<T> dao ;

	@Override
	public int save(T entity) {
		return dao.save(entity);
	}

	@Override
	public int update(T entity) {
		return dao.update(entity);
	}

	@Override
	public int delete(T entity) {
		return dao.delete(entity);
	}

	@Override
	public List<T> get(T entity) {
		return dao.get(entity);
	}

	public Dao<T> getDao() {
		return dao;
	}

	public void setDao(Dao<T> dao) {
		this.dao = dao;
	}
	
	
	
}
