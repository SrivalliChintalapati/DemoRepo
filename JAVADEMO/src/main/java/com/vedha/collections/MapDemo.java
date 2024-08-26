package com.vedha.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public void name() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "Srivalli");
		map.put(1, "Sravalika");
		System.out.println(map);
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		map1.put(0, "Srivalli");
		map1.put(1, "Sravalika");
		map1.put(2, "Sravalika");
		map1.put(0, "Sravalika");
		for(Map.Entry<Integer, String> itr : map1.entrySet()) {
			System.out.println(itr.getKey() +" : "+itr.getValue());
		}
		System.out.println(map1);
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.put(0, "apple");
		map2.put(2, "cat");
		map2.put(1, "dog");
		map2.put(0, "ball");
		System.out.println(map2);
		
	}

}
