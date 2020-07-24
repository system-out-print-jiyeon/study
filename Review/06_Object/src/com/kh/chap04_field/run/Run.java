package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		// ------------- 1. FieldTest1 ----------------
		/*
		FieldTest1 f1 = new FieldTest1();	// 객체생성
		f1.test(5); 	// 메소드 실행
		*/
		
		
		
		
		// ------------- 2. FieldTest2 ----------------
		
		FieldTest2 f2 = new FieldTest2();
		
		// 각 필드에 직접 접근 해볼거임
		
		// public --> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected --> 같은 패키지 내 + 다른 패키지일 경우 상속구조
		// System.out.println(f2.pro);
		
		// default --> 같은 패키지 내
		// System.out.println(f2.def);
		
		// private --> only 그 클래스에서만
		// System.out.println(f2.pri);
		
		
		
		
		// ------------- 3. FieldTest3 ----------------
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);

		
		System.out.println(Math.random());
		System.out.println(FieldTest3.NUM);
		System.out.println(Math.PI);
		

	}

}
