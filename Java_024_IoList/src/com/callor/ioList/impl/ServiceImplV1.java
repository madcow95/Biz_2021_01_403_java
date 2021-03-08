package com.callor.ioList.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.callor.ioList.service.ioService;

public class ServiceImplV1 implements ioService {

	private String fileName;

	public ServiceImplV1() {
		fileName = "src/com/callor/ioList/매입매출데이터.txt";
	}
	
	@Override
	public void loadFile() {
		// TODO txt파일 불러오기
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
				System.out.println(reader.toString());
				buffer.close();
				fileReader.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
