package com.kh.operator;

// 논리 부정 연산자 (단항연산자 == 한개의 값을 가지고 연산)
//	! : 논리를 부정하는 연산자 (즉, 논리값을 반대로 만드는 연산자)
public class A_LogicalNegation {

	public void method() {
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정  : " + !false);
		
		boolean b1 = true;
		boolean b2 = !b1;	// b2 = false
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		
	}
	
}
