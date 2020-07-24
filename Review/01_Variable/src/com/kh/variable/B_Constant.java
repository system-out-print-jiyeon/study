package com.kh.variable;

public class B_Constant {

		// 상수
	public void finalConstant() {
		
		// 자료형 변수명 = 값;		=> 변수 (변하는 수)
		int age = 20;
		
		System.out.println("age : " + age);
		
		age = 21;
		System.out.println("변경 후 age : " + age);
		
		// final 자료형 변수명 = 값;	=> 상수(항상 같은 수)
		//		상수의 이름은 다 대문자로 해주는게 권장사항!
		final int AGE = 20;
		
		System.out.println("AGE : " + AGE);
		
		// AGE = 21; // 한 번 지정된 값 변경 불가!!
		System.out.println("상수 값은 한 번 지정된 값 변경 불가하다.");
		
		
	}
	
	
}
