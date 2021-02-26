package com.callor.oop.controller;

import java.util.Scanner;

public class CartServiceV1 {
	private Scanner scan = new Scanner(System.in);
	private String cartList;
//	private String cartUserName;
//	private String cartPName;
//	private int cartIQty;
//	private int cartIPrice;

	// 이름, 제품명, 수량, 가격
	public void inputCart() {

		System.out.print("이름 입력 : ");
		String cartListUserName = scan.nextLine();
		this.cartList = cartListUserName;
		
		System.out.print("제품명 입력 : ");
		String cartListPName = scan.nextLine();
		this.cartList = cartListPName;

		while (true) {
			System.out.print("수량 입력 : ");
			cartList = scan.nextLine();
			int intQty = Integer.valueOf(cartList);
			try {
				if (intQty < 2) {
					System.out.println("수량은 2이상 입력");
					continue;
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} // end while

		while (true) {
			System.out.print("가격 입력 : ");
			cartList = scan.nextLine();
			int intPrice = Integer.valueOf(cartList);
			try {
				if (intPrice < 1000) {
					System.out.println("가격은 1000이상 입력");
					continue;
				} else {
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} // end while
	} // end inputCart
	

	public void printCartList() {
			System.out.println("이름\t제품명\t수량\t가격");
			System.out.printf("%s\t%s\t%d\t%d\n",cartList.,cartList,cartList,cartList);
		
	}

}
