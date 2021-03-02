package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {

	private Scanner scan;

	public void selectMenu() {

		scan = new Scanner(System.in);
		while (true) {
			System.out.println("========================");
			System.out.println("Java Menu System v1");
			System.out.println("------------------------");

			System.out.println("1. 카트추가");
			System.out.println("2. 카트삭제");
			System.out.println("3. 카트리스트");
			System.out.println("Q. 끝내기");
			System.out.println("------------------------");

			int intSelect = 0;
			System.out.print("선택 >> ");
			String select = scan.nextLine();
			if (select == "Q" || select == "q") {
				System.out.println("끝내기");
				return;
			}
			try {
				intSelect = Integer.valueOf(select);
				if (intSelect == 1) {
					System.out.println("카트추가");
					break;
				} else if (intSelect == 2) {
					System.out.println("카트삭제");
					break;
				} else if (intSelect == 3) {
					System.out.println("카트리스트");
					break;
				} else {
					System.out.println("1 ~ 3 만 입력");
					continue;
				}
			} catch (Exception e) {
				System.out.println("Q, 1 ~ 3만 입력");
			}
		}

	}
}
