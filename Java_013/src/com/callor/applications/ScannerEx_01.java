package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_01 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		//scan.nextLIne();은 앞에 String 변수 꼴로 나와야 인식이 가능하다.
		System.out.println("두 개의 정수를 입력하세요");
		System.out.print("첫번째 숫자 >> ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 >> ");
		int num2 = scan.nextInt();
		scan.nextLine();
		System.out.print("이름 : ");
		String strName = scan.nextLine();
		// 문자열 입력하고 숫자를 입력하면 괜찮은데 숫자를 입력하고 문자를 입력하려고 하면 문자는 안된다 왜? 버그래
		// 그래서 숫자열 뒤에 문자열을 입력하기 위해서는 scan.nextLine(); 열을 하나 추가해줘서 강제로 입력될 수 있게 한다.
	
		System.out.println(num1 + num2);
		System.out.println("30" + "40");
		System.out.println(strName);
	}

}
