package com.kh.operator;

public class C_Arithmetic {

	// 산술연산자 (이항 연산자 == 두 개의 값을 가지고 연산하는 연산자)
	// + - *(곱셈) /(나누기) %(나머지)
	
	// * / %
	// + -
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 4;
		
		//					"num1 + num2 = 10" + num2
		//						"num1 + num2 = 104
		System.out.println("num1 + num2 = " + (num1 + num2));	// 14
		System.out.println("num1 - num2 = " + (num1 - num2));	// 6
		System.out.println("num1 x num2 = " + (num1 * num2));	// 40
		System.out.println("num1 / num2 = " + (num1 / num2));	// 2
		System.out.println("num1 % num2 = " + (num1 % num2));	// 2 --> 나머지 값
		
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		
	}
	
	public void method3() {
	
	int a = 5;
	int b = 10;
	
	int c = (++a) + b; // a=6 b=10 c=16 
	int d = c / a;	// a=6 b=10 c=16 d=2
	int e = c % a;	// a=6 b=10 c=16 d=2 e=4
	int f = e++;	// a=6 b=10 c=16 d=2 e=4(5) f=4
					// a=6 b=10 c=16 d=2 e=5 f=4
	int g = (--b) + (d--);	// a=6 b=9 c=16 d=2(1) e=5 f=4 g=11
							// a=6 b=9 c=16 d=1 e=5 f=4 g=11
	int h = 2;				
	// a=6 b=9 c=16 d=1 e=5 f=4 g=11 h=2
	int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
	//		6(7) + 9 / (15 / 4) * (11(10) - 1)%(6 + 2)
	//		6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
	//		6 + 9 / 3 * 10 % 8
	//		6 + 3 * 10 % 8
	//		6 + 30 % 8
	//		12
	
	
	//	 a=7 b=9 c=15 d=1 e=6 f=4 g=10 h=2 i=12
	
	System.out.println("a : " + a);	
	System.out.println("b : " + b);	
	System.out.println("c : " + c);
	System.out.println("d : " + d);	
	System.out.println("e : " + e);	//
	System.out.println("f : " + f);	// 
	System.out.println("g : " + g);	// 
	System.out.println("h : " + h);	// 
	System.out.println("i : " + i);	//
	
	
	
	
	
	
	}
	
}
