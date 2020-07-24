package com.kh.chap03_wrapper.controller;

public class WrapperTest {

	/*
	 * * Wrapper 클래스
	 *   --> 기본자료형을 객체로 포장해주는 클래스가 래퍼클래스(Wrapper클래스)이다.
	 * 
	 * 		기본자료형			Wrapper클래스
	 * 		 boolean  <--> 	Boolean
	 * 		  char    <-->  Character		*
	 * 		  byte    <-->  Byte
	 * 		 short    <-->  Short
	 * 		  int     <-->  Integer		 	*
	 * 		 long     <-->  Long
	 * 	     float    <-->  Float
 	 * 		double    <-->  Double
	 * 
	 * 
	 *  - 기본자료형으로 사용을 해도 되지만 프로그램에 따라 해당 기본자료형을 객체로 취급해야 되는 경우 있음
	 *  ex) 메소드 호출해야될때
	 * 		메소드의 매개변수로 기본자료형이 아닌 객체 타입만이 요구될 때
	 * 		다형성을 적용시키고 싶을 때
	 * 
	 */


	public void method1() {
		
		// Boxing : 기본자료형 --> Wrapper클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		// 1. 객체 생성을 통한 방법
		Integer i1 = new Integer(num1);		// num1 --> i1
		Integer i2 = new Integer(num2);		// num2 --> i2
		
		System.out.println(i1);
		System.out.println(i2);	// (기본자료형아닌 클래스이기때문에)실제로는 주소값 담겨있으나 내부적으로 toString으로 오버라이딩되어있음
		
		System.out.println(i1 == i2); 	// false 
		
		// 객체로 바꾸게 되면 (.equals같은) 메소드를 이용가능
		System.out.println(i1.equals(i2));		// false
		System.out.println(i1.compareTo(i2));	// 두 값을 비교해서 앞쪽이 크면 1반환, 뒤쪽이 크면 -1반환, 같으면 0반환
		
		
		// 2. 객체생성따위 하지 않고 바로 대입하는 방법 (AutoBoxing)		--> 같은 타입으로만 가능, 문자열은 대입 불가
		// 훨씬 간단함
		Integer i3 = num2;	// num2 --> i3
		
		System.out.println(i3);
		
		
		// 근데 언제 객체생성을 통해서 변환하냐?		--> 문자열을 Integer 타입으로 변환하고자 할 때
		// Integer i4 = "123";		--> 안됨, 같은타입일 경우만 가능
		Integer i4 = new Integer("123");	// "123" --> 123
		System.out.println(i4);
		
		
		// UnBoxing : Wrapper 클래스 자료형 --> 기본자료형
		
		// 1. 해당 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해
		
		// i1 --> num3
		int num3 = i1.intValue();		// 10
		int num4 = i2.intValue();		// 15
		
		System.out.println(num3);
		System.out.println(num4);
		
		
		// 2. 메소드따위 사용하지 않고 바로 대입하는 방법 (AutoUnBoxing)
		int num5 = i1;	// 10
		
		
	}
	
	
	
	public void method2() {
		
		// 기본자료형 <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);	// 문자열로 작업됨!!
		
		// 1. String   -->  기본자료형 		: 문자열을 기본자료화 시키는 것 "파싱한다" 라고 함
		//		"10"   -->  10
		//		"15.3" -->  15.3
		
		// 해당 Wrapper클래스.parseXXX()사용  
		// 갖고자하는 클래스.parse클래스기본자료형(변환하고자하는 문자열);		


		int i = Integer.parseInt(str1);			//10
		double d = Double.parseDouble(str2);	//15.3
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(i+d); 		// 25.3
		
		
	
		// 2. 기본자료형   -->   String
		//		10 	   -->    "10"
		//		15.3   -->    "15.3"
		
		// 기본자료형 --> Wrapper 객체  --> String
		//String strI = Integer.valueOf(i).toString();		// "10"
		//String strD = Double.valueOf(d).toString();		// "15.3"
		
		
		// 위에보다 더 간단한 방법
		String strI = String.valueOf(i);		// "10"
		String strD = String.valueOf(d);		// "15.3"
		
	
		
		
	}
	
	
	
	
}

