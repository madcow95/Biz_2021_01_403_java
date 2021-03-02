package com.callor.practice;

import java.util.Scanner;

import com.callor.test.YourGuGuDan;

public class Practice_04 {
	
	public static void main(String[] args) {
		// YourGuGuDan 클래스의 코드를 Scanner코드를 이용해 숫자를 직접입력해서 YourGuGuDan의 코드 사용
		YourGuGuDan yourGu = new YourGuGuDan();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2~9수 입력 >");
		int num = scan.nextInt();
		yourGu.print(num);
		
	}

}
