package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV4 implements MenuService {

	private Scanner scan;

	public MenuServiceImplV4() {
		scan = new Scanner(System.in);
	}

	// 메뉴선택하면 선택한 항목번호가 저장될 변수
	public Integer menuItem = null;

	@Override
	public void selectMenu() {

		while (true) {
			System.out.println("======================");
			System.out.println("카트 메뉴 시스템 v3");
			System.out.println("----------------------");
			System.out.println("1. 카트 추가");
			System.out.println("2. 카트 삭제");
			System.out.println("3. 카트 리스트");
			System.out.println("QUIT or Q or q. 끝내기");
			System.out.println("----------------------");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT") || strMenu.equals("Q") || strMenu.equals("q")) {
				this.menuItem = null;
				break;
			}

			try {
				int intMenu = Integer.valueOf(strMenu);
				if (intMenu >= 1 && intMenu <= 3) {
					this.menuItem = intMenu;
					break;
				}
			} catch (Exception e) {
				System.out.println("메뉴는 QUIT(끝내기), 1 ~ 3 까지만 입력");
			}

		}

	}

}
