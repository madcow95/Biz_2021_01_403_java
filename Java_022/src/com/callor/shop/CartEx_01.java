package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceImplV1;
import com.callor.shop.service.impl.MenuServiceimplV1;
import com.callor.shop.values.Values;

public class CartEx_01 {

	public static void main(String[] args) {
		// 클래스로 선언, 클래스로 생성
		MenuServiceimplV1 mS = new MenuServiceimplV1();

		// 인터페이스로 선언, 클래스로 생성
		// 인터페이스를 implements 하여 작성된 클래스는
		// 인터페이스로 선언을 하자
		// 코드 업그레이드가 조금 쉬워진다.
		MenuService mService = new MenuServiceimplV1();
		CartService cService = new CartServiceImplV1();
		while (true) { // while로 묶어둬야 입력한 값들이 사라지지 않고 저장된채로 있다 (실행되는 동안)
			Integer menuItem = mService.selectMenu();
			if (menuItem == null) { // 널값 : 아무것도 아닌 값
				break;
			} else if (menuItem == Values.MENU_INPUT) {
				//System.out.println("장바구니 추가");
				cService.inputCart();
			} else if (menuItem == Values.MENU_ALL_LIST) {
				//System.out.println("장바구니 리스트 보기");
				cService.printAllCart();
			} else if (menuItem == Values.MENU_USER_LIST) {
				//System.out.println("구매자별 리스트 보기");
				cService.printUserCart();
			}
		}
		System.out.println("업무종료 퇴근이다");
	}

}
// com.callor.** : base package