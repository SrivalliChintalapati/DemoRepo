package com.vedha.test;

import org.testng.annotations.Test;

import com.vedha.abstr.ChildClass;
import com.vedha.control.ForStat;
import com.vedha.control.Ifstat;
import com.vedha.control.SwitchBlock;
import com.vedha.control.WhileStat;
import com.vedha.heirarichal.ChildA;
import com.vedha.interfa.Rectangle;
import com.vedha.interfa.Square;
import com.vedha.multiinheritance.ChildB;
import com.vedha.polymorphism.Overloading;
import com.vedha.singleinheritance.Child;

public class execute {
	
	@Test
	public void poly() {
		
		Overloading o = new Overloading();
		o.adding(4);
		o.adding("Srivalli", 9441120099l);
		
	}
	
	@Test
	public void inh() {
		
		Child o = new Child();
		o.grandFather(10000);
		o.father(20000);
		System.out.println("--------------");
		
		ChildB ob = new ChildB();
		ob.chil();
		ob.fath();
		ob.grand();
		
		ChildA obj = new ChildA();
		obj.Car();
		obj.Swift();
		
		com.vedha.heirarichal.ChildB obj1 = new com.vedha.heirarichal.ChildB();
		obj1.Car();
		obj1.NAno();
		
	}
	
	@Test
	public void inter() {
//		Rectangle o = new Rectangle();
//		o.name();
		
		Square ob = new Square();
		ob.complete();
		ob.name();
	}
	
	@Test
	public void abs() {
		ChildClass ob = new ChildClass();
		ob.area();
		ob.perimeter();
		
	}
	
	@Test
	public void control() {
		
		Ifstat ob = new Ifstat();
		ob.Statements();
		
		SwitchBlock s = new SwitchBlock();
		s.name();
		
		WhileStat w = new WhileStat();
		w.name();
		w.nameA();
		
		ForStat f = new  ForStat();
		f.name();
	}

}
