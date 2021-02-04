package com.callor.varriable;

public class HomePractice_02 {
	
	public static void main(String args[]) {
		
		int num1 = 0;
		int intDan = 0;
		
		System.out.println(" ==============");
		System.out.println("｜   구구단   ｜");
		System.out.println(" ==============");
		
		for(num1 = 9 ; 0 < num1 ; num1 -= 1) {
			intDan = 9;
			
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1 );
		}
		/*
		 * num1 = 9네? 0보다 크네? ㅇㅋ 내려가 연산 다 하고 Console에 출력했어 -1해야되네? 했어 이제 num1 은 8이야 이거도 0보다 크네? ㅇㅋ 내려가 ~~~ 
		 * 이제 num1 = 1이야 -1해야되네? 했어 이제 num1 = 0이야 이제 포함안되네? ㅇㅋ 루프 끝 다음 
		 * 요런 느낌으로 진행된다
		 */
			System.out.println();			
		for(num1 = 9 ;0 < num1 ; num1 -= 1) {
			intDan = 8;
				
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1 );
		}	
		
		System.out.println();
		for(num1 = 9 ; 0 < num1 ; num1 -= 1) {
			intDan = 7;
				
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1 );
		}	
		
		System.out.println();
		for(num1 = 9 ; 0 < num1 ; num1 -= 1) {
			intDan = 6;
				
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1 );
		}		
		
		System.out.println();
		for(num1 = 1 ; num1 < 10 ; num1 += 1) {
			intDan = 5;
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1);
		}
		
		System.out.println();
		for(num1 = 1 ; num1 < 10 ; num1 += 1) {
			intDan = 4;
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1);
		}
		
		System.out.println();
		for(num1 = 1 ; num1 < 10 ; num1 += 1) {
			intDan = 3;
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1);
		}
		
		System.out.println();
		for(num1 = 1 ; num1 < 10 ; num1 += 1) {
			intDan = 2;
			System.out.println(intDan + " x " + num1 + " = " + intDan * num1);
		}
		
		System.out.println();
		
		for(num1 = 1 ; num1 < 10 ; num1 += 1) {
			intDan = 1;
			intDan += 1;
			
			System.out.print(intDan);
			System.out.print(" x ");
			System.out.print(num1);
			System.out.print(" = ");
			System.out.println(intDan * num1);
		}
				
				
			
			
		
	}

}
