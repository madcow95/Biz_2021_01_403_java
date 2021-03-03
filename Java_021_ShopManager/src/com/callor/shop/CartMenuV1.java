package com.callor.shop;

import java.util.Scanner;

import com.callor.shop.inter.CartMenu;

public class CartMenuV1 implements CartMenu {

	private Scanner scan;
	private CartServiceV1 csV1 = new CartServiceV1();

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
			System.out.println("끝내기 : ( QUIT / q / Q )");
			System.out.println("=================================");
			System.out.print("입력 >> ");
			String select = scan.nextLine();
			// 입력 값이 아래와 같으면 null값을 가지고 불러온 곳으로 return
			if (select.equals("QUIT") || select.equals("q") || select.equals("Q")) {
				return null;
			}
			int intSelect = Integer.valueOf(select); // 선생님 : 여기서 exception 뜰텐데 작동이 잘 되나 물어보심 / 여기서 try문 사용해서 exception여지 안준다
			// 1 <= intSelect <= 3 일때만 실행
			if (intSelect >= 1 && intSelect <= 3) { // 1. 여기를 없애고
				if (intSelect == 1) {
					csV1.inputCart();
				} else if (intSelect == 2) {
					csV1.printCart();
				} else if (intSelect == 3) {
					csV1.printUser(); // 2. 이 세개만 남겨놓고
				}
				// 그 외에는 아래 실행
			} else { // 3. 여기만 남겨 놓으면 되지 않을까?
				System.out.println("1 ~ 3 중에서만 입력하세요");
			}
		}
	}
}