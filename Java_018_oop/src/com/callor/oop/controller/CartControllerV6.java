package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartServiceV1;
import com.callor.oop.model.CartServiceV2;

public class CartControllerV6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<CartServiceV1> cartV1 = new ArrayList<CartServiceV1>();
		CartServiceV1 csV1 = new CartServiceV1();
		for (int i = 0; i < 1; i++) {
			
			CartServiceV1[] csList = new CartServiceV1[4];
			csList[i].inputCart();
			cartV1.add(csList[i]);
		}
		
		csV1.printCartList();
	}

}
