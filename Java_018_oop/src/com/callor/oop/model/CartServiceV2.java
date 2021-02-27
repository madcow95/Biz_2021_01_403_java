package com.callor.oop.model;

public class CartServiceV2 {
	
	private String cartList;
	
	public void inputCart(String strList) {
		
		this.cartList = strList;
		
	}
	
	public void printCartList() {
		
		System.out.println(cartList);
		
	}

}
