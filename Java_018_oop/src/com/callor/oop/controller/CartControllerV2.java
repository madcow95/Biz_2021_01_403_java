package com.callor.oop.controller;

import java.util.ArrayList;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {
	
	public static void main(String[] args) {
		
		CartVO[] cartVO = new CartVO[3];
		
		for(int i = 0; i < cartVO.length ; i++) {
			cartVO[i] = new CartVO();
		}
		
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartPName("노트북");
		cartVO[0].setCartStd("사무용");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("10:57:00");
		cartVO[0].setCartQty(1);
		cartVO[0].setCartPrice(10000);
		cartVO[0].setCartTotal(1 * 10000);
		System.out.println(cartVO[0].toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		cartVO[1].setCartUserName("이몽룡");
		cartVO[1].setCartPName("컴퓨터");
		cartVO[1].setCartStd("조립형");
		cartVO[1].setCartDate("1995-03-13");
		cartVO[1].setCartTime("00:01:15");
		cartVO[1].setCartQty(2);
		cartVO[1].setCartPrice(20020);
		cartVO[1].setCartTotal(2 * 20020);
		System.out.println(cartVO[1].toString());
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		cartVO[2].setCartUserName("성춘향");
		cartVO[2].setCartPName("태블릿");
		cartVO[2].setCartStd("애플꺼");
		cartVO[2].setCartDate("2019-04-01");
		cartVO[2].setCartTime("14:02:12");
		cartVO[2].setCartQty(3);
		cartVO[2].setCartPrice(30400);
		cartVO[2].setCartTotal(3 * 30400);
		System.out.println(cartVO[2].toString());
		
		// === cartVO의 개수가3인 상태
		// 상품 한가지를 더 카트에 넣고싶다.
		
		cartVO = new CartVO[4];
		// 아예 cartVO 배열을 새롭게 선언해버려서
		// 위에 작성한 내용들이 다 날아가 버린다.
		cartVO[3] = new CartVO();
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPName("바나나우유");
		
		System.out.println("===========================");
		System.out.println("카트 내용");
		System.out.println("===========================");
		
		for(int i = 0; i < cartVO.length; i++) {
//			System.out.printf("%s 장바구니\n",cartVO[i].getCartUserName());
//			System.out.printf("제품명 : %s\n",cartVO[i].getCartPName());
//			System.out.printf("규격 : %s\n",cartVO[i].getCartStd());
//			System.out.printf("날짜 : %s\n",cartVO[i].getCartDate());
//			System.out.printf("시간 : %s\n",cartVO[i].getCartTime());
//			System.out.printf("수량 : %d\n",cartVO[i].getCartQty());
//			System.out.printf("가격 : %d\n",cartVO[i].getCartPrice());
//			System.out.printf("총 가격 : %d\n",cartVO[i].getCartTotal());
//			System.out.println("----------------------------");
		}
		
	}

}
