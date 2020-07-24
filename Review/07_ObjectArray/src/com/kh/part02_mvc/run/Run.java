package com.kh.part02_mvc.run;

import com.kh.part02_mvc.model.vo.Person;
import com.kh.part02_mvc.view.PersonView;

public class Run {

	public static void main(String[] args) {
		/*
		 * * MVC패턴 익히기
		 * 
		 * Model : 데이터 관련한 역할을 담당
		 * View : 사용자가 보게 될 시각적인 요소 담당(화면같은 존재)
		 * 		     출력 및 입력					 (입력 및 출력은 뷰단에서)
		 * Controller : 사용자가 요청한 기능 처리를 담당 (입력 및 출력 절대 X)
		 *
		 */
		
		
		// Run : 프로그램 실행만 시켜주는 스위치같은 역할
		//	     == 사용자가 보게될 첫 메인화면을 띄워만 줌
		
		PersonView pv = new PersonView();
		pv.mainMenu();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
