package com.callor.oop;

import com.callor.oop.service.CartService;
import com.callor.oop.service.impl.CartServiceImplV2;

public class CartEx_03 {
	
	public static void main(String[] args) {
		//					V1꺼 쓰고싶으면 V1으로 바꾸고 ctrl + shift + o누르면 된다.
		CartService cServ = new CartServiceImplV2();
		cServ.inputCart();
		cServ.printCart();
		
	}

}
