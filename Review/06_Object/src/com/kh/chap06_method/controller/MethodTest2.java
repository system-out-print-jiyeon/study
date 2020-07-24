package com.kh.chap06_method.controller;

import com.kh.chap05_constructor.model.vo.User;

public class MethodTest2 {
	
	public static int num1 = 10;
	public static int num2 = 20;
	
	// static이 붙은 메소드
	// 1. 매개변수 x, 반환값 x
	public static void method1() {
		System.out.println(num1 - num2);
		num2++;
	}
	
	// 2. 매개변수 x, 반환값 o
	public static int method2() {
		return num1 -num2 ;
	}
	
	// 3. 매개변수 o, 반환값 x 
	public static void method3(String name) {
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	// 4. 매개변수 o, 반환값 o
	public static String method4(String name) {
		return name + "님의 방문을 환영합니다.";
	}


	// * 반환형 특이케이스
	public static int[] test1() {
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[2] = 5;
		
		return arr;
		
	}
	

	public static User test2(String userId, String userPwd, String userName) {
		User u = new User(userId, userPwd, userName);
		
		return u;
	}
	
	public static void test3(int[] a) {
		
	}
	
	
	

}
