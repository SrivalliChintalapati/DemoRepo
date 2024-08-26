package com.vedha.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public void name() {
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		s1.add(2);
		s1.add(3);
		s1.add(4);
		System.out.println(s1);
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(3);
		s2.add(2);
		
		Iterator<Integer> it = s1.iterator();
		
		System.out.println(s1.containsAll(s2));
	}
	

}
