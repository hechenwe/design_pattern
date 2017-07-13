package com.sooncode.design_pattern.factory_pattern.static_factory.sender;

public class SenderType {
	private Sender sender;
	public static final SenderType MAIL_SENDER = new SenderType(new MailSender("MAIL", 1, true));
	public static final SenderType SMS_SENDER = new SenderType(new MailSender("SMS", 1, true));
	public static final SenderType QQ_SENDER = new SenderType(new QQSender());

	Sender getSender() {
		return sender;
	}

	private SenderType(Sender sender) {
		this.sender = sender;
	}

}
