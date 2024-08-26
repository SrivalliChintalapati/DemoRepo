package com.vedha.polymorphism;

public class Overloading {
	
	public void adding(int a) {
		int b = 10 , c;
		c = a+b;
		System.out.println(c);
	}
	
	public void adding(String s , long l) {
		System.out.println("Name : " +s);
		System.out.println("Ph.no : " +l);
	}

}
