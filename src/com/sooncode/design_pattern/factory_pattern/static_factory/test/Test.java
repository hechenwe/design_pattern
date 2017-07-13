package com.sooncode.design_pattern.factory_pattern.static_factory.test;

import com.sooncode.design_pattern.factory_pattern.static_factory.sender.Sender;
import com.sooncode.design_pattern.factory_pattern.static_factory.sender.SenderFactory;
import com.sooncode.design_pattern.factory_pattern.static_factory.sender.SenderType;

public class Test {
	public static void main(String[] args) {
	 
		Sender sender = SenderFactory.getSender(SenderType.QQ_SENDER);
		 
		sender.Send();
	}
}
