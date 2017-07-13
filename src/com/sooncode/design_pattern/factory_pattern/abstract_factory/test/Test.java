package com.sooncode.design_pattern.factory_pattern.abstract_factory.test;

import java.util.ArrayList;
import java.util.List;

import com.sooncode.design_pattern.factory_pattern.abstract_factory.sender.SendMailFactory;
import com.sooncode.design_pattern.factory_pattern.abstract_factory.sender.SendSmsFactory;
import com.sooncode.design_pattern.factory_pattern.abstract_factory.sender.Sender;
import com.sooncode.design_pattern.factory_pattern.abstract_factory.sender.SenderFactory;

public class Test {

	public static List<SenderFactory> factoryList = new ArrayList<>();

	public static void main(String[] args) {
		SenderFactory sendMailFactory = new SendMailFactory();
		SenderFactory sendSmsFactory = new SendSmsFactory();

		factoryList.add(sendMailFactory);
		factoryList.add(sendSmsFactory);

		for (SenderFactory p : factoryList) {
			Sender sender = p.getSender();
			sender.Send();
		}
	}
}