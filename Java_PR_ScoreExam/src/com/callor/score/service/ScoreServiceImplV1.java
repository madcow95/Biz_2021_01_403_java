package com.callor.score.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.ScoreService;
import com.callor.score.values.ValLine;
import com.callor.score.vo.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> scoreList;
	private ScoreVO vo;
	private String[] str = new String[] { "국어", "영어", "수학", "음악" };
	private int[] sub = new int[4];

	public ScoreServiceImplV1() {
		fileName = "src/com/callor/score/data/score.txt";
		scoreList = new ArrayList<ScoreVO>();
		vo = new ScoreVO();
	}

	@Override
	public Integer makeScore() {
		// TODO Scanner를 이용해 점수 만들기
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("학번입력 / (종료하려면 Q) : ");
			String strNum = scan.nextLine();
			if (strNum.equals("Q")) {
				System.out.println("메뉴로 돌아갑니다");
				return null;
			}

			try {
				int num = Integer.valueOf(strNum);
				for (int i = 0; i < str.length; i++) {
					System.out.printf("%s 점수 입력 : ", str[i]);
					int score = scan.nextInt();
					if (score >= 0 && score <= 100) {
						sub[i] = score;

						vo = new ScoreVO();
						vo.setNum(num);
						vo.setKor(sub[0]);
						vo.setEng(sub[1]);
						vo.setMath(sub[2]);
						vo.setMusic(sub[3]);
						scoreList.add(vo);
					} else {
						System.out.println("점수는 0 ~ 100에서만 입력하세요");
						break;
					}
				}

			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
			}
		}
		
	}

	public void saveScore() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nSize = scoreList.size();
			for (int i = 0; i < nSize; i++) {
				printer.printf("%d\t%d\t%d\t%d\t%d\n",
						scoreList.get(i).getNum(),
						scoreList.get(i).getKor(),
						scoreList.get(i).getEng(),
						scoreList.get(i).getMath(),
						scoreList.get(i).getMusic());
			}
			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일 저장 완료!!");
		this.scoreSum();
		this.scoreAvg();
	}

	@Override
	public void scoreSum() {
		// TODO Auto-generated method stub
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			vo.setSum(sum);
		}

	}

	@Override
	public void scoreAvg() {
		// TODO Auto-generated method stub
		for (ScoreVO vo : scoreList) {
			float avg = vo.getSum() / 4f;
			vo.setAvg(avg);
		}

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub
		System.out.println(ValLine.dLine(50));
		System.out.println("성적일람표");
		System.out.println(ValLine.dLine(50));
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println(ValLine.sLine(50));
		int nSize = scoreList.size();
		int sum = 0;
		int count = 0;
		float avg = 0;
		for (int i = 0; i < nSize; i++) {
			++count;
			System.out.printf("%05d\t%d\t%d\t%d\t%d\t%d\t%3.2f\n",
					scoreList.get(i).getNum(),
					scoreList.get(i).getKor(),
					scoreList.get(i).getEng(),
					scoreList.get(i).getMath(),
					scoreList.get(i).getMusic(),
					scoreList.get(i).getSum(),
					scoreList.get(i).getAvg());

			sum += scoreList.get(i).getSum();
			avg = (float) sum / count;
		}
		System.out.println(ValLine.sLine(50));
		System.out.println("총점\t\t\t\t\t" + sum);
		System.out.println("평균\t\t\t\t\t\t" + avg);
	}

}
