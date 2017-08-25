package com.sooncode.design_pattern.command_pattern.test;

 
import com.sooncode.design_pattern.command_pattern.Invoker;
import com.sooncode.design_pattern.command_pattern.Receiver;

public class Test {
    public static void main(String[] args){
        //命令接收者,执行者
        Receiver receiver = new Receiver();
        
        //创建调用者，将命令对象设置进去
        Invoker invoker = new Invoker(receiver);
        
        //这里可以测试一下
        invoker.command1();
        invoker.command2();
        invoker.command3();
        invoker.command4();
        invoker.command1();
        invoker.command2();
        invoker.command4();
        invoker.command3();
         
    }
}