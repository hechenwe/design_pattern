package com.sooncode.design_pattern.builder_pattern.test;

import com.sooncode.design_pattern.builder_pattern.computer.BuilderProcess;
import com.sooncode.design_pattern.builder_pattern.computer.Computer;

public class Test{  
     public static void main(String[] args) {  
    	 Computer c =  BuilderProcess.getComputer();
    	 System.out.println(c.toString());
     }  
}  
