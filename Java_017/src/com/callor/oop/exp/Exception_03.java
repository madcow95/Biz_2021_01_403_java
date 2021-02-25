package com.callor.oop.exp;

import com.callor.oop.model.ProductVO_02;

public class Exception_03 {

	public static void main(String[] args) {

		ProductVO_02 pVO = null;
		int[] intNums = new int[3];

		// 개발자가 예상하지 못한 상황을 대비?
		try {
			intNums[2] = 100; // exception 처리완료
			intNums[2] = Integer.valueOf("3"); // exception 처리완료
			pVO.strDName = "야채참치";
		}
		
		// 가장 많이 볼 수 있는 오류 3가지
		catch(NullPointerException ep) {
			System.out.println("객체가 생성되지 않았는데 사용하려고 시도함");
		}
		
		catch (NumberFormatException en) {
			System.out.println("문자열을 정수로 변환하는 과정에서 문제 발생");
		}
		
		// 배열의 범위를 벗어난 오류 처리
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("배열의 범위를 벗어났습니다.");
		}

	}
}
