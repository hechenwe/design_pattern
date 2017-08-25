package com.sooncode.design_pattern.strategy_pattern.test;

import com.sooncode.design_pattern.strategy_pattern.ClearingRule;
import com.sooncode.design_pattern.strategy_pattern.GoodsClearing;
import com.sooncode.design_pattern.strategy_pattern.MemberType;

public class Test {

    public static void main(String[] args) {
        //member_type 0,1,2
    	ClearingRule cr = MemberType.getMemberType("1").getClearingRule();
        
    	GoodsClearing gc = new GoodsClearing(cr);// 
       
        double price = gc.getPayPrice(300);
        System.out.println("最终支付的金额：" + price);
        
        
    }

}