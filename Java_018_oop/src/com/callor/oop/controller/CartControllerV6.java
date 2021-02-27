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
		CartServiceV1[] csV1 = new CartServiceV1[4];
		for (int i = 0; i < csV1.length; i++) {

			//String strName = csV1[i].inputCart();
			cartV1.add(csV1[i]);
		}

		for (int i = 0; i < csV1.length; i++) {
			csV1[i].printCartList();
		}
	}

}
