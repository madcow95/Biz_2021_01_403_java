package com.callor.varriable;

public class HomePractice {
	
	public static void main(String args[]) {
		
		int num = 0;
		int intDan = 0;
		
		for(num = 1 ; num < 10 ; num += 1) {
			
			intDan = 4;
			System.out.print(intDan);
			System.out.print(" x ");
			System.out.print(num);
			System.out.print(" = ");
			System.out.println(intDan * num);
		}
		
		for(num = 1 ; num < 10 ; num += 1) {
			intDan = 2;
			System.out.println(intDan + " x " + num + " = " + intDan * num);
		}
			intDan = 3;
		for(num = 1 ; num < 10 ; num += 1) {
			
			System.out.println(intDan + " x " + num + " = " + intDan * num);
		}
		
		int num1 = 0;
		int num2 = 0;
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		num1 = 30;
		num2 = 40;
		
		result1 = num1 + num2;
		result2 = num1 * num2;
		result3 = num2 - num1;
		result4 = num2 / num1;
		result5 = num2 % num1;
				
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
