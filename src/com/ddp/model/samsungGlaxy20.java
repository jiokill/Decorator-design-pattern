package com.ddp.model;

public class samsungGlaxy20  extends MobileDecorator{

	public samsungGlaxy20(Mobile mobile) {
		super(mobile);
		 
	} 

	@Override
	public String message() {
	    System.out.println("samsun g Glaxy");
		return "glaxy";
	}

	@Override
	public void call() {
		 System.out.println("glaxy call");
	 
	}
 
	 
}
