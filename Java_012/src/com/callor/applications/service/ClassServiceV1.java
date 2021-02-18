package com.callor.applications.service;

public class ClassServiceV1 {
	
	public void add(int intNum1, int intNum2, double dNum, float fNum) {
		
		System.out.println("정수 2개의 덧셈");
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println("==========================");
		System.out.println("정수와 float형 실수의 덧셈");
		System.out.println(intNum1 + " + " + fNum + " = " +(intNum1 + fNum));
		System.out.println("==========================");
		System.out.println("double형 실수와 float형 실수의 사칙연산");
		System.out.println(dNum + " + " + fNum + " = " + (dNum + fNum));
		System.out.println(dNum + " - " + fNum + " = " + (dNum - fNum));
		System.out.println(dNum + " x " + fNum + " = " + (dNum * fNum));
		System.out.println(dNum + " / " + fNum + " = " + (dNum / fNum));
	}
	
	
}
