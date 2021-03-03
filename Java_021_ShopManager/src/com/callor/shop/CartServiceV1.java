package com.callor.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartServiceV1 implements CartService {

	Scanner scan;
	List<CartVO> cartList;

	public CartServiceV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}

	@Override
	public void inputCart() {
		// 입력
		System.out.print("손님이름 : ");
		String strName = scan.nextLine();

		System.out.print("상품이름 : ");
		String strProName = scan.nextLine();

		int intQty = 0;
		while (true) {
			try {
				System.out.print("수량 : ");
				String strQty = scan.nextLine();
				intQty = Integer.valueOf(strQty);
				if (intQty < 1) {
					System.out.println("수량은 1 이상을 입력해주세요.");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자만 입력해주세요.");
			}
		}

		int intPrice = 0;

		while (true) {
			try {
				System.out.print("단가 : ");
				String strPrice = scan.nextLine();
				intPrice = Integer.valueOf(strPrice);

				if (intPrice < 100) {
					System.out.println("단가는 100 이상을 입력해주세요");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자만 입력해주세요.");
			}
		}
		int intTotal = intQty * intPrice;
		
		// 입력한 값 cartList배열에 저장
		CartVO cartVO = new CartVO();
		cartVO.setUserName(strName);
		cartVO.setProductName(strProName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intPrice);
		cartVO.setTotal(intTotal);
		cartList.add(cartVO);

	}

	@Override
	public void printCart() {

		int nSize = cartList.size();
		// 단가의 총합
		int totalSum = 0;
		// 항목 개수
		int listCount = 0;
		System.out.println("구매자\t상품명\t수량\t단가\t총합");
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					cartList.get(i).getUserName(),
					cartList.get(i).getProductName(),
					cartList.get(i).getQty(),
					cartList.get(i).getPrice(),
					cartList.get(i).getTotal());
			totalSum += cartList.get(i).getTotal();
			++listCount;
		}
		System.out.println("---------------------------------");
		System.out.println("합계\t" + listCount + "가지\t\t\t" + totalSum);
	}

	@Override
	public void printUser() {

		System.out.println("=================================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("---------------------------------");
		System.out.print("이름 >> ");
		String printName = scan.nextLine();
		int nSize = cartList.size();
		int listCount = 0;
		int totalSum = 0;
		System.out.println("구매자\t상품명\t수량\t단가\t총합");
		for (int i = 0; i < nSize; i++) {
			// 입력한 값과 저장된 값이 같을경우 아래 코드 실행
			if (printName.equals(cartList.get(i).getUserName())) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\n",
						cartList.get(i).getUserName(),
						cartList.get(i).getProductName(),
						cartList.get(i).getQty(),
						cartList.get(i).getPrice(),
						cartList.get(i).getTotal());
				totalSum += cartList.get(i).getTotal();
				++listCount; 		
			}
		}
		System.out.println("---------------------------------");
		System.out.println("합계\t" + listCount+ "가지\t\t\t" + totalSum);

	}

}
