package com.sooncode.design_pattern.memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private Originator o;
    private List<Memento> mementos = new ArrayList<Memento>();
    private int current;
    /**
     * 构造函数
     */
    public Caretaker(){
    	
        this.o = new Originator ();
        current = 0;
    }
    /**
     * 创建一个新的检查点
     */
    public int createMemento(String state){
    	o.setState(state);
        Memento memento = o.createMemento();
        mementos.add(memento);
        return current++;
    }
    /**
     * 将发起人恢复到某个检查点
     */
    public void restoreMemento(int index){
        Memento memento = mementos.get(index);
        o.restoreMemento(memento);
    }
    /**
     * 将某个检查点删除
     */
    public void removeMemento(int index){
        mementos.remove(index);
    }
    
    public List<String> getSates(){
    	return o.getStates();
    }
    
    public String getSate(int index) {
    	List<String> list = o.getStates();
    	if( index >= 0 && index < list.size()) {
    		return list.get(index);
    	}else {
    		return null;
    	}
    	 
    }
}