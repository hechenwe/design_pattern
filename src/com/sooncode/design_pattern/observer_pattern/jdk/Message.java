package com.sooncode.design_pattern.observer_pattern.jdk;

public class Message<M> {
	private M messageModel;
	private String messageCode;
	private String message;

	public M getMessageModel() {
		return messageModel;
	}

	public void setMessageModel(M messageModel) {
		this.messageModel = messageModel;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
