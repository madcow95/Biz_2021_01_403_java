package com.callor.score;

import com.callor.score.service.ScoreMenu;
import com.callor.score.service.ScoreServiceImplV1;

public class ScoreEx {
	
	public static void main(String[] args) {
		
		ScoreServiceImplV1 ssV1 = new ScoreServiceImplV1();
		ScoreMenu sm = new ScoreMenu();
		
		sm.menu();
		ssV1.makeScore();
		ssV1.saveScore();
		ssV1.loadScore();
		
	}

}
