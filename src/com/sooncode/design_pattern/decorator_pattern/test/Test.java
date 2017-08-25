package com.sooncode.design_pattern.decorator_pattern.test;

import java.util.HashMap;
import java.util.Map;

import com.sooncode.design_pattern.decorator_pattern.JdbcServiceDecorator;

public class Test {
	public static void main(String[] args) {
		    String sql = "UPDATE ...";
		    Map<Integer,Object> map = new HashMap<>();
		    
		    map.put(1, "hello");
		    map.put(2, "20");
		    
		    JdbcServiceDecorator jsf = new JdbcServiceDecorator();
            jsf.update(sql, map);
            
	}
}
