package com.sooncode.design_pattern.template_method.test;

import com.sooncode.design_pattern.template_method.AbstractCalculator;
import com.sooncode.design_pattern.template_method.Multiply;

public class Test {  
  
    public static void main(String[] args) {  
        String exp = "80*80";  
        Multiply plus = new Multiply();  
        //AbstractCalculator add = new Add();  
        //int result = add.calculate(exp, "\\+");  
        int result = plus.calculate(exp, "\\*");  
        System.out.println(result);  
    }  
}  