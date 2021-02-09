package com.hello.callor;
// 1 ~ 100 에서 2와 7의 배수를 표현하고
// 최소공배수의 합을 구해라
public class PracticeMulti2 {
	
	public static void main(String args[]) {
		
		int intSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int i2 = i + 1;
			
			boolean bYes1 = i2 % 2 == 0;
			boolean bYes2 = i2 % 7 == 0;
			
			if(bYes1 && bYes2) {
				System.out.println(i2 + "는 2와 7의 배수");
				intSum += i2;
			}
		}
		System.out.println(intSum + "은 2와 7의 배수의 합");
		
		
	}

}
