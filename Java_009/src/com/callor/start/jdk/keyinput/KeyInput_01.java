package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_01 {
	
	// 키보드로 숫자 2개를 입력받고
	// 두 숫자의 덧셈을 계산
	public static void main(String args[]) {
		
		System.out.println(); // Console 출력문

		// Scanner : 키보드로 입력한 무엇을 system.in(키보드)에서 가져와라
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력 >>  "); 
		// 숫자를 입력받기 위한 : scan.nextInt
		int intNum1 = scan.nextInt();
		// 여기 다다르면 일단 멈추고 키보드로 뭘 입력하기를 기다림(숫자만)
		// Console에 숫자를 입력했으면 그 값을 정수로 만들어서 가져온다음 intNum1에 저장해라		
		System.out.println("두 번째 숫자를 입력 >> ");
		int intNum2 = scan.nextInt();
		
		System.out.println(intNum1 + intNum2);
		// 진행은 되는데 Console에 뭐 안뜨는중
		// 키보드로 뭘 입력하길 기다리는 상태
		// Console에서 입력
		
		
	}

}
