package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();
		// 배열에서는 배열.length 값을 참조하면
		// 배열의 개수를 알 수 있었다.
		// List에서는 list.size() method를 호출하면
		// List의 개수를 return 해준다.
		// 현재 list에 담겨있는 개수를 세는 code가 실행
		// 그리고 나서 그 갯수를 return;

		for (int i = 0; i < 3; i++) {
			CartVO cartVO = new CartVO(); // 이거를 아래 쪽에 보내고
			// 제목
			System.out.println("======================================================");
			System.out.println("쇼핑카트 상품추가");
			System.out.println("------------------------------------------------------");

			// 입력
			System.out.print("구매자 >> ");
			String strUserName = scan.nextLine();

			System.out.print("상품명 >> ");
			String strPName = scan.nextLine();
			/*
			 * 데이터를 키보드에서 입력받은 부분과 VO에 담아 리스트에 추가하는 부분을 분리하여 코딩할 경우 키보드에 입력한 값을 정수변환하여 값을
			 * 담아둘 intQty 변수를 while() 실행 이전에 선언해 주어야한다.
			 */
			// int intQty = 0; 넣어서 해보기
			while (true) {
				System.out.print("수량 >> ");
				String strQty = scan.nextLine();
				try {
					int intQty = Integer.valueOf(strQty);
					if (intQty >= 1) {
						cartVO.setCartQty(intQty);
						break;
					} else {
						System.out.println("1이상의 수를 입력하세요");
						continue;
					}
				} catch (NumberFormatException e) {
					System.out.println("수량은 숫자로 입력하세요");
				}
			} // end while

			while (true) {
				System.out.print("단가 >> ");
				String strPrice = scan.nextLine();

				try {
					int intPrice = Integer.valueOf(strPrice);
					if (intPrice >= 1000) {
						cartVO.setCartPrice(intPrice);
						break;
					} else {
						System.out.println("1000이상의 수를 입력하세요");
						continue;
					}
				} catch (NumberFormatException e) {
					System.out.println("가격은 숫자로 입력하세요");
				}
			} // end while

			// 카트 정보 생성
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);

			// 카트 정보 리스트 추가
			cartList.add(cartVO);

		} // end for
		System.out.println("======================================================");
		System.out.println("구매자\t상품명\t수량\t단가");
		System.out.println("======================================================");
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\n", cartList.get(i).getCartUserName(), cartList.get(i).getCartPName(),
					cartList.get(i).getCartQty(), cartList.get(i).getCartPrice());
		}

	} // main end

}
