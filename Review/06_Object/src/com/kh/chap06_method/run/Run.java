package com.kh.chap06_method.run;

import java.util.Arrays;

import com.kh.chap05_constructor.model.vo.User;
import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class Run {

	public static void main(String[] args) {
		
		
		/*
		 
		 // -------------- 1. MethodTest1 --------------
	
		MethodTest1 m1 = new MethodTest1();
		
		m1.method1();
		
		
		double random = m1.method2();
		System.out.println(random);
		
		
		System.out.println(m1.method2());
		
		m1.method3(10, 30);
		
		int minus = m1.method4(50, 10);
		System.out.println("�E����� : " + minus);
	
	*/
		// static�̱⶧���� ��ü������ �ʿ� X
		MethodTest2.method1();
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("������");
		
		String str = MethodTest2.method4("������");
		System.out.println(str);

		
		int[] arr = MethodTest2.test1();
		System.out.println(Arrays.toString(arr));
		
		User u =MethodTest2.test2("user11", "pass11", "������");
		System.out.println(u.information());
		
		
		// MethodTest2.test3(a);
		
	}



}
