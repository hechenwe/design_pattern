package com.sooncode.design_pattern.iterator_pattern.test;

import com.sooncode.design_pattern.iterator_pattern.ArrayList;
import com.sooncode.design_pattern.iterator_pattern.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("AA");
		al.add("AB");
		al.add("AC");
		al.add("AD");

		Iterator i = al.iterator();

		while (i.hasNext()) {
			Object obj = i.next();
			System.out.println(obj);
		}

	}
}
