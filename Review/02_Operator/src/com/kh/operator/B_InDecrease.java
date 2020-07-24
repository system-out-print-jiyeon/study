package com.kh.operator;

public class B_InDecrease {

	
	/*
	 * * 증감연산자 (단항연산자)
	 * 
	 * ++ : 값을 1증가시키는 연산자
	 * -- : 값을 1감소시키는 연산자
	 * 
	 * (증감연산자)값 : 전위 연산자		--> 선증감 후처리
	 * 값(증감연산자) : 후위 연산자 		--> 선처리 후증감
	 */
	
	public void method1() {
		
		// 전위 연산 테스트
		int num1 = 10;
		
		System.out.println("전위연산 적용 전 num1의 값 : " + num1); // num1 = 10 출력
		System.out.println("1회 수행 후 결과 : " + ++num1); // num1 = 11 출력
		System.out.println("2회 수행 후 결과 : " + ++num1); // num1 = 12 출력
		System.out.println("전위연산 적용 후 num1의 값 : " + ++num1); // num1 = 12 출력
		
		System.out.println("==============================");
		
		int num2 = 10;
		
		System.out.println("후위연산 적용 전 num2의 값 : " + num2);	// num2 = 10 출력
		System.out.println("1회 수행 후 결과 : " + num2++);	// num2 = 10 출력 후 --> 11로 증가
		System.out.println("2회 수행 후 결과 : " + num2++);	// num2 = 11 출력 후 --> 12로 증가
		System.out.println("후위연산 적용 후 num2의 값 : " + num2);	// num2 = 12 출력

	}

	public void method2() {
		
		// 전위연산
		int a = 10;
		int b = ++a; // a = 11,	b =	11	
		System.out.println("a : " + a + ", b : " + b);
		
		// 후위연산
		int c = 10;
		int d = c++;	// c=10(11) d=10
		
		System.out.println("c : " + c + "d : " + d);
		
		int num1 =20;
		int result1 = num1++ * 3; // num1=20(21) result=20*3=60
		System.out.println("num : " + num1);
		System.out.println("result : " + result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3; // num2=21	result=21*3=63
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + num2);
		
	}
	
	public void method3() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);	// a=10(11)		--> 10출력
		
		System.out.println((++a) + (b++)); // a=12 b=20(21)		--> 32출력
		
		System.out.println((a++) + (--b) + (--c)); // a=12(13) b=20 c=29	--> 61출력
		
		
		System.out.println("a : " + a);		// a=13
		System.out.println("b : " + b);		// b=20
		System.out.println("c : " + c);		// c=29

	}
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);
		
		System.out.println((++a) + (b++));
		
		System.out.println((a++) + (--b) + (--c));
		
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

	}
	
	public void method5() {
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		System.out.println(++a - --b);	// a=11 b=9 --> 2
		
		System.out.println(--b + c++);	// b=8 c=20(21) -->28
		
		System.out.println(a++ + b-- * c++);	// a=11(12) b=8(7) c=21(22)
												// 11 + 168 --> 179
		
		
		System.out.println("a : " + a);	// a=12
		System.out.println("b : " + b);	// b=7
		System.out.println("c : " + c);	// c=22
		
		
		
		
	}
	
	
	
}
