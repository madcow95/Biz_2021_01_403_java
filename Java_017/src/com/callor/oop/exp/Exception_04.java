package com.callor.oop.exp;

import com.callor.oop.model.ProductVO_02;

public class Exception_04 {
	
	public static void main(String[] args) {
		
		ProductVO_02[] pVOs = new ProductVO_02[3];
		
		//for(int i = 0; i < pVOs.length; i++) {
			// 근본적으로 exception이 발생하지 않도록 하는 코드
			pVOs[0] = new ProductVO_02();
		//}
		
		pVOs[0].strDName = "초코파이";
		System.out.println(pVOs[0]);
		
		// 객체가 초기화 되지 않은 상태에서 발생하는
		// exception을 처리하는 코드
		try {
			pVOs[1].strDName = "빅파이";	
		} catch (NullPointerException e) {
			System.out.println("객체가 초기화 되지 않았다.");
		}
		
	}

}
