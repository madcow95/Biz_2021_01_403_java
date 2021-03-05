package com.callor.shop.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_02 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		String strRanNum = "src/com/callor/shop/files/nums.txt";
		// 배열을 만들고 배열에 난수 채워넣기
		int[] intNum = new int[100];
		
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(1000) + 1;
		}
		
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(strRanNum);
			printWriter = new PrintWriter(fileWriter);

			// nums 배열에 담긴 전체리스트를 향상된 for로 반복하면서 파일에 출력
			for(int n : intNum) {
				printWriter.println(n);
			}
			//for (int i = 0; i < intNum.length; i++) {
			//	printWriter.println(intNum[i]);
			//}
			
			printWriter.close();
			fileWriter.close();
			System.out.println("저장완료");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
