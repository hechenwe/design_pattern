package com.sooncode.design_pattern.decorator_pattern;

import java.util.List;
import java.util.Map;

public interface Jdbc {

	public int update(String sql , Map<Integer,Object> parameter);
	public List<Map<String,Object>> query (String sql , Map<Integer,Object> parameter);
}
