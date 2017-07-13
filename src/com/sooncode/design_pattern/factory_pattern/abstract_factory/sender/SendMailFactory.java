package com.sooncode.design_pattern.factory_pattern.abstract_factory.sender;

public class SendMailFactory implements SenderFactory {

	public SendMailFactory() {

	}

	@Override
	public  Sender getSender() {
		MailSender ms = new MailSender("Mail", 1, false);// 创建这个实体, 是一个非常复杂的过程 .
		return ms;

	}
}