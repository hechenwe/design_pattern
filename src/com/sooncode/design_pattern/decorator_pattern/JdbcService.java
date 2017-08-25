package com.sooncode.design_pattern.decorator_pattern;

import java.util.List;
import java.util.Map;

public class JdbcService implements Jdbc {

	@Override
	public int update(String sql, Map<Integer, Object> parameter) {
		return 0;
	}

	@Override
	public List<Map<String, Object>> query(String sql, Map<Integer, Object> parameter) {
		return null;
	}

}
