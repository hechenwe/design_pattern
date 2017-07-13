package com.sooncode.design_pattern.factory_pattern.abstract_factory.sender;

public class SendSmsFactory implements SenderFactory{  
  
    @Override  
    public Sender getSender() {  
    	SmsSender ss =  new SmsSender("DFD2343",12,true) ;// 创建这个实体, 是一个非常复杂的过程 .
        return ss;  
    }  
}  