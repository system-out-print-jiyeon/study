package com.kh.chap04_assit.part01_buffered.run;

import com.kh.chap04_assit.part01_buffered.model.dao.BufferedTest;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * * 보조스트림  : 보조역할만을 수행함 (즉, 기반스트림만으로 부족한 기능들을 제공함)
		 * 				속도를 향상시킨다거나, 객체단위로 입출력이 가능하게끔 해준다거나, 추가적인 유용한 메소드 제공
		 * 
		 * 		> 보조스트림은 단독으로 사용 불가!! (반드시 기반스트림 객체가 필요!!)
		 * 기반스트림이 객체와의 통로임
		 *
		 */
		
		
		BufferedTest bt = new BufferedTest();
		//bt.fileSave();
		bt.fileRead();
		
		
		

	}

}
