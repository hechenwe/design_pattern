package com.sooncode.design_pattern.factory_pattern.abstract_factory.sender;

public class SendMailFactory implements SenderFactory {

	public SendMailFactory() {

	}

	@Override
	public  Sender getSender() {
		MailSender ms = new MailSender("Mail", 1, false);// �������ʵ��, ��һ���ǳ����ӵĹ��� .
		return ms;

	}
}