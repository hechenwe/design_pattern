package com.sooncode.design_pattern.observer_pattern.jdk;

import java.util.Observer;

public class Test {

	public static void main(String[] args) {

		// 创建被观察者对象
		MyObservable obs = new MyObservable();
		// 创建观察者对象，并将被观察者对象登记
		Observer watcher1 = new Watcher1();
		Observer watcher2 = new Watcher2();
		Observer watcher3 = new Watcher3();

		obs.addObserver(watcher1);
		obs.addObserver(watcher2);
		obs.addObserver(watcher3);
		obs.notifyObservers("hello");

	}

}