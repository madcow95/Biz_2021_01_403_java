package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_02 {
	
	public static void main(String args[]) {
		
		// Scanner 클래스를 객체로 생성하면서 운영체제의 키보드 시스템과 연결한다.
		Scanner scan = new Scanner(System.in);
		
			// 프롬프트에서는 println에서 ln을 빼고
			System.out.print("숫자입력 >> ");
			int intNum = scan.nextInt();
			// boolean bYes = intNum % 2 == 0;
			// if(bYes) {
			if(intNum % 2 == 0) {
				System.out.println(intNum + "은(는) 짝수");
			}
			else {
				System.out.println(intNum + "은(는) 홀수");
			}
	}

}
