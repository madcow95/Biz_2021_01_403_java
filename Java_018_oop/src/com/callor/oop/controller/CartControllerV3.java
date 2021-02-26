package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<CartVO> cartList = new ArrayList<CartVO>();
		System.out.println("==========================");
		System.out.println("쇼핑카트 테스트");
		System.out.println("--------------------------");
		
		CartVO cartVO = new CartVO();
		
		System.out.print("이름 입력 : ");
		String cartUName = scan.nextLine();
		cartVO.setCartUserName(cartUName);
		
		System.out.print("상품명 입력 : ");
		String pName = scan.nextLine();
		cartVO.setCartPName(pName);
		
		System.out.print("수량 : ");
		String qty = scan.nextLine();
		int intQty = Integer.valueOf(qty);
		cartVO.setCartQty(intQty);
		
		System.out.print("가격 : ");
		// 3000 이라고 입력하면 "3000" 으로 입력되어
		// 문자열이다
		String price = scan.nextLine();
		// "3000" 문자열형 숫자를 정수 3000으로 변경하여 intPrice 변수에 저장
		int intPrice = Integer.valueOf(price);
		cartVO.setCartPrice(intPrice);
		// cartList에 cartVO[0] 추가
		cartList.add(cartVO);
				
		System.out.println("=============================");
		System.out.println("1번 구매내역");
		System.out.println("-----------------------------");
		System.out.println("이름\t상품명\t수량\t가격");
		// 출력
		cartList.get(0);
		System.out.printf("%s\t%s\t%d\t%d\n",cartVO.getCartUserName(),
				cartVO.getCartPName(),
				cartVO.getCartQty(),
				cartVO.getCartPrice());
		System.out.println();
		CartVO[] cartVO2 = new CartVO[3];
		
		for(int i = 0; i < cartVO2.length; i++) {
			cartVO2[i] = new CartVO();
		}
		
		for(int i = 0; i < cartVO2.length; i++) {
			System.out.print((i+2) + "번 이름 입력 : ");
			cartUName = scan.nextLine();
			cartVO2[i].setCartUserName(cartUName);
			
			System.out.print("상품명 입력 : ");										// 배열 안쓰고 해보자
			pName = scan.nextLine();
			cartVO2[i].setCartPName(pName);
			
			System.out.print("수량 : ");
			qty = scan.nextLine();
			intQty = Integer.valueOf(qty);
			cartVO2[i].setCartQty(intQty);
			
			System.out.print("가격 : ");
			price = scan.nextLine();
			intPrice = Integer.valueOf(price);
			cartVO2[i].setCartPrice(intPrice);
			
			cartList.add(cartVO2[i]);
			cartList.get(i);
			
			System.out.println("=============================");
			System.out.println((i + 2) + "번 구매내역");
			System.out.println("-----------------------------");
			System.out.println("이름\t상품명\t수량\t가격");
			System.out.printf("%s\t%s\t%d\t%d\n",cartVO2[i].getCartUserName(),
					cartVO2[i].getCartPName(),
					cartVO2[i].getCartQty(),
					cartVO2[i].getCartPrice());
			System.out.println();
		}
		
	}// main end
}
