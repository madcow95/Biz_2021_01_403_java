package com.callor.score.service;

import java.util.Scanner;

import com.callor.score.MenuService;
import com.callor.score.values.ValLine;

public class ScoreMenu implements MenuService {

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		while (true) {
			System.out.println(ValLine.dLine(50));
			System.out.println("점수 입력기");
			System.out.println(ValLine.dLine(50));
			System.out.println("1. 점수입력");
			System.out.println("2. 점수 파일 만들기");
			System.out.println("3. 입력한 점수 확인하기");
			System.out.println("QUIT. 프로그램 종료");
			System.out.println(ValLine.sLine(50));
			System.out.print("선택 >> ");
			String strSelect = scan.nextLine();
			if (strSelect.equalsIgnoreCase("QUIT")) {
				break;
			}

			int select = Integer.valueOf(strSelect);
			if (select >= 1 && select <= 3) {
				if (select == 1) {
					ssV1.makeScore();
				} else if (select == 2) {
					ssV1.saveScore();
				} else if (select == 3) {
					ssV1.loadScore();
				}
			} else {
				System.out.println("숫자는 1 ~ 3만 입력하세요");
			}
			

		}
		System.out.println("프로그램 종료!!");
	}

}
