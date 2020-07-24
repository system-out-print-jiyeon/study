package com.kh.chap04_field.model.vo;

// 전역변수 중 클래스변수(static변수)
public class FieldTest3 {

	// static : 공유의 개념 (메모리영역에 단 한 번 올려놓고 공유해서 갖다쓰자!)
	// 생성 시점 : 프로그램 실행하자마자 Static 메모리 영역에 할당 (굳이 해당 이클래스가지고 생성안해도!!)
	
	public static String sta = "static";

	
	// final : 상수 (한 번 지정한 값은 변경불가!!)
	// 상수 필드 (public static final)
	public static final int NUM =1;
	
	
}
