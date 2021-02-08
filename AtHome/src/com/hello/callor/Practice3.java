package com.hello.callor;

public class Practice3 {
	// 0 ~ 100 에서 4의 배수들을 Console에 나타내고 그 수들의 합을 표현
	public static void main(String args[]) {
		
		int intSum = 0;
		int i = 0;
		int num = 0;
		
		for(i = 0 ; i < 100 ; i++) {
			
			boolean bYes = i % 4 == 0;
			
			if(bYes) {
				intSum = i;
				System.out.println(intSum + "은 4의배수");
				num += intSum;
			}
		}
		System.out.println(num);
	}
}
