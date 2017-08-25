package com.sooncode.design_pattern.strategy_pattern;
public class PrimaryMemberClearing implements ClearingRule {
 

	@Override
	public double clearing(double goodsPrice) {
		return goodsPrice;
	}

}