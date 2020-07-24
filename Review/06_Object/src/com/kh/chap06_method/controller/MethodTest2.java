package com.kh.chap06_method.controller;

import com.kh.chap05_constructor.model.vo.User;

public class MethodTest2 {
	
	public static int num1 = 10;
	public static int num2 = 20;
	
	// static�� ���� �޼ҵ�
	// 1. �Ű����� x, ��ȯ�� x
	public static void method1() {
		System.out.println(num1 - num2);
		num2++;
	}
	
	// 2. �Ű����� x, ��ȯ�� o
	public static int method2() {
		return num1 -num2 ;
	}
	
	// 3. �Ű����� o, ��ȯ�� x 
	public static void method3(String name) {
		System.out.println(name + "���� �湮�� ȯ���մϴ�.");
	}
	
	// 4. �Ű����� o, ��ȯ�� o
	public static String method4(String name) {
		return name + "���� �湮�� ȯ���մϴ�.";
	}


	// * ��ȯ�� Ư�����̽�
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
