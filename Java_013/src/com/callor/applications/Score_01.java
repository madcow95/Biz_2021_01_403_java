package com.callor.applications;

import com.callor.applications.service.ScoreServiceV1;

public class Score_01 {
	
	public static void main(String args[]) {
		
		ScoreServiceV1 scV1 = new ScoreServiceV1();
		// method return값을 변수에 저장하려면
		// method reutrn type이 void가 아니어야한다.
		// ScoreServiceV1의 input() method는 return type이 void(형, type)이다.
		// 따라서 아래 코드처럼 사용할 수 없다.
		//int num = scV1.input();
		
//		scV1.input();
//		scV1.print();
//		scV1.sum();
//		scV1.avg();
	}

}
