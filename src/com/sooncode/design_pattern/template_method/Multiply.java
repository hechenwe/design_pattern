package com.sooncode.design_pattern.template_method;
public class Multiply extends AbstractCalculator {  
  
    @Override
	protected int calculate2(int num1,int num2) {  
        return num1 * num2;  
    }  
}  