package com.callor.cart.service.impl;

import java.util.Scanner;

import com.callor.cart.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;

	public MenuServiceV1() {
		// 생성자 method에서 scanner 초기화
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {

		while (true) {
			System.out.println("==================");
			System.out.println("카트 메뉴");
			System.out.println("------------------");
			System.out.println("1. 카트 추가");
			System.out.println("2. 카트 삭제");
			System.out.println("3. 카트 리스트");
			System.out.println("Q. 종료");
			System.out.println("------------------");
			System.out.print("입력 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("Q") || strMenu.equals("q")) {
				break;
			}

			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if (intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				} else {
					System.out.println("메뉴는 1 ~ 3 까지만 선택");
				}

			} catch (Exception e) {
				System.out.println("메뉴는 Q , q 또는 1 ~ 3의 정수만 선택가능");
			}
		} // end while
		scan.close();
		return null;
	}

}
