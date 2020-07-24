package com.kh.run;

import com.kh.first.B_ValuePrinter;

public class RunB {
	
	//실행(main) 메소드
	public static void main(String[] args) {
	
		// 다른 클래스에 있는 메소드 호출
		// 1) 클래스 생성(new) 먼저 하기
		//	클래스명 사용할이름 = new 클래스명();
	B_ValuePrinter b = new B_ValuePrinter();
	
	// 2) 메소드 호출(실행)
	//	사용할이름.실행할메소드명();
	//b.printValue();
	
	b.sumStringNumber();
	
	
	}

}
