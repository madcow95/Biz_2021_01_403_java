package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("과목명 : ");
		String strSub = scan.nextLine();
		System.out.print("점수 : ");
		int intScore = scan.nextInt();
		System.out.printf("%s : %d점\n",strSub,intScore);
		
		scan.nextLine();
		System.out.print("과목명 : ");
		strSub = scan.nextLine();
		System.out.print("점수 : ");
		intScore = scan.nextInt();
		System.out.printf("%s : %d점\n",strSub,intScore);

		scan.nextLine();
		System.out.print("과목명 : ");
		strSub = scan.nextLine();
		System.out.print("점수 : ");
		intScore = scan.nextInt();
		System.out.printf("%s : %d점\n",strSub,intScore);
		
		scan.nextLine();
		System.out.print("과목명 : ");
		strSub = scan.nextLine();
		System.out.print("점수 : ");
		intScore = scan.nextInt();
		System.out.printf("%s : %d점\n",strSub,intScore);
	}

}
