package com.callor.shop.ex;

import com.callor.shop.CartMenuV2;
import com.callor.shop.CartServiceV2;

public class CartEx2 {

	public static void main(String[] args) {

		CartMenuV2 cmV2 = new CartMenuV2();
		CartServiceV2 csV2 = new CartServiceV2();
		while (true) {
			Integer select = cmV2.cartMenu();
			 
			if (select == null) {
				break;
			}
			boolean bYes = select >= 1 && select <= 3;
			if (select == 1) {
				csV2.inputCart();
			} else if (select == 2) {
				csV2.printCart();
			} else if (select == 3) {
				csV2.printUser();
			} else if(!bYes) {
				System.out.println("1 ~ 3에서만 입력하세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}