package com.callor.student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.student.VO.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.Values;

public class ServiceStudent implements StudentService {

	private List<StudentVO> studentVO;

	public ServiceStudent() {
		studentVO = new ArrayList<StudentVO>();
	}

	@Override
	public void loadFile() {
		// TODO 파일 불러오기
		String fileName = "src/com/callor/student/학생정보리스트.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String[] studentList = reader.split(":");

				StudentVO sVO = new StudentVO();
				sVO.setStuNum(Integer.valueOf(studentList[0])); // 학번
				sVO.setStuName(studentList[1]); // 이름
				sVO.setMajor(studentList[2]); // 학과
				sVO.setGrade(Integer.valueOf(studentList[3])); // 학년
				sVO.setBan(Integer.valueOf(studentList[4])); // 반
				sVO.setAddr(studentList[5]); // 주소
				sVO.setPhone(studentList[6]); // 전화번호
				studentVO.add(sVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("파일을 불러오던 중 오류 발생");
		}
		System.out.println("파일불러오기 완료");

	}

	@Override
	public void printFile() {
		// TODO 입력된 정보 출력
		MenuStudent ms = new MenuStudent();

		while (true) {
			String stuName = ms.studentMenu();
			if (stuName.equalsIgnoreCase("quit")) {
				break;
			}
			int nSize = studentVO.size();
			for (int i = 0; i < nSize; i++) {
				if (stuName.equals(studentVO.get(i).getStuName())) {
					System.out.println(Values.dLine(50));
					System.out.printf("이름 : %s\n", studentVO.get(i).getStuName());
					System.out.printf("학과 : %s\n", studentVO.get(i).getMajor());
					System.out.printf("학년 : %d학년\n", studentVO.get(i).getGrade());
					System.out.printf("반 : %d반\n", studentVO.get(i).getBan());
					System.out.printf("주소 : %s\n", studentVO.get(i).getAddr());
					System.out.printf("전화번호 : %s\n", studentVO.get(i).getPhone());
					System.out.println(Values.dLine(50));
				}
				
			}
			System.out.println("프로그램 종료");
		}

	}
}