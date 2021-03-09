package com.callor.student.impl;

import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.values.Values;

public class StudentServiceImplV3 extends StudentServiceImplV1{

	@Override
	public void searchStudent() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(Values.dLine(50));
			System.out.println("이름을 입력");
			System.out.println(Values.sLine(50));
			System.out.print("입력 >> ");
			String stName = scan.nextLine();
			
			// vo를 선언하고 null로 clear 해라
			StudentVO sVO = null;
			for(StudentVO vo : stdList) {
				
				if(stName.equals(vo.getStName())) {
					// for()이전에 선언된 sVO에 찾은 vo를 복사
					sVO = vo;
				}
			}
			if(sVO == null) {
				System.out.println("못찾겠다");
			} else {
				this.printStVO(sVO);
			}
			
		}
		
	}
	
	

}
