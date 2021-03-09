package com.callor.ioList.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.ioList.service.IoService;
import com.callor.ioList.values.Values;
import com.callor.ioList.vo.IoListVO;

public class ServiceImplV1 implements IoService {

	private List<IoListVO> ioList;
	private String fileName;

	public ServiceImplV1() {
		fileName = "src/com/callor/ioList/매입매출데이터.txt";
		ioList = new ArrayList<IoListVO>();
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
				String[] list = reader.split(",");
				IoListVO iVO = new IoListVO();
				iVO.setDate(list[0]); // 거래일자
				iVO.setProductName(list[4]); // 상품명
				iVO.setDepartName(list[5]); // 거래처명
				iVO.setChefName(list[6]); // 대표자명
				iVO.setDivision(Integer.valueOf(list[7])); // 구분
				iVO.setBuyPrice(Integer.valueOf(list[8])); // 매입단가
				iVO.setSellPrice(Integer.valueOf(list[9])); // 판매단가
				iVO.setQty(Integer.valueOf(list[10])); // 수량
				ioList.add(iVO);

			}

			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일 불러오기 완료");
		// System.out.println(ioList.toString() + "\n");

	} // end loadFile();

	public void division() {
		
		for(IoListVO vo : ioList) {
			
			if (vo.getDivision() == 1) {
				vo.setBuyTotal(vo.getBuyPrice() * vo.getQty());
				vo.setSellPrice(0);
			} else if (vo.getDivision() == 2) {
				vo.setSellTotal(vo.getSellPrice() * vo.getQty());
				vo.setBuyPrice(0);
			}
		}
	} // end division
	
	public void print() {
		
		System.out.println(Values.dLine);
		System.out.println("거래일자\t거래처\t\t\t\t\t상품이름\t\t\t매입금액\t판매금액");
		System.out.println(Values.sLine);
		for(IoListVO vo : ioList) {
		System.out.printf("%s\t%s\t\t\t\t%s\t\t\t%d\t\t%d\n",
				vo.getDate(),
				vo.getDepartName(),
				vo.getProductName(),
				vo.getBuyTotal(),
				vo.getSellTotal()
				);
		}
	}

}
