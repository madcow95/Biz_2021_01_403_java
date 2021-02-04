package com.callor.varriable;

public class HomePractice_03 {
	
	public static void main(String args[]) {
		
		int num1 = 0;
		int intDan = 0;
		
			num1 = 1;
			intDan = 2;
		for(; num1 < 10 ;) {
			
					System.out.println(intDan + " x " + num1 + " = " + (intDan * num1));
			num1 += 1;
			
			for(intDan = 1 ; intDan < 10 ; intDan += 1 ) {
				
					System.out.println(intDan + " x " + num1 + " = " + intDan * num1);
					num1 += 1;
					intDan += 1;
			}
		
		}
	}

}
