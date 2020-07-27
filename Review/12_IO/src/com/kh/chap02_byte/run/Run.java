package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;

public class Run {

	public static void main(String[] args) {

		// "바이트 기반 스트림" 가지고 데이터 입출력 할 것!!
		
		// "바이트 스트림" : 데이터를 1바이트 단위로 밖에 전송이 불가한 통로 (좁은 통로.. 1바이트는 한글 깨짐)
		// "기반 스트림" : 외부매체랑 직접적으로 연결되는 통로다!!
		
		// "바이트 기반 스트림" --> 외부매체를 지정하고 그 외부매체와 직접적으로 연결된 통로에 데이터를 1바이트단위로 전송하겠다!
		
		// XXXInpuStream	: XXX매체로부터 데이터를 입력받는 통로 (외부매체로부터 데이터 읽어오겠다.)
		// XXXOutputStream  : XXX매체에 데이터를 출력하는 통로 (외부매체로 데이터를 내보내겠다. 기록하겠다)
		
		// File InputStream / OutputStream		--> 외부매체로 파일!!
		// Audio InputStream / OutputStream		--> 외부매체로 오디오장치!!
		// Piped InputStream / OutputStream		--> 외부매체로 또 다른 프로그램!!
		
		
		FileByteTest f = new FileByteTest();
		//f.fileSave();
		//f.fileread();
		
		// System.out.println((int)'이');  한글크기 엄청 크다!
		
	
	}

}
