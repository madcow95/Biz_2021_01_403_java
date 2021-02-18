package com.callor.applications;

import com.callor.applications.service.ClassServiceV6;

public class Class_08 {
	
	public static void main(String[] args) {

		ClassServiceV6 csV6 = new ClassServiceV6();
		
		int num1 = 88;
		int num2 = 99;
		
		int add = csV6.add(num1, num2);
		int subst = csV6.substraction(num1, num2);

		// System.out.println("add : " + add);
		// System.out.println("subst : " + subst);
		System.out.printf("%d와 %d의\n덧셈 : %d\n뺄셈 : %d",num1,num2,add,subst);
	}
}
