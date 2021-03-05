package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_03 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		String strRanNum = "src/com/callor/shop/files/nums.txt";
		
		// List를 만들어서 Random수 저장하기
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) {
			// 1번 코드
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
			
			// 2번 코드
			intList.add(rnd.nextInt(1000) + 1);
		}
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		// try안에서는 최소화? for문을 최소화?
		try {
			fileWriter = new FileWriter(strRanNum);
			printer = new PrintWriter(fileWriter);

			// intList에 담긴 전체리스트를 향상된 for로 반복
			for(int n : intList) {
				printer.println(n);
			}
			
			// 표준형 for로 반복
			int nSize = intList.size();
			for(int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}
			
			printer.close();
			fileWriter.close();
			System.out.println("저장완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
