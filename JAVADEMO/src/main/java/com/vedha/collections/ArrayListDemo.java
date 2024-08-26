package com.vedha.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public void name() {
		
		List<String> ob = new ArrayList<String>();
		
		ob.add("apple");
		ob.add("ball");
		ob.add(0, "call");
		ob.add(1, "cat");
		ob.set(1, "call");
		System.out.println(ob);
		ob.remove(1);
		for(String O : ob) {
			System.out.println(O);
		}
		System.out.println(ob.hashCode());
		
		List<String> ob1 = ob.subList(1,2);
		System.out.println(ob1);
		
	}

}
