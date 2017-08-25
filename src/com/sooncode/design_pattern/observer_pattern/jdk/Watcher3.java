package com.sooncode.design_pattern.observer_pattern.jdk;

import java.util.Observable;
import java.util.Observer;

 

public class Watcher3  implements Observer{
    
    
    
    @Override
    public void update(Observable o, Object arg) {
    	
    	@SuppressWarnings("unchecked")
		Message<String> m = (Message<String>) arg;
    	System.out.println("Watcher3  --  "+   o.getClass() + " : "+ m.getMessageCode() + "/" + m.getMessage() + "/" + m.getMessageModel());
    }

}