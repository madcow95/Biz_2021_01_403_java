package com.callor.homework.service;

import com.callor.homework.CartServiceV1;

public class CartControllerV1 {
	
	public static void main(String[] args) {
		
		CartServiceV1 csV1 = new CartServiceV1();
		
		System.out.println("===========================");
		System.out.println("	 장바구니  	");
		System.out.println("===========================");
		csV1.inputCart();
		csV1.printCartList();
	}

}
