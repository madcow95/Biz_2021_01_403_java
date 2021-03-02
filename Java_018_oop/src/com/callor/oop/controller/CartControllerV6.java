package com.callor.oop.controller;

/*
 *  Controller class
 *  web application 프로젝트를 수행할 때
 *  처음 시작하는 시작점 class
 *  
 *  Service 등 모듈 class를 객체로 선언하고
 *  모듈 class에 method들을 호출하는 일만 수행
 */
import com.callor.oop.service.CartServiceV2;

public class CartControllerV6 {

	public static void main(String[] args) {
		
		CartServiceV2 csV2 = new CartServiceV2(); 
		
		csV2.inputCart();
		csV2.printCart();
	}

}
