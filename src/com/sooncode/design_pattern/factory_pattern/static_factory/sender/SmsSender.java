package com.sooncode.design_pattern.factory_pattern.static_factory.sender;

class SmsSender implements Sender {

	private String sendId;

	private Integer sendSize;

	private Boolean isSend;

	public SmsSender(String sendId, int sendSize, boolean isSend) {
		this.sendId = sendId;
		this.sendSize = sendSize;
		this.isSend = isSend;
	}

	@Override
	public void Send() {
		System.out.println("sendId=" + sendId + ";sendSize=" + sendSize + ";isSend=" + isSend);
	}
}