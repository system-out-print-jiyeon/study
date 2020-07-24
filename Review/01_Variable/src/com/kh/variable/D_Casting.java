package com.kh.variable;

public class D_Casting {
	
	// 형변환 : 값의 자료형을 바꾸는 것!
	/*
	 *  * 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황!)
	 *  1. 같은 자료형의 값만이 대입됨!
	 *  	--> 즉, 다른 자료형의 값을 대입하고자 한다면 형변환이 필수!
	 *  		자료형 변수명 = (바꿀자료형)값;
	 *  
	 *  2. 같은 자료형끼리만 계산됨 (뿐만 아니라 그 결과도 같은 자료형으로!)
	 *  	값+값
	 *  
	 *  * 형변환 종류
	 *  1. 자동 형변환 : 자동으로 형변환이 되기 때문에 명시적으로 형변환 시켜줄 필요없음!!
	 *  2. 강제 형변환 : 직접 형변환해야됨! (명시적 형변환)
	 *  	[표현법]	(바꿀자료형)값;
	 *  
	 *  *주의사항
	 *  boolean은 형변환이 불가!! 오로지 true / false의 값만을 가질 수 있음
	 *  
	 */
	
	// 1. 자동형변환 (작은 자료형을 큰 자료형으로 자동 형변환 됨)

	public void casting1() {
		
		// 작은 자료형 --> 큰 자료형
		
		// 1. int(4byte) --> double(8byte)
		int i1 = 12;
		
		// > 대입연산
		double d1 = /*(double)*/ i1;	// 12 --> 12.0
		System.out.println("d1 : " + d1);
		
		// > 계산 (산술연산)
		int i2 = 12;
		double d2 = 3.3;
		
		double result2 = /*(double)*/i2 + d2 ;	// 12 + 3.3 => 12.0 + 3.3 => 15.3
		System.out.println("result2 : " + result2);
		
		
		System.out.println("=====================");
		
		// 2. float(4byte) --> double(8byte)
		float f3 = 1.0f;
		double d3 = /*(double)*/ f3;
		
		System.out.println("f3 : " + f3);
		System.out.println("d3 : " + d3);
		
		// 3. int(4byte) --> long(8byte)
		int i4 = 3333;
		long l4 = /*(long)*/i4;
				
		System.out.println(/*(long)*/i4 + l4);
		
		
		// 4. long(8byte) --> float(4byte) 			*특이케이스*
		//		정수형			실수형
		// **실수형은 어떠한 정수보다도 훨씬 더 큰 범위의 값을 저장할 수 있음!!
		long l5 = 1000000000L; // 값을 int(4byte)로 인식하기 때문에 L생략가능 	작-->큰 (자동형변환)
		float f5 = /*(float)*/l5;
		
		System.out.println("f5 : " + f5);
		
		// byte(1) --> short(2) --> int(4) --> long(8) --> float(4) --> double(8)
		
		
		
		
		
		// *특이케이스*
	
		// 1. char(2byte) <--> int(4byte)  쌍방
		//	문자				숫자
		
		// 'a' '!' '이' 'A' '~' => 모든 문자마다 고유한 숫자값이 있다!!
		char ch = /*(char)*/65;	// 65 == 'A'	66 =='B'	67=='C'
		System.out.println("ch : " + ch);
		
		int num = /*(int)*/'A';
		System.out.println("num : " + num);
				
		
		// 2. byte, short간 연산 		==> 둘이서 연산하면 int로 취급됨
		byte b1 = 1;
		byte b2 = 10;
		
		byte result = (byte)(b1 + b2);	// 에러발생
		System.out.println("result : " + result);
				
	}

	public void casting2() {
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		
		//double(8byte) --> float(4byte)
		double d = 4.0;
		float f = (float)d;
		
		// double(8byte)  --> int(4byte)
		double d2 = 162.3;
		int i2 = (int)d2;	// 데이터 손실 발생!
				
		System.out.println("i2 : " + i2);
		
		int iNum = 10;
		double dNum = 5.89;
		
		
		//int iSum = iNum + dNum;	// (double)10 + 5.89 => 10.0 + 5.89 => 15.89 (결과값: double형)
									// 작은것(int)이 큰것(double)에 맞춰줘서 덧셈연산은 잘되나 double형 결과값이 int박스에 들어가려고 해서 에러!
		
		// 해결방법1. 연산결과값을 int형으로 강제형변환해준 뒤 담기
		int iSum = (int) (iNum + dNum);	// 강제형변환 하게 되면 소수점 아래부분은 버려버림 (데이터 손실 발생!)
		System.out.println("iSum : " + iSum);
		
		// 해결방법2. double형을 int형으로 강제형변환 한 후 덧셈연산되게
		int iSum2 = iNum + (int)dNum;	// 10 + (int)5.89 => 10 + 5 => 15	결국 데이터 손실은 발생!!
		System.out.println("iSum : " + iSum);
		
		// 해결방법3. 연산결과를 double형 변수에 기록하기!
		double dSum = iNum + dNum;
		System.out.println("dsum : " + dSum);
		
	}
	
	
	
	
}
