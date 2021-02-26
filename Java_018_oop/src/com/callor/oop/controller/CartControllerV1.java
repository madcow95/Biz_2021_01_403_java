package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

/*
 * Controller class
 * java project에서 COntroller 접미사가 붙어있는 class는
 * 보통 프로젝트의 시작 부분으로 사용된다.
 */

public class CartControllerV1 {
	
	public static void main(String[] args) {
		
		CartVO cartVO = new CartVO();
		cartVO.setCartUserName("홍길동");
		cartVO.setCartDate("2021-02-26");
		cartVO.setCartTime("10:44:00");
		cartVO.setCartPName("초코파이");
		cartVO.setCartQty(10);
		cartVO.setCartStd("바나나맛");
		cartVO.setCartPrice(1000);
		cartVO.setCartTotal(10 * 1000);
		System.out.println(cartVO.toString());
	}

}
