package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = rnd.nextInt(100) + 1;
		System.out.print("숫자 입력 >> ");
		// int keyNum = sca.nextInt(); <- 는 선생님이 쓴거
		int num = scan.nextInt();
		
		boolean bYes1 = num > num1;
		boolean bYes2 = num == num1;
		boolean bYes3 = num < num1;
		
		// if(keyNum > num1) 이런식으로 해도됨
		// 1.
		if(bYes1) {
			System.out.println(num + "은(는) " + num1 + "보다 크다.");
		}
		// 2.
		else if(bYes2) {
			System.out.println(num + "은(는) " + num1 + "과(와) 같다.");
		}
		// 3.
		else if(bYes3) {
			System.out.println(num + "은(는) " + num1 + "보다 작다.");
		}
	}	// 1. keyNum > num1 이냐?
		// 맞으면 "크다 표시"하고 종료
		// 2. 그렇지 않으면 keyNum == num1 이냐?
		// 맞으면 "같다 표시"하고 종료
		// 3. 그렇지 않으면 Keynum < num1 이냐?
		// 맞으면 "작다 표시"하고 종료

}
