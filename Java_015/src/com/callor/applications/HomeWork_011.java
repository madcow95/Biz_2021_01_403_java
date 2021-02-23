package com.callor.applications;

import java.util.Random;

public class HomeWork_011 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int rndNum = 0;
		for(int i = 0; i < 100; i++) {
			
			rndNum = rnd.nextInt(100) + 1;
		}
		
	}

}
