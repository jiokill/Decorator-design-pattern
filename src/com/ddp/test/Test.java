package com.ddp.test;

import com.ddp.model.MiMobile;
import com.ddp.model.Mobile;
import com.ddp.model.SamsungMobile;
import com.ddp.model.samsungGlaxy20;

public class Test {
	public static void main(String[] args) {
		Mobile mobile=new samsungGlaxy20(new SamsungMobile());
		mobile.call();
		mobile.message();
	}

}
