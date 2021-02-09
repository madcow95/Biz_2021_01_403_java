package com.callor.start.jdk.keyinput;

import java.util.Scanner;

/*
 * 배경설명 : 알아서 설명
 * 
 * 1. Random 클래스를 사용하여 1 ~ 100 임의의 수를 생성하여 rndNum 변수에 담아 놓는다.
 *  
 * 2. Console에 "숫자입력 >> " 프롬프트를 보여주고
 * 3. 1 ~ 100 까지 정수를 입력받는다.
 * 4. 입력받은 정수와 rndNum 변수에 저장된값을 비교하여
 * 5. 큰가, 작은가를 알려주고
 * 6. rndNum에 저장된 값을 맞추는 게임
 * 
 * 7. 2 부터 5까지를 계속 반복하면서 값을 맞춘다.
 * 8. 만약 정수값에 -1을 입력하면 게임을 중단한다.
 */
public class LopingGame2 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.print("Press Number >> ");
		int num = scan.nextInt();
		a = 1;
		b = 2;
		c = 3;
		
			if(a % 1 == 0) {
				System.out.print("Strike");
			}
			
			if(b % 2 == 0) {
				System.out.println("Strike");
			}
			// 못하겠다 야구게임 만드는거는	
		
	}

}









