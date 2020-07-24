package com.kh.first;

//주석 : 소스코드와 무관한 즉, 코드로 인식 안됨!! => 주로 코드에 대한 설명을 작성할 때 사용

/*
 * 이건 
 * 여러줄 
 * 주석
 */

public class HelloWorld {

	// 기능 == 메소드
	// 한 클래스 안에 여러개의 메소드 만들 수 있음!
	// 프로그램 실행 시 제일 먼저 실행되는 메소드 == main메소드 (실행메소드)
	
	public static void main(String[] args) {
	
		// 화면에 출력하고 싶을 때 출력문을 통해 작업 (print, println, printf)
		
		// System.out.println(출력하고자 하는 값); --> 해당 문구 출력 후 "한 줄 띄어주는(개행)" 역할
			System.out.println("Hi EveryOne!!");
			
		// System.out.print(출력하고자 하는 값); --> 해당 문구 출력만 하고 끝 --> 한 줄 띄어쓰기 X
		System.out.print("안녕하세요");
		
		System.out.println("안녕못해");
		
		//각 클래스마다 역할별로 나눠서 관리
		// 각 클래스안에서도 해당 코드들도 각 기능별로 메소드로 따로 작성함!!
	}
		
}
