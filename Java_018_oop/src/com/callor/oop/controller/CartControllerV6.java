package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;

public class CartControllerV6 {
	
	public static void main(String[] args) {
		
		List<CartServiceV1> csV1List = new ArrayList<CartServiceV1>();
		CartServiceV1 csV1 = new CartServiceV1();
		
		for(int i = 0; i < 1; i++) {
			
			CartServiceV1 csList = new CartServiceV1();
			csList.inputCart();
			csV1List.add(csList);
		}
		
		
		
		for(int i = 0; i < 4; i++) {
			csV1List.get(i);
		}
		
	}

}
