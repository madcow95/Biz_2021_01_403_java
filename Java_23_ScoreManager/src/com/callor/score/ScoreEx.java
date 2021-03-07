package com.callor.score;

import com.callor.score.service.ScoreMenu;
import com.callor.score.service.Service;
import com.callor.score.values.Values;

public class ScoreEx {

	public static void main(String args[]) {

		Service service = new Service();
		ScoreMenu sMenu = new ScoreMenu();
		while (true) {
			Integer select = sMenu.selectMenu();
			if (select == null) {
				break;
			}
			if (select == Values.MAKE_SCORE) {
				service.makeScore();
				System.out.println("점수 생성 완료!");
			} else if (select == Values.SAVE_SCORE) {
				service.saveScoreToFile();
				System.out.println("점수 txt파일로 저장 완료!");
			} else if (select == Values.LOAD_SCORE) {
				service.loadScoreFromFile();
			}

		}
		System.out.println("프로그램 종료!");
	}

}
