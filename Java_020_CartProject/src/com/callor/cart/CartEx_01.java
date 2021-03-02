package com.callor.cart;

import com.callor.cart.service.impl.CartServiceV1;
import com.callor.cart.service.impl.MenuServiceV1;

public class CartEx_01 {

	public static void main(String[] args) {

		CartServiceV1 csV1 = new CartServiceV1();
		MenuServiceV1 msV1 = new MenuServiceV1();

		while (true) {

			Integer menu = msV1.selectMenu();
			if (menu == null) {
				break;
			} else if (menu == 1) {
				csV1.inputCart();
			} else if (menu == 3) {
				csV1.printCart();
			}

		}

	}

}
