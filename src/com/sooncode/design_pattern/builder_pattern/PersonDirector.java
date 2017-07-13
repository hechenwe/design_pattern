package com.sooncode.design_pattern.builder_pattern;
public class PersonDirector {  
     public Person constructPerson(PersonBuilder pb) {  
          pb.buildHead();  
          pb.buildBody();  
          pb.buildFoot();  
          return pb.buildPerson();  
     }  
} 