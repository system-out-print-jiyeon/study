package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharTest;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * "문자 기반 스트림" : 외부매체 선정 후 해당 외부매체와 직접적으로 연결된 통로에 2byte단위로 데이터 전송가능
		 * 
		 * "문자 스트림" : 2byte 단위로 데이터 전송 가능한 스트림
		 * "기반 스트림" : 외부매체와 직접적으로 연결하는 통로
		 * 
		 * XXXReader : XXX매체로부터 데이터를 입력받는 통로
		 * XXXWriter : XXX매체로 데이터를 출력하는 통로
		 * 
		 */
		
		FileCharTest fc = new FileCharTest();
		//fc.fileSave();
		fc.fileRead();
		
		
		

	}

}
