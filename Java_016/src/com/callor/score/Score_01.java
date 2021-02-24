package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {
		// {}의 갯수만큼 글자형 배열 생성
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] strAd = { "서울시", "익산시", "남원시", "한양시", "함흥시" };
		String[] strSub = new String[] { "국어", "영어", "수학" };
		// strName의 배열 수 만큼 정수형 배열 생성
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		// 조금 더 단축
		int arrLen = strName.length;
		int[] intMath = new int[arrLen];
		int[] intScoreSum = new int[arrLen];
		// strName의 배열 수 만큼 실수형 배열 생성
		float[] fScoreAvg = new float[arrLen];
		// Random class 선언
		Random rnd = new Random();
		
		// 점수 생성
		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		// 총점
		for (int i = 0; i < strName.length; i++) {
			intScoreSum[i] = intKor[i];
			intScoreSum[i] += intEng[i];
			intScoreSum[i] += intMath[i];
		}
		// 평균
		for (int i = 0; i < strName.length; i++) {
			fScoreAvg[i] = (float)intScoreSum[i] / 3;
		}

		System.out.println("================================================================");
		System.out.println("이름\t주소\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------------------");
		// 출력
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%3.2f\n", strName[i], strAd[i], intKor[i], intEng[i], intMath[i],
					intScoreSum[i], fScoreAvg[i]);
		}
		System.out.println("----------------------------------------------------------------");
	} // main() end
}