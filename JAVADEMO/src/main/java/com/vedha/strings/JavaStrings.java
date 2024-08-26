package com.vedha.strings;

import java.util.Arrays;

public class JavaStrings {
	
	public void eq() {
		
		String s1 = "apple,ball,cat,dog";
		String s2 = "BALL";
		String s3 = ",";
		String s4 = "gmail.com";
		String[] str = s1.split(s3);
		for(String S :str) {
			System.out.println(S);
		}
		
		
		
//		System.out.println(s1.length());
		
		
//		System.out.println("Str length : "+s1.length());
//		String[] str = {"Banana","cat"};
//		System.out.println("Array length : "+str.length);
//		String s2 = "Banana";
//		String s3 = "cat";
//		String s4 = new String("Banana");
		
		
		
	}
}
