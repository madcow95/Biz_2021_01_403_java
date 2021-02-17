package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			// prompt
			// scanner의 nextInt()를 사용하여 키보드 입력을 받는 코드가 실행되면
			// 화면에 아무것도 없이 멈춘것처럼 보이는 현상이 있는데 미리 어떤 일을 할 것인지 알려주는 메세지
			System.out.print("국어점수 >> ");
			// scan.nextInt() 메서드를 호출하면 코드 동작이 멈추고 사용자에게 키보드로 무엇인가
			// 입력한 후 Enter를 누를때까지 이후 코드가 실행되지 않음 ==> Code Blocking 되었다 라고 표현
			int kor = scan.nextInt();
			if (kor > 100 || kor < 0) {
				System.out.println("0 ~ 100 까지만 입력하세요");
				break;
			}

			System.out.print("영어점수 >> ");
			int eng = scan.nextInt();
			if (eng > 100 || eng < 0) {
				System.out.println("0 ~ 100 까지만 입력하세요");
				break;
			}

			System.out.print("수학점수 >> ");
			int math = scan.nextInt();
			if (math > 100 || math < 0) {
				System.out.println("0 ~ 100 까지만 입력하세요");
				break;
			}
			
			int sum = (kor + eng + math);
			// int sum = kor;
			// sum += eng;
			// sum += math; sum을 이렇게 표현해도 됨
			
			double dAvg = sum / 3d;
			// float(or double) 변수는 실수형이지만 sum은 정수형, 3도 정수형이기 때문에
			// float(or double) 변수에 저장되는 값은 소수점 이하가 무조건 0으로 세팅된다.
			// 결과값을 실수형(float or double)으로 하고자 할때는 sum 변수 값이나 숫자3을 실수형으로 만들어줘야 한다.
			
			// 1. sum을 실수형으로 변경하고 계산하기
			// 정수형 sum에 담긴 값을 double형 값으로 강제 형변환하여 나눗셈 준비
			// dAvg = (double)sum / 3;
			
			// 2. 숫자 3을 실수형으로 만들어서 나눗셈
			// sum을 실수 3.0d로 나눗셈을 지시하면 sum변수에 담긴 값은 자동으로 실수형으로 변환 ==> 자동형변환이라한다.
			// dAvg = sum / 3.0d || double 자리에 float를 써도 ㄱㅊ double가 더 많은 수를 표현한다.
			// dAvg = sum / (double)3;으로 해도 되긴하는데 이렇게 쓰진 않는다.
			
			System.out.println("========================================");
			System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균");
			System.out.println("----------------------------------------");
			System.out.println(kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + dAvg);
			System.out.println("========================================");
			break;
		}
	}

}
