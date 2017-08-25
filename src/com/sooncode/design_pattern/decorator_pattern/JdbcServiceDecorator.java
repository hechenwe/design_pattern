package com.sooncode.design_pattern.decorator_pattern;

import java.util.List;
import java.util.Map;

public class JdbcServiceDecorator  implements Jdbc{
    //@Autowire
	private JdbcService jdbcService = new JdbcService();

	@Override
	public int update(String sql, Map<Integer, Object> parameter) {
		
		System.out.println("[SQL]:"+sql);
		System.out.println("[PARAMETER]:"+parameter);
		int size = jdbcService.update(sql, parameter);
		return size;
	}

	@Override
	public List<Map<String, Object>> query(String sql, Map<Integer, Object> parameter) {
		System.out.println("[SQL]:"+sql);
		System.out.println("[PARAMETER]:"+parameter);
		List<Map<String, Object>> list = jdbcService.query(sql, parameter);
		return list;
	}
	
	
	
}
