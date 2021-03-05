package com.callor.shop;

import java.util.Scanner;

import com.callor.shop.model.CartVO;

public class CartEx_04 {
	
	public static void main(String args[]) {
		
		// 매개변수가 없는 생성자를 호출하여 객체를 생성하고 setter method를 사용하여 데이터 저장
		CartVO vo1 = new CartVO();
		vo1.setUserName("홍길동");
		vo1.setProductName("초코파이");
		vo1.setQty(10);
		vo1.setPrice(1000);
		
		// 매개변수가 있는 생성자를 호출하여 객체를 생성하면서 동시에 데이터를 저장
		CartVO vo2 = new CartVO("홍길동","신라면",20,50);
		CartVO vo3 = new CartVO("사이다","성춘향",20,50);
		// 처럼 바뀌어도 뭐가 맞는지 몰라서 각각 장단점이 있다.
		
		// 매개변수가 있는 생성자일 것이다.(System.in)을 받는
		Scanner scan = new Scanner(System.in);
		
	}

}
