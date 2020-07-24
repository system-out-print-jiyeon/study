package com.kh.operator;

public class D_Comparison {
	/*
	 *  * 비교연산자 (관계연산자) (이항연산자)
	 *  
	 *  - 두 값을 비교하는 연산자
	 *  - 비교한 값이 참이면 true, 거짓이면 false
	 *  즉, 비교연산을 수행한 결과값은 논리값
	 *  
	 *  a < b : a가 b보다 작냐?
	 *  a > b : a가 b보다 크냐?
	 *  a <= b : a가 b보다 작거나 크냐?
	 *  a >= b : a가 b보다 크거나 작냐?
	 *  
	 *  a == b : a랑 b랑 같냐?
	 *  a != b : a랑 b랑 같지않냐? => !(a == b)
	 * 
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		//int a =10, b = 25; // 한 줄에 같이쳐도 구동은 되나, 권장사항 X
		
		System.out.println("a == b : " + ( a == b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a > b : " + (a > b));
		
		System.out.println("a != b : " + (a != b));
		
		boolean result = (a >= b);
		System.out.println("result : " + result);
		
		// 산술연산  + 비교연산
		
		// a가 짝수입니까?
		System.out.println("a는 짝수인가 : " + (a % 2 == 0));
		System.out.println("b는 짝수인가 : " + (b % 2 == 0));
		
		System.out.println("a는 홀수인가 : " + (a % 2 == 1));
		System.out.println("b는 홀수인가 : " + (b % 2 == 1));
		
		System.out.println(a + b > 30);
		
		// 값  % 2 == 0 == 짝수
		// 값  % 2 == 1 == 홀수

	}
	
	
	
	
	
}
