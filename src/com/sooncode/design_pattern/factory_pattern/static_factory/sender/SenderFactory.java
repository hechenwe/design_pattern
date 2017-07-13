package com.sooncode.design_pattern.factory_pattern.static_factory.sender;

public class SenderFactory {
	public static Sender getSender(SenderType SenderType) {
		return SenderType.getSender();
	}
}
