package com.vedha.abstr;

public abstract class Abstractclass {
	int l = 3;
	int b = 4;
	public abstract void area() ;
	
	public void perimeter() {
		
		int peri = 2*(l+b);
		
		System.out.println("Preimeter : " +peri);
	}

}
