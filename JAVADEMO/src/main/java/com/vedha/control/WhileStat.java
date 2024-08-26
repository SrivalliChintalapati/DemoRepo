package com.vedha.control;

public class WhileStat {

	public void name() {
		
		int a = 2 , count = 0;
		
		while (a<=5) {
			
//			count = count+a;
			a++;
			System.out.println(a);
			
		}
	}
	
		public void nameA() {
			int a = 2 , count = 0;
		do {
			count = count+a;
			a++;
			
		}
		while(a<=5);
		System.out.println(count);
		}
		
		
	
}
