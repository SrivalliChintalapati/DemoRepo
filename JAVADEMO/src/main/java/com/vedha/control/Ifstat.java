package com.vedha.control;

public class Ifstat {
	
	public void Statements() {
		int a = 11 , b = 10;
		
		if(a>b) {
			System.out.println("a<b");
			if(a>0) {
				System.out.println("a>0");
			}
		else if(a==b){
			System.out.println("a==b");
		}
		else
		{
			System.out.println("a!<b");
		}
		}
	}

}
