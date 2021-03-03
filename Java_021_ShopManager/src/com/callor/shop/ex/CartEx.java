package com.callor.shop.ex;

import com.callor.shop.CartMenuV1;

public class CartEx {

	public static void main(String[] args) {

		CartMenuV1 cmV1 = new CartMenuV1();
		
		while (true) {
			try {
				// cmV1의 cartMenu 실행하고 불러온 값을 select에 저장
				Integer select = cmV1.cartMenu();
				// 불러온 값이 null이면 while 중단
				if (select == null) {
					break;
				}
				// 오류 발생하면 아래 실행
			} catch (Exception e) {
				System.out.println("QUIT , 1 ~ 3 중에서만 입력하세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}