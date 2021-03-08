package com.callor.score;

import java.util.Random;

public class Lottos_01 {

	public static void main(String args[]) {
		
		// nums[0 ~ 44]의 45개 배열 생성
		int[] nums = new int[45];

		for (int i = 0; i < nums.length; i++) {

			nums[i] = i + 1;
		}
		
		Random rnd = new Random();
		for (int i = 0; i < 1000; i++) {
			int num1 = rnd.nextInt(45);
			int num2 = rnd.nextInt(45);

			int temp = nums[num1];	 // nums[0 ~ 44(num1)] 의 배열에 저장된 수(1 ~ 45)중 하나 temp에 임시저장 
			nums[num1] = nums[num2]; // nums[0 ~ 44(num2)] 배열을 nums[num1] 배열에 저장
			nums[num2] = temp;		 // nums[num2]배열에 nums[num1]의 값이 저장된 temp 저장
		}							 // ==> nums[num1]의 값과 nums[num2]의 값이 전환
		
		// 로또번호 6개 추첨위한 배열 6개 생성
		int[] lottos = new int[6];
		// nums[0 ~ 44] 배열에 저장된 수인 1 ~ 45의 수중 6개 lottos[0 ~ 5]배열에 저장
		for (int i = 0; i < 6; i++) {
			lottos[i] = nums[i];
		}
		
		System.out.println("정렬 전");
		for(int n : lottos) {
			System.out.print(n + ",");
		}
		
		System.out.println();
		
		for(int i = 0; i < lottos.length; i++) {
			for(int j = i + 1; j < lottos.length; j++) {
				if(lottos[i] > lottos[j]) {
					int temp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int n : lottos) {
			System.out.print(n + ",");
		}

	}

}
