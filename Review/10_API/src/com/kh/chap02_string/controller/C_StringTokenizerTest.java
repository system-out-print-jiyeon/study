package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 이용하여 해당 문자열 분리시키는 방법
		
		// 방법 1. 분리된 문자열들을 배열로 차곡차곡 담아서 처리하고 싶을 때 
		//		  String 클래스에서 제공하는 split 메소드 이용
		//		   문자열.split(String 구분자) : String[]
		
		String[] arr = str.split(",");
		System.out.println("분리 후 문자열의 갯수 : " + arr.length);
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		*/
		
		// 향상된 for문
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		
		
		// 방법 2. 분리된 각각의 문자열들을 객체로 취급하고 싶을 때
		//		  java.util.StringTokenizer 에 속해있음
		//				StringTokenizer 클래스를 이용하는 방법
		//		  StringTokenizer stn = new StringTokenizer(분리시키고자하는 문자열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리 후 문자열의 갯수 : " + stn.countTokens()); // 6개
		
		/*
		System.out.println(stn.nextToken());	// Java
		System.out.println(stn.nextToken());	// Oracle
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		//										 토큰 다 뽑아왔음
		System.out.println("문자열의 갯수 : " + stn.countTokens());	// 그래서 지금은 0개
		*/
		
		
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// i=0  i<6  true	System.out.println("Java");  i++
		// i=1  i<5  true	System.out.println("Oracle"); i++
		// i=2  i<4  true	System.out.println("JDBC"); i++
		// i=3  i<3  false  --> 반복문 빠져나옴
		
		/*
		 해결방법 1.
		int count = stn.countTokens(); // 6 // 고정값 변수에 한번 받아두기
		
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법 2.
		while(stn.hasMoreTokens()) { // 해당 토큰이 남아있습니까? -> 남아있을경우 true
			System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	public void method2() {
		String colors = "red/yellow#green blue,orange";
		
		// split 방법
		String[] arr = colors.split("[/#, ]");	// 대괄호로 묶으면 구분자 여러개 가능 
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// StringTokenizer 방법
		StringTokenizer stn = new StringTokenizer(colors, "/# ,");
		
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
