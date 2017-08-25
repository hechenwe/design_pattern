package com.sooncode.design_pattern.strategy_pattern;

/**
 * 商品结算
 * @author hechenwe@gmail.com
 *
 */
public class GoodsClearing {
    
    private ClearingRule clearingRule;
     
    public GoodsClearing(ClearingRule clearingRule){
        this.clearingRule = clearingRule;
    }
    
    
    public double getPayPrice(double goodsPrice){
        return this.clearingRule.clearing(goodsPrice);
    }
}