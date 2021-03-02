package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.service.impl.MenuServiceImplV1;
import com.callor.oop.service.impl.MenuServiceImplV2;

public class CartEx_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MenuServiceImplV1 msV1 = new MenuServiceImplV1();
		MenuServiceImplV2 msV2 = new MenuServiceImplV2();
		
		msV2.selectMenu();
		
		
	}

}
