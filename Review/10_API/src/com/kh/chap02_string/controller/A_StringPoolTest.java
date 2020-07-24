package com.kh.chap02_string.controller;

public class A_StringPoolTest {
public void method1() {
		
		// 기본자료형 : boolean, char, byte, short, int, long, float, double
		// 참조자료형 : String, Person, Student, ....  기본자료형이 아닌 모든 자료형
		// 기본자료형은 메모리박스에 자료값이 담기는데 그 외의 자료형은 주소값이 담긴다.
	
		
		/*
		 *  * String 클래스
		 *  - 불변 클래스 (변하지 않는 클래스)
		 *  --> 수정하는 순간 그자리에서 변경이 되지 않음
		 * 
		 */
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		
		System.out.println(str1 == str2);  	// false (주소값다름)
		
		System.out.println(str1);
		System.out.println(str2);
		// toString() --> String 클래스에 이미 오버라이딩 되어있음  실제 담긴 문자열 반환
		
		System.out.println(str1.equals(str2));  // true (실제 담긴 문자열간 비교)
		// equals() --> String 클래스에 이미 오버라이딩 되어있음 (실제 담긴 문자열간 비교)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() --> String클래스에 이미 오버라이딩 되어있음 (실제 담긴 문자열가지고 만듬! 주소값이 아니라)
		
		
		// 만약에 정말정말 주소값에 대해서 알고싶다면 System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}

	public void method2() {
		
		// 2. 문자열을 "리터럴"로 생성
		String str1 = "hello";		
		String str2 = "hello";
		// 리터럴 제시시 상수풀 (String Pool)영역에 올라감
		// String Pool 특징 : 동일한 문자열 존재 불가 !!
		// 기존에 있던 String있으면 동일한 것 들어올 수 없음 (StringPool에서 삭제되고 그 전에 있던 동일한 값의 주소값 할당)
		
		
		String str3 = new String("hello");	// new만나면  Heap영역에 공간할당됨
		
		System.out.println(str1 == str2);   // true (주소값 일치함)
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		
		
		// 불변클래스 (변하지 않는 클래스 == 그 자리에서 수정되는 개념이 아니라는 뜻)
		
		str2 = "bcd";		// 기존의 hello가 바뀌는게 아니라 새로 bcd로 할당됨
		System.out.println(System.identityHashCode(str2));	// 새로운 주소값
		// 문자열 변경하는 순간 기존의 문자열자리에서 변경되는게 아닌
		// 새로운 곳에 할당 (새로운 주소값 부여받음 == 주소값 변경)
		
		str2 = "abc";
		System.out.println(System.identityHashCode(str2));
		// 기존에 연결되어있던 것 끊어지고 새로 할당됨
		// 그 전에 있던 값은 메모리영역에 두둥실 떠다니다가 일정시간 후에 가비지컬렉터가 정리
		
		
		str2 = "eee";
		System.out.println(System.identityHashCode(str2));
		
		/*
		 * String 클래스 == 불변클래스
		 * --> 계속 값을 변경하는 경우 가비지컬렉터(GC)가 계속 지워줘야만하는 단점이 있음 (비효율적)
		 * --> 변경이 적고 단지 읽기만 하는 경우 String 클래스가 용이
		 */
		
		str2 = "hello";
		System.out.println(System.identityHashCode(str2));  		// 기존에 있던 "hello"랑 다시 연결, 그래서 주소값 동일
		
		
		
		
	}

	
	
}
