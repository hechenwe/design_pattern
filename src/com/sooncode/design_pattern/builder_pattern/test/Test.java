package com.sooncode.design_pattern.builder_pattern.test;

import com.sooncode.design_pattern.builder_pattern.ManBuilder;
import com.sooncode.design_pattern.builder_pattern.Person;
import com.sooncode.design_pattern.builder_pattern.PersonDirector;
import com.sooncode.design_pattern.builder_pattern.WomanBuilder;

public class Test{  
     public static void main(String[] args) {  
          PersonDirector pd = new PersonDirector();  
          Person womanPerson = pd.constructPerson(new ManBuilder());  
          Person manPerson = pd.constructPerson(new WomanBuilder());  
     }  
}  
