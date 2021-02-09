package com.callor.start;

public class Multiple_01 {
	
	public static void main(String args[]) {
		
		int intNum = 0;
		int i2 = 0;
		int intSum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			i2 = i + 1;
			boolean bYes1 = i2 % 3 == 0;
			boolean bYes2 = i2 % 9 == 0;
			
			// 3의 배수이면서(and) 9의 배수
			if(bYes1 && bYes2) {
				intSum += i2;
				System.out.println(intSum + "는 3과 9의 배수");
			}
		}
		System.out.println(intSum + "는 3과 9의 배수의 합");
		
		System.out.println("==============================");
		
		intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			int num1 = i + 1;
			boolean bYes1 = num1 % 3 == 0;
			boolean bYes2 = num1 % 9 == 0;
			
			// if() 비교연산문을 중복처리하는 방식
			if(bYes1) { // 3의 배수를 검사하고 맞으면
				if(bYes2) { // 다시 9의 배수를 검사
					intSum += num1;
					System.out.println(num1);
				}
			}
		}
		System.out.println(intSum);
			//if(bYes1) {
			//	intNum = i2;
			//	System.out.print(intNum + "은 3의 배수" + "\t");
			//}
		
			//intNum = 0;
			
			//if(bYes2) {
				//intNum = i2;
				//System.out.println(intNum + "은 9의 배수");
			//}
			//intSum += intNum;
		
		//System.out.println(intSum + "은 3과 9의 최소공배수의 합");
	}
}
