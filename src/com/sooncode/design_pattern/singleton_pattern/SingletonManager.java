package com.sooncode.design_pattern.singleton_pattern;

public class SingletonManager {

	
	private int  age;
	private long hight;
	private boolean bool ;
	
	private static  SingletonManager singletonManager = null;
	
	
	
	public static SingletonManager getSingletonManager() {  
		if (singletonManager == null) {  
            synchronized (SingletonManager.class) {  
                if (singletonManager == null) {  
                	singletonManager = new SingletonManager();  
                }  
            }  
        }  
        return singletonManager;  
    }  
	
	
	
	
	
	
	
	public int getAge() {
		return age;
	}







	public void setAge(int age) {
		this.age = age;
	}







	public long getHight() {
		return hight;
	}







	public void setHight(long hight) {
		this.hight = hight;
	}







	public boolean isBool() {
		return bool;
	}







	public void setBool(boolean bool) {
		this.bool = bool;
	}


   




	@Override
	public String toString() {
		return "SingletonManager [age=" + age + ", hight=" + hight + ", bool=" + bool + "]";
	}







	public static void main(String[] args) {
		SingletonManager  sm = SingletonManager.getSingletonManager();
		sm.setAge(10);
		System.out.println(sm);
		SingletonManager  sm2 = SingletonManager.getSingletonManager();
		sm2.setAge(23);
		sm.setBool(true);
		System.out.println(sm2);
		SingletonManager  sm3 = SingletonManager.getSingletonManager();
		System.out.println(sm3);
	}
	
	
	
}
