package com.callor.shop;

import java.util.Scanner;

public class CartMenuV1 implements CartMenu {

	Scanner scan;
	CartServiceV1 csV1 = new CartServiceV1();

	public CartMenuV1() {
		scan = new Scanner(System.in);
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
			System.out.println("끝내기 : ( QUIT / q / Q)");
			System.out.println("=================================");
			System.out.print("입력 >> ");
			String select = scan.nextLine();
			// 입력 값이 아래와 같으면 null값을 가지고 불러온 곳으로 return
			if (select.equals("QUIT") || select.equals("q") || select.equals("Q")) {
				return null;
			}
			int intSelect = Integer.valueOf(select);
			// 1 < intSelect < 3 일때만 실행
			if (intSelect >= 1 && intSelect <= 3) {
				if (intSelect == 1) {
					csV1.inputCart();
				} else if (intSelect == 2) {
					csV1.printCart();
				} else if (intSelect == 3) {
					csV1.printUser();
				}
				// 그 외에는 아래 실행
			} else {
				System.out.println("1 ~ 3 중에서만 입력하세요");
			}
		}
	}
}