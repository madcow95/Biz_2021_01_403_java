package com.callor.score;

import java.util.Random;

public class Lottos_01 {

	public static void main(String args[]) {

		Random rnd = new Random();
		int[] nums = new int[45];

		for (int i = 0; i < nums.length; i++) {

			nums[i] = i + 1;
		}
		for (int i = 0; i < 1000; i++) {
			int num1 = rnd.nextInt(45);
			int num2 = rnd.nextInt(45);

			int temp = nums[num1];
			nums[num1] = nums[num2];
			nums[num2] = temp;
		}

	}

}
