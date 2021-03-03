package com.callor.shop.ex;

import com.callor.shop.CartMenuV1;

public class CartEx {

	public static void main(String[] args) {

		CartMenuV1 cmV1 = new CartMenuV1();
		
		while (true) {
			try {
				// cmV1의 cartMenu 실행하고 불러온 값을 select에 저장
				Integer select = cmV1.cartMenu();
				// 불러온 값이 null이면 while 중단
				if (select == null) {
					break;
				}
				// 오류 발생하면 아래 실행
			} catch (Exception e) {
				System.out.println("QUIT , 1 ~ 3 중에서만 입력하세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}

// main method에서 menu랑 service 사용하기 ==> menu에서 service를 사용하면 main은 보기 편하긴하지만
// 나중에 확장할때는 귀찮아진다.

// main에서 try를 사용하지말고 menu에서 try문을 사용해 처리하는게 낫다.

// 대문자와 소문자를 둘 다 검사하는거 **.equalsignore어쩌고

// 여기 menu에서 내가 귀찮아서 한 q , Q를 써도 종료되게 하는 거는 편해 보일순 있지만 사용자가 실수로 의도하지 않게 입력할 수도 있으니 지양하자.

// menu 클래스에 이중 if문이 있는데 그냥 if 하나 쓰고 else로 나머지를 처리하자

// 선언과 생성자에 초기화를 따로 하는이유 : 메모리 정리? 관리? 때문에

// 아따 할거많네
// 귀찮아도 정석을 따르자. 나중에 큰거할때 귀찮아질라

// 지금 기초 단계같은거에는 여기같은경우 service가 주(main)다. main method는 그냥 그걸 테스트 하는 용도 일뿐 main은 최대한 간단히 보이게
// service에서 만들고 main에서 테스트 해보고 하는 느낌으로

// 주석 줄마다 달자 ㅠㅠ