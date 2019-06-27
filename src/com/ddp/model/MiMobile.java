package com.ddp.model;

public class MiMobile implements Mobile {

	@Override
	public String message() {
	System.out.println("mi message");
		return "mi";
	}

	@Override
	public void call() {
		// TODO Auto- method stub
		 System.out.println("mi call");
		
	}

}
