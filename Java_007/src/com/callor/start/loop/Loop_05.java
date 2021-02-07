package com.callor.start.loop;

public class Loop_05 {
	
	public static void main(String args[]) {
		
		int intSum = 0;
		
		for(int i = 0 ; i < 10 ; i += 2) {
			
			intSum += (i + 1);
			// 여기 끝난 후 intSum 값이 사라지는게 아니라 저장이 되어서 다음 loop 때도 남아서 같이 계산
			
			
		}
		System.out.println("0 ~ 10 까지 중 홀수의 합 : " + intSum);
		
		// 1,3,5,7,9
		// intSum을 clear 하지 않으면 이후의 계산 결과가 엉뚱한 값이 나온다.
		intSum = 0; 
		for(int i = 1 ; i < 10 ; i += 2) {
			// 2,4,6,8,10
			intSum += (i + 1);
		}
		System.out.println(intSum);
		
		// 0,2,4,6,8
		intSum = 0;
		for(int i = 0 ; i < 10 ; i += 2) {
			
			intSum += i;
		}
		System.out.println(intSum);
	}

}
