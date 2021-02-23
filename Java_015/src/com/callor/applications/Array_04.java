package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		int[] intNums = new int[100];
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("숫자입력 : ");
		int num = scan.nextInt();

		// intNums[i] 배열은 intNums[0 ~ 99]의 범위의 배열에서만 저장되기 때문에
		// int i = intNums.length를 하면 아래의 if문 intNums[i]에 첫번째에
		// intNums[100]이 된다.
		// intNums[100]은 앞에 선언한 범위를 초과해서 오류가 나오기 때문에
		// -1을 해주어 범위를 맞춰준다.
		for (int i = (intNums.length - 1); i > 0; i--) {

			if (intNums[i] == num) {

				System.out.println(i + "번째에서 마지막으로 나타난다.");
				break;
			}
		}
		/*
		 * 변수는 앞에서 어떤 값을 저장했던 상관없이 가장 마지막에 저장한 값만 가지고 있다.
		 */
		int last = 0;
		for (int i = 0; i < intNums.length; i++) {

			if (intNums[i] == num) {
				// intNums[i] 값과 입력된 값 num 값이 같을 때
				// i(여기서는 순서) 값을 last에 저장하는데 반복이 되면 계속 새로운 값으로 갱신된다.
				// 그리고 마지막 intNums[i]와 num 가 같게된 순서 i(여기서는 순서) 값이 저장되고 반복이 끝나면
				// 마지막으로 저장된 값(마지막으로 나타나는)을 출력한다.
				
				// 키보드로 입력한 값이 일치할때마다
				// 그 위치를 last에 저장한다.
				last = i;
			}
		}
		// 여기 오면 last에 저장된 값은 가장 마지막으로 last = i; 가 실행된 결과만 담고있다.
		System.out.println(last + "번째에서 마지막으로 나타난다.");
	}

}
