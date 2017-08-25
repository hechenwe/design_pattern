package com.sooncode.design_pattern.memento_pattern.test;

import com.sooncode.design_pattern.memento_pattern.Caretaker;

public class Client {

    public static void main(String[] args) {
        
       
        Caretaker c = new Caretaker();
         
        c.createMemento("state 0");
         
        c.createMemento("state 1");
         
        c.createMemento("state 2");
        
        c.createMemento("state 3");
        
        
        System.out.println(c.getSates());
        
        
        System.out.println("-----------------恢复检查点-----------------");
         
        c.restoreMemento(1);
        System.out.println(c.getSates());
        System.out.println(c.getSate(1));
         
        
    }

}