package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_01 {

	public static void main(String args[]) {

		Integer.valueOf("3");

		// try ctrl + space
		// try catch : 예외처리
		try {
			Integer.valueOf("");
			// Number ctrl + space
		} catch (NumberFormatException e) {
			System.out.println("null 값은 숫자로 변환할 수 없음");
			// TODO: handle exception
		}

		// 쓸 수도 없고 if문으로 찾을 수도 없다.
		// boolean bYes = 3 == "3";
		// if(3 == "3") {}

		Scanner scan = new Scanner(System.in);
		System.out.println("0 이상의 정수를 입력");
		System.out.print(">> ");
		String strNum = scan.nextLine();

		// Exception 은 if문으로 잡아낼 수가 없다.

		try {
			int intNum = Integer.valueOf(strNum);
			if (intNum < 0) {
				System.out.println("정수 0 이상을 입력하세요!!!");
			} else {
				System.out.println("입력한 정수는 : " + intNum);
			}
			// java에서 발생하는 모든 exception을 catch 하겠다
			// 
		} catch (Exception e) {
			System.out.println("반드시 숫자로 입력해주세요");
			// TODO: handle exception
		}

	}

}
