package com.callor.shop;

import java.util.Scanner;

import com.callor.shop.inter.CartMenu;

public class CartMenuV2 implements CartMenu {

	private Scanner scan; // scanner class를 이용해서 scan이라는 객체를 선언

	public CartMenuV2() {
		scan = new Scanner(System.in); // scan 객체를 생성
	}

	@Override
	public Integer cartMenu() {
		while (true) {

			System.out.println("=================================");
			System.out.println("빛나라 쇼핑몰 2021");
			System.out.println("---------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("끝내기 : ( QUIT / q / Q )");
			System.out.println("=================================");

			String select;
			int intSelect = 0;
			try {
				System.out.print("입력 >> ");
				select = scan.nextLine();
				if (select.equals("QUIT") || select.equalsIgnoreCase("q")) {
					System.out.print("끝내겠습니까? (Y) >> ");
					select = scan.nextLine();
					if (select.equalsIgnoreCase("y")) {
						return null;
					}
					intSelect = Integer.valueOf(select);
				} else {
					return intSelect;
				}

			} catch (Exception e) {
				//System.out.println("QUIT , 1 ~ 3 에서만 입력하세요");
			}

			

		}
	}
}