package com.kh.chap01_condition.run;

import com.kh.chap01_condition.condition.A_If;
import com.kh.chap01_condition.condition.B_Else;
import com.kh.chap01_condition.condition.C_Switch;

public class Run {

	public static void main (String[] args) {
		
		/*
		 * 프로그램 기본적으로 위에서부터 아래로 순차적으로 진행(실행)
		 * 단, 순차적인 흐름을 바꿀 때 제어문이라는걸 통해서 직접 제어할 수 있음!!
		 * 
		 * 선택적으로 실행하는 선택문		--> 조건문
		 * 반복적으로 실행하는 실행문 	--> 반복문
		 * 그 외의 흐름을 제어			--> 분기문
		 * 
		 * * 조건문
		 * - 조건식을 통해 참이냐 거짓이냐를 판단해서 해당 조건이 참일경우 그에 해당하는 실행문 실행
		 * - 삼항 연산자 또한 조건문
		 * 
		 * 조건문은 크게 if문과 switch문으로 나뉨
		 *
		 * 그 중에서  if문에서는 크게 3가지로 나뉨
		 * 1. 단독 if문
		 * 2. if-else문
		 * 3. if-else if문
		 * 
		 */
		
		A_If a = new A_If();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		
		B_Else b = new B_Else();
		//b.method5();
		//b.method6();
		//b.method7();
		
		C_Switch c = new C_Switch();
		//c.method1();
		//c.method2();
		//c.method3();
		c.method4();
		
		
		
		
		
		
		
		
		
	}
	
	
}
