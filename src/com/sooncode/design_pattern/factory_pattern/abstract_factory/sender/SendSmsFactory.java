package com.sooncode.design_pattern.factory_pattern.abstract_factory.sender;

public class SendSmsFactory implements SenderFactory{  
  
    @Override  
    public Sender getSender() {  
    	SmsSender ss =  new SmsSender("DFD2343",12,true) ;// �������ʵ��, ��һ���ǳ����ӵĹ��� .
        return ss;  
    }  
}  