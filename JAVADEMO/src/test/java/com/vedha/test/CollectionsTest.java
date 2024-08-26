package com.vedha.test;

import org.testng.annotations.Test;

import com.vedha.collections.ArrayListDemo;
import com.vedha.collections.MapDemo;
import com.vedha.collections.SetDemo;

public class CollectionsTest {
	@Test
	public void listDemo() {
		ArrayListDemo a = new ArrayListDemo();
		a.name();
		
	}
	
	@Test
	public void setDemo() {
		SetDemo s = new SetDemo();
		s.name();
		
	}
	
	@Test
	public void mapDemo() {
		MapDemo m = new MapDemo();
		m.name();
		
	}

}
