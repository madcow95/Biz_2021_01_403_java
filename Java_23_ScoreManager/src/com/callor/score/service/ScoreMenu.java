package com.callor.score.service;

import java.util.Scanner;

import com.callor.score.inter.MenuService;
import com.callor.score.values.Values;

public class ScoreMenu implements MenuService {

	@Override
	public Integer selectMenu() {

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println(Values.sLine);
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String select = scan.nextLine();

			if (select.equalsIgnoreCase("quit")) {
				System.out.println("종료할까요? (y)");
				String yesNo = scan.nextLine();
				if (yesNo.equalsIgnoreCase("y")) {
					return null;
				} else {
				}
			}

			try {
				int intSelect = Integer.valueOf(select);
				if (intSelect == Values.MAKE_SCORE) {
					return intSelect;
				} else if (intSelect == Values.SAVE_SCORE) {
					return intSelect;
				} else if (intSelect == Values.LOAD_SCORE) {
					return intSelect;
				} else {
					System.out.printf("%d ~ %d 에서만 입력하세요\n",
							Values.START_MENU,
							Values.LAST_MENU);
				}

			} catch (Exception e) {
				System.out.printf("QUIT / %d ~ %d 에서만 입력하세요\n",
						Values.START_MENU,
						Values.LAST_MENU);
			}

		}

	}

}
