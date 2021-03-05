package com.callor.score;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class MakeScore {

	private Integer[] rndNum;
	private ScoreVO sVO;
	
	public MakeScore() {
		rndNum = new Integer[100];
	}

	public void rndNumMake() {
		
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			rndNum[i] = rnd.nextInt(100) + 1;
		}
	}

	public void fileMake() {

		FileWriter fileWrite = null;
		PrintWriter printer = null;

		String strScore = "src/com/callor/score/score.txt";

		try {
			fileWrite = new FileWriter(strScore);
			printer = new PrintWriter(fileWrite);

			for (int i = 0; i < 100; i++) {
				printer.print(rndNum[i] + "\t");
				if((i + 1) % 5 == 0) {
					printer.println();
				}
			}
			
			printer.close();
			fileWrite.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block // txt파일까지 만들기 완료
			e.printStackTrace();
		}

	}

}
