package com.callor.student;

import java.util.Scanner;

import com.callor.student.VO.StudentVO;
import com.callor.student.service.StudentMenu;
import com.callor.student.values.Values;

public class MenuStudent implements StudentMenu {
	StudentVO vo = new StudentVO();

	@Override
	public String studentMenu() {
		// TODO 학생이름 입력할 메뉴
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println(Values.dLine(50));
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
			System.out.println(Values.sLine(50));
			System.out.print("이름 >> ");
			String name = scan.nextLine();
			return name;
		}
	}
}
