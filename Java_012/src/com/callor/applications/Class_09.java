package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {
	
	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇 단? (2 ~ 9 중 정수만) >> ");
		int intDan = scan.nextInt();
		
		//csV7.gugu(intDan);
	}

}
