package com.ddp.model;

public class SamsungMobile  implements Mobile{

	@Override
	public String message() {
	System.out.println("samsung mobile message");
		return "sansung";
	}

	@Override
	public void call() {
		System.out.println("call samsung");
		
	}

}
