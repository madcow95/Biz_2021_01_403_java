package com.callor.feb_17;

public class Feb_17_06 {
	
	public void print(int intKor, int intEng, int intMath) {
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float fAvg = intSum /3f;
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println();
		System.out.print(intKor);
		System.out.print("\t");
		System.out.print(intEng);
		System.out.print("\t");
		System.out.print(intMath);
		System.out.print("\t");
		System.out.print(intSum);
		System.out.print("\t");
		System.out.println(fAvg);
		
	}

}
