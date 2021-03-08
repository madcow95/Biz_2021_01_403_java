package com.callor.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.VO.ScoreVO;
import com.callor.score.inter.ScoreService;
import com.callor.score.values.Values;

public class Service implements ScoreService {

	List<Integer> intList;
	String fileName;

	public Service() {
		intList = new ArrayList<Integer>();
		fileName = "src/com/callor/score/score.txt";
	}

	@Override
	public void makeScore() {
		// TODO 랜덤점수 100개 생성
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			// 랜덤점수 100개 생성, intList배열에 저장
			intList.add(rnd.nextInt(100) + 1);
		}
	} // end makeScore()

	@Override
	public void saveScoreToFile() {
		// TODO 랜덤점수 100개 txt파일로 만들어 저장

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			PrintWriter printer = new PrintWriter(fileWriter);
			
			for (int i = 0; i < intList.size(); i++) {
				// txt파일에 한줄에 5개씩만 입력
				printer.print(intList.get(i) + ":");
				if ((i + 1) % 5 == 0) {
					printer.println();
				}
			}
			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end saveScore..()

	@Override
	public void loadScoreFromFile() {
		// TODO 100개의 점수 5개씩 나누어 점수별로 정렬하고 합계, 평균까지 Console에 출력
		List<String> strList = new ArrayList<String>();
		List<ScoreVO> scoreVO = new ArrayList<ScoreVO>();
		FileReader read = null;
		BufferedReader buffer = null;

		try {
			// fileName을 불러오기
			read = new FileReader(fileName);
			// txt파일 한 줄씩 읽기
			buffer = new BufferedReader(read);

			while (true) {
				// 한 줄씩 읽은 내용을 str에 저장
				String str = buffer.readLine();
				if (str == null) {
					break;
				}
				// str에 저장된 내용(txt파일) 한 줄씩 strList 배열에 추가
				strList.add(str);
			} // end while
 			
			buffer.close(); // end BufferedReader
			read.close(); // end FileReader
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// strList의 배열 개수는 20개
		for (String str : strList) {
			
			ScoreVO sVO = new ScoreVO();
			// :가 있는 마지막 줄에 줄 바꾸기
			// 하고 줄 바꿀때마다 strScore 배열에 저장
			String[] strScore = str.split(":");
			// n번째 배열을 ScoreVO 클래스의 setter를 이용해 각각 점수에 저장
			sVO.setKor(Integer.valueOf(strScore[0])); // 각 점수마다 4개씩 들어가겠지?
			sVO.setEng(Integer.valueOf(strScore[1]));
			sVO.setMath(Integer.valueOf(strScore[2]));
			sVO.setMusic(Integer.valueOf(strScore[3]));
			sVO.setHistory(Integer.valueOf(strScore[4]));
			// 저장된 점수들을 scoreVO 배열에 저장 // 20개의 배열을 갖는 scoreVO
			scoreVO.add(sVO);
		}
		
		for (ScoreVO vo : scoreVO) {
			// ScoreVO 클래스의 getter를 이용해 각 점수 배열에 담긴 점수들을 불러와 더하고 sum setter에 저장
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;
			// ScoreVO setter에 총점수, 평균 저장
			vo.setSum(sum);
			vo.setAvg(avg);
		}

		System.out.println(Values.dLine);
		System.out.println("순번\t\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println(Values.sLine);
		int count = 0;
		// 점수 출력
		for (ScoreVO vo : scoreVO) {
			++count;
			System.out.printf("%d\t\t%d\t%d\t%d\t%d\t%d\t%d\t%3.2f\n",
					count,
					vo.getKor(),
					vo.getEng(),
					vo.getMath(),
					vo.getMusic(),
					vo.getHistory(),
					vo.getSum(),
					vo.getAvg());
		}
		System.out.println(Values.dLine);

	} // end loadScore...

}
