package com.sooncode.design_pattern.builder_pattern;
public class ManBuilder implements PersonBuilder {  
     Person person;  
     public ManBuilder() {  
          person = new Man();  
     }  
     @Override
     public void buildBody() {  
          person.setBody("�������˵�����");  
     }  
     public void buildFoot() {  
          person.setFoot("�������˵Ľ�");  
     }  
     public void buildHead() {  
          person.setHead("�������˵�ͷ");  
     }  
     public Person buildPerson() {  
          return person;  
     }
	 
	 
}  
