package com.sooncode.design_pattern.strategy_pattern;

import java.util.HashMap;
import java.util.Map;

public abstract class MemberType {

	static {
		map = new HashMap<>();
		putAll(new MemberType("0") {
			@Override
			public ClearingRule getClearingRule() {
				return new ClearingRule() {
					
					@Override
					public double clearing(double goodsPrice) {
						return goodsPrice * 0.8;
					}
				};
			}
		},new MemberType("1") {
			
			@Override
			public ClearingRule getClearingRule() {
				return new ClearingRule() {
					
					@Override
					public double clearing(double goodsPrice) {
						 
						return goodsPrice * 0.9;
					}
				};
			}
		});
	}

	private String key;

	private static Map<String, MemberType> map;

	private static void putAll(MemberType ... memberTypes) {
		for (MemberType memberType : memberTypes) {
			map.put(memberType.key, memberType);
		}
	}

	private MemberType(String key) {
		this.key = key;
	}
	
	public static MemberType getMemberType(String key) {
		return map.get(key);
	}

	 
	public abstract ClearingRule  getClearingRule();
	
	 
}
