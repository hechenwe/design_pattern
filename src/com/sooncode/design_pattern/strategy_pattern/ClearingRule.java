package com.sooncode.design_pattern.strategy_pattern;


/**
 * 结算规则
 * 
 * @author hechenwe@gmail.com
 *
 */
public interface ClearingRule {
    /**
     * 结算
     * @param goodsPrice    商品的原价
     * @return 实际需要支付的价格
     */
    public double clearing(double goodsPrice);
}