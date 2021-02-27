package com.callor.oop.model;

import java.util.Scanner;

public class CartServiceV1 {
	private Scanner scan = new Scanner(System.in);
	private String cartList;

	// 이름, 제품명, 수량, 가격
	public void inputCart() {

		System.out.print("이름 입력 : ");
		this.cartList = scan.nextLine();
		
		System.out.print("제품명 입력 : ");
		this.cartList = scan.nextLine();

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
				System.out.println("숫자입력하세요");
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
			} catch (NumberFormatException e) {
				System.out.println("숫자입력하세요");
			}
		} // end while
		
	} // end inputCart
	

	public void printCartList() {
			System.out.println("이름\t제품명\t수량\t가격");
			System.out.printf("%s\t%s\t%d\t%d\n");
		
	}

}
