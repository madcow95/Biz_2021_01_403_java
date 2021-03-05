package com.callor.shop.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.shop.model.ScoreVO;
import com.callor.shop.values.Values;

public class FileReader_02 {

	public static void main(String args[]) {
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<String> strLines = new ArrayList<String>();
		String fileName = "src/com/callor/shop/files/score.txt";
		/*
		 * 파일을 읽을 때 사용하는 클래스
		 */

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);

			/*
			 * fileReader를 사용한 저수준 코드 while (true) {
			 * 
			 * int ascii = fileReader.read(); if(ascii == -1) { break; }
			 * System.out.printf("%c\n", ascii); // 정수값으로 저장된 내용을 실제 문자로 바꿔달라 }
			 */
			// buffer : 임시 저장장치
			// List에 담아놓기
			buffer = new BufferedReader(fileReader);
			// text파일에 저장된 내용을 한줄씩 읽어오는 코드
			while (true) {
				String str = buffer.readLine();
				if (str == null) {
					break;
				}
				// System.out.println(str);

				strLines.add(str);
			} // end while
			buffer.close();
			fileReader.close();
			// List에 담아놓기

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 파일 읽기 끝

		for (String str : strLines) {

			String[] scores = str.split(":");
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setKor(Integer.valueOf(scores[0]));
			scoreVO.setEng(Integer.valueOf(scores[1]));
			scoreVO.setMath(Integer.valueOf(scores[2]));
			scoreVO.setMusic(Integer.valueOf(scores[3]));
			scoreVO.setHistory(Integer.valueOf(scores[4]));
			scoreList.add(scoreVO);
		}

		for (ScoreVO vo : scoreList) {

			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;
			vo.setTotal(sum);
			vo.setAvg(avg);
		}
		// 이렇게 컴퓨터를 끄거나 프로젝트를 종료해도 남아있는 파일을 만든다 : 영속성(persistance)
		System.out.println(Values.dLine);
		System.out.println("국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		for (ScoreVO vo : scoreList) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%3.2f\n",
					vo.getKor(),
					vo.getEng(),
					vo.getMath(),
					vo.getMusic(),
					vo.getHistory(),
					vo.getTotal(),
					vo.getAvg());
		}
		System.out.println(Values.dLine);
	}

}
