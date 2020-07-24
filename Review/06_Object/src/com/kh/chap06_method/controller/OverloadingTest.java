package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	// 오버로딩  : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 방법
	
	public void test() {		// x.test();
		
	}
	
	
	public void test(int a) {		// x.test(10);
		
	}
	
	
	public void test(int a, String s) {		// x.test(10 , "");
		
	}
	
	public void test(int a , int b) {		// x.test(10, 20);
		
	}
	
	/*
	public void test(int c, int d) {		
		
	}
	*/
	// 에러발생 --> 매개변수명이랑은 상관없이 자료형의 갯수와 순서가 다르게 작성되어야 함!!
	
	
	/*
	public void test(int a , int b, String str) {		// x.test(10, 20, "");
		
	}
	
	public int test(int a , int b, String str) {
		return 0;
	}
	*/
	// 에러발생 --> "반환형"이 다르다고 오버로딩 적용되지 않음!! (★매개변수가 무조건 달라야만함!!)
	
	/*
	private void test(int a , int b, String str) {
		
	}
	*/ // 에러발생 --> "접근제한자" 다르다고 오버로딩 적용되지 않음!!
	
	/*
	 * * 결론 
	 * 오버로딩 : 동일한 메소드명을 작성하는 것
	 * 			단, 접근제한자든 반환형이든 다 떠나서 (뭐가 됐든간에)
	 * 			"매개변수의 자료형과 갯수, 순서가 다르게 작성되어야 함!!"
	 * 
	 */
	
	
	
	
	

}
