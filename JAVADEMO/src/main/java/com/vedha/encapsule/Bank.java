package com.vedha.encapsule;

public class Bank {
	
	public static void main(String[] args) {
		
		Customer ob = new Customer();
		ob.setAcc(1233457l);
		System.out.println("Acc No :" +ob.getAcc());
		
		ob.setCu_name("Darshan");
		System.out.println("Name : " +ob.getCu_name());
		
	}

}
