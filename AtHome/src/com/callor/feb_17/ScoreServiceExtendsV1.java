package com.callor.feb_17;

import java.util.Scanner;

public class ScoreServiceExtendsV1 extends ScoreServiceV4 {
	
	public int input(String subject) {
		
		Scanner scan = new Scanner(System.in);
		int intScore = 0;
		while(true) {
			System.out.print(subject + " 점수 입력 >> ");
			
			intScore = scan.nextInt();
			
			if(intScore < 0) {
				System.out.println(subject + " 점수는 0점 이상 입력");
			}
			else if(intScore > 100) {
				System.out.println(subject + " 점수는 100점 이하 입력");
			}
			else {
				break;
			}
		}
		return intScore;
		
		
		
		
		
	}
	
}
