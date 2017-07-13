package com.sooncode.design_pattern.factory_pattern.abstract_factory.sender;
class MailSender implements Sender {  
	
	
	private String senderName;
	
	private Integer size;
	
	
	private Boolean bool;
	
	
	
	public MailSender(String senderName , int size, boolean bool) {
		this.senderName = senderName;
		this.size = size;
		this.bool = bool;
	}
	
	
    @Override  
    public void Send() {  
        System.out.println("senderName="+senderName +";size="+size + ";bool="+bool);  
    }  
}  