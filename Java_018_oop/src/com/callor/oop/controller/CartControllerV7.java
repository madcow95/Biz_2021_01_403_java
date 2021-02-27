package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartServiceV2;

public class CartControllerV7 {

	public static void main(String[] args) {
		List<CartServiceV2> csV = new ArrayList<CartServiceV2>();
		Scanner scan = new Scanner(System.in);
		CartServiceV2[] csV2 = new CartServiceV2[5];

		// 이름, 상품이름, 수량, 가격
		csV2[0] = new CartServiceV2();

		System.out.print("이름 입력 : ");
		String strUName = scan.nextLine();
		csV2[0].inputCart(strUName);

		System.out.print("상품이름 입력 : ");
		String strPName = scan.nextLine();
		csV2[0].inputCart(strPName);

		System.out.print("수량 입력 : ");
		String strQty = scan.nextLine();
		csV2[0].inputCart(strQty);

		System.out.print("가격 입력 : ");
		String strPrice = scan.nextLine();
		csV2[0].inputCart(strPrice);

//		for (int i = 0; i < csV2.length; i++) {
			csV.add(csV2[0]);
//		}
		
//		for (int i = 0; i < csV2.length; i++) {
			csV2[0].printCartList();
//		}
	}

}
