package com.callor.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_03 {
	
	public static void main(String args[]) {
		
		// java 프로젝트에서 List 객체를 생성하기
		// List class를 사용하여 객체를 선언하고, ArrayList() 생성자를 호출하여 객체를 초기화한다.
		// 적극 권장하는 list 객체
		List<String> strList1 = new ArrayList<String>();
		
		// intList1 선언'만'
		// List로 선언을 하면 뒤에 뭘 붙여도 ㅇㅋ?
		List<Integer> intList;
		intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();
		
		// ArrayList로 선언해서 Arraylist만 error가 안난다.
		ArrayList<Integer> intArrayList;
		intArrayList = new ArrayList<Integer>();
		//intArrayList = new LinkedList<Integer>();
		//intArrayList = new Vector<Integer>();
			
	}

}
