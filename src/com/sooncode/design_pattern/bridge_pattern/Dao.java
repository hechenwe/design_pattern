package com.sooncode.design_pattern.bridge_pattern;

import java.util.List;

public interface Dao<T> {

	public int save(T entity);
	public int update(T entity);
	public int delete(T entity);
	public List<T> get(T entity);
}
