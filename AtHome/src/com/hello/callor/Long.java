package com.hello.callor;

import java.util.Random;

public class Long {
	
	public static void main(String args[]) {
		
		Random rnd = new Random();
		long num = rnd.nextLong();
		
		int num1 = rnd.nextInt();
		
		double num2 = rnd.nextDouble();
		
		int i = 12345678;
		long i2 = 12345678987l;
		
		char ch1 = 'Z';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 38;
		System.out.println(ch2);
		
		int ch3 = 97;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -65;
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
	}

}
