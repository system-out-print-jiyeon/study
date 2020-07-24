package com.kh.first;

public class B_ValuePrinter { // com.kh.first.B_ValurPrinter
	/*
	 *  **원칙**
	 *  1. 클래스명 --> 대문자로 시작
	 *  2. 패키지명 --> 소문자로 시작
	 *  3. 메소드명 --> 소문자로 시작
	 *  4. 변수명    --> 소문자로 시작
	 *  
	 *  단, 여러개의 단어가 있을 때는 단어 앞자리마다 대문자로!! == 낙타표기법 CamelCase (개발자간의 예의)
	 *  가독성때문
	 *  
	 *  ex) 클래스명 Methodprinter	=> MethodPrinter
	 *  	메소드명 printvalue		=> printValue
	 *  
	 *  그리고 항상 의미있게 이름짓자!
	 */

	
	// 다양한 종류의 값들을 출력하는 기능의 메소드
	public void printValue() {
		
		// 1. 숫자출력 --> 따옴표 없이
		System.out.println(7591); // 정수값 출력
		System.out.println(7.591); // 실수값 출력
		
		// 2. 문자(한글자) --> 홑따옴표 이용
		System.out.println('a');
		System.out.println('b');
		
		// 3. 문자열(여러글자) --> 쌍따옴표 이용
		System.out.println("안녕\n하세요");	// 줄바꾸기 개행문자 \n 
		System.out.println("반갑습니다");
		
		// 4. 연산한 결과값도 출력가능
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // 컴퓨터에서의 실수값연산은 불완전해서 오차가 생길 수 있다.
		
		// 5. 문자와 숫자는 연산 가능 (특이케이스)
		System.out.println('a' + 1); // 각 문자마다 컴퓨터가 인식하는 고유한 숫자값을 가지고 있음 ( a == 97, b == 98)

		// 6. 문자열("")
		System.out.println("하이" + 'a');
		System.out.println('a' + "하이");
		System.out.println("안녕하세요" + 123);
		System.out.println("반가워" + "ㅎㅎㅎ");
	}
	
	// 문자열과 숫자가의 덧셈 연산 기능용 메소드
	public void sumStringNumber() {
		
		System.out.println(9 + 9);		// 18
		System.out.println(9 + "9");	// "99"
		System.out.println("9" + 9);	// "99"
		
		
		System.out.println(9 + 9 + "9");	// 18 + "9" = "189"
		System.out.println(9 + "9" + 9);	// "99" + 9 = "999"
		System.out.println("9" + 9 + 9);	// "99" + 9 = "999"
		System.out.println("9" + (9 + 9));	// "9" + 18 = "918"
		
		// 연산에도 순서가 있다!	=>	연산이 먼저 되는 순서대로 생각하면 쉽다.
		
	}
	
	
}
