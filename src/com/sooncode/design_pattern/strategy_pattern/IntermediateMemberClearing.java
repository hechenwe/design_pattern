package com.sooncode.design_pattern.strategy_pattern;
public class IntermediateMemberClearing implements ClearingRule {

   

	@Override
	public double clearing(double goodsPrice) {
		return goodsPrice * 0.9;
	}

}