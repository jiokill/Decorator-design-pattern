package com.ddp.model;

public class MobileDecorator  implements Mobile{
private Mobile mobile;
	public MobileDecorator( Mobile mobile) {
		   this.mobile=mobile;
	}
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

}
