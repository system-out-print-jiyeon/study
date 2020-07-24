package com.kh.operator;

import java.util.Scanner;

public class F_Triple {

	/*
	 * * 삼항 연산자 : 항목이 3개인 연산자
	 * 
	 * [표현법]
	 * 조건식 ? 조건식이 true일 경우의 결과값1 : 조건식이 false일 경우의 결과값2
	 * 
	 * 조건식은 반드시 true 또는 false가 나오게끔 작성해야됨!
	 * 주로 조건식에 비교/논리 연산자가 사용됨!
	 * 
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		// 조건식 ? 참일 경우의 값 : 거짓일 경우의 값
		
		// System.out.println( num > 0 ? "양수" : "양수가 아님");
		String result = (num > 0 ? "양수" : "양수가 아님");
		System.out.println(num + "은(는) " + result);
		
	}
	
	public void method2() {
		/*
		 * 사용자에게 두개의 정수값 입력받아서
		 * 두 정수값의 곱셈 결과가 100보다 큰 경우 "결과가 100이상입니다."
		 * 						아닌 경우 "결과가 100보다 작습니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		String result = (num1 * num2 >= 100 ? "결과가 100이상 입니다." : "결과가 100보다 작습니다.");
		System.out.print(num1 * num2 + "은(는)" + result);
		
	}
	
	public void method3() {
		
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0 ? "짝수이다" : "홀수이다");
		//String result = (num % 2 == 1 ? "홀수이다" : "짝수이다");
		//String result = (num % 2 != 1 ? "짝수이다" : "홀수이다");
		
		
		System.out.print(num + "은(는) " + result);	
	}
	
	public void method4() {
		
		// 사용자가 입력한 영문자 값이 대문자인지 아닌지 판별 한 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z')? "대문자이다" : "대문자가 아니다";
		System.out.println(ch + "은(는) " + result);
		
		
	}
	
	// 삼항연산자를 중첩해서!!
	public void method5() {
		
		// 사용자가 입력한 정수값이 양수인지, 음수인지, 0인지 정확히 판별한 후 출력 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		
		//String result = (num > 0 ? "양수이다" : (num == 0 ? "0이다" : "음수이다"));
		String result = (num > 0 ? "양수이다" : (num < 0 ? "음수이다" : "0이다"));
		
		
		System.out.println(num + "은(는) " + result);

		
		
	}

	
	public void method6() {
		
		// 두 개의 정수값을 입력받고
		// + 또는 - 를 입력받아 그에 해당하는 연산 결과 출력
		
		// +를 입력했을 경우 덧셈연산 결과 출력
		// -를 입력했을 경우 뺄셈연산 결과 출력
		// 그 외의 문자를 입력했을 경우 "잘못 입력하셨습니다" 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자(+ 또는 -) 입력 : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + "" : "잘못 입력하셨습니다"));
		System.out.println("결과 : " + result);
		
		
	}
	
	
}
