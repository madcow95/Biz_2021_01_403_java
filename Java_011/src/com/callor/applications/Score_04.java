package com.callor.applications;

import com.callor.applications.service.ScoreServiceV3;

public class Score_04 {

	public static void main(String[] args) {
		
		ScoreServiceV3 scV3 = new ScoreServiceV3();
		// ScoreServiceV3 class의 2번째 sum() method 호출
		scV3.sum();
		
		// ScoreServiceV3 class의 1번째 sum(int num1, int num2) method 호출
		scV3.sum(20, 40);
		
		float fNum1 = 43.25f;
		float fNum2 = 32.11f;
		// 실수형 변수 fNum1, fNum2에 담긴 값을 
		// sum() method에 전달하면서 호출해라.
		scV3.sum(fNum1, fNum2);
		
		scV3.sum(100d, fNum1);
		scV3.sum((double)100, fNum1);
		
	}

}
