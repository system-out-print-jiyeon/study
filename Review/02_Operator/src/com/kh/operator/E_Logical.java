package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * * 논리 연산자 (이항 연산자)
	 * - 두 논리값을 연산하는 연산자
	 * 
	 * 논리값 && 논리값 : 두 논리값 모두 true일 경우 연산 결과도 true
	 * 논리값 || 논리값 : 왼쪽, 오른쪽 둘 중에 하나하도 true일 경우 연산결과도 true
	 *
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기 (1부터 100사이의 값인지)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// 사용자가 입력한 값이 1~100 사이의 값?
		//					1이상 100이하인가요?
		
		// 값이 1 이상이고, 100이하인가요?
		//System.out.println(1 <= num <= 100); 	// 한 번에 입력 안됨
		System.out.println(num >= 1 && num <= 100); // &&이 연결
		
		// &&(And) 의미 : ~하고, 그리고, ~하면서, ~이고
		//		   두 개의 조건이 모두 true여야만 &&연산의 결과값이 true
		// 		   둘 중에 하나라도 false가 된다면 &&연산의 결과값은 false
	
		
	}
	
	public void method2() {
		
		// 사용자가 입력한 영문자값이 대문자인지 확인하기 (A~Z)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 사용자가 입력한 영문자값이 'A' ~ 'Z' 	(65~90까지의 숫자로 연달아 나열되어있음)
		//System.out.println('A' <= ch <= 'Z');
		System.out.println( ch >= 'A' && ch <= 'Z');
		// 아스키코드 표  (0~127 : 영문자, 숫자, 특수문자)
		// 유니코드 표 (0~65535 : 한글포함)

	}
	
	public void method3() {
		
		// 종료하시겠습니까? (y또는 Y를 입력해주세요)
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 값이 y또는 Y인지 확인하기
		System.out.println("종료하시려면 y또는 Y를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y' || ch == 'Y');
		
		// || (Or) 의미 : ~이거나, ~또는
		//				두 개의 조건 중에 하나라도 true가 있다면 || 연산한 결과값은 true
		//				두 개의 조건 모두 false일 경우 || 연산한 결과값은 false
		
		System.out.println("사용자가 입력한 값이 y또는 Y입니까 : " + result);
		
		
	}
	
	/*
	 * && : 두 개의 조건이 모두 true여야 결과값이 true이다. (And)
	 * 
	 * true && true		=> true
	 * true && false	=> false 
	 * false && true	=> false
	 * false && false	=> false
	 * 
	 * --> && 연산자를 기준으로 앞의 결과가 false값이 나온다면 뒤의 조건(연산)은 굳이 실행되지 않음!!
	 * 
	 * 
	 * || : 두 개의 조건이 하나라도 true이면 결과값이 true이다.(OR)
	 * 
	 * true || true		=> true
	 * true || false	=> true
	 * false || true	=> true
	 * false || false	=> false
	 * 
	 * --> || 연산자를 기준으로 앞의 결과가 true값이 나온다면 뒤의 조건(연산)은 굳이 실행되지 않음!!
	 */
	
	
	public void method4() {
		
		// boolean result = true || true;
		
		int num = 10;
		System.out.println("&&연산 전의 num값 : " + num);
		
		//num이  5보다 작고 0보다 큽니까
		boolean result1 = num < 5 && ++num > 0;	// false && true
		
		System.out.println("result1 : " + result1);
		System.out.println("&&연산 후의 num값 : " + num);
		
		boolean result2 = num < 20 || ++num> 0 ;		// <-- ++는 수행 됐는지 안됐는지 확인차 넣은 것
		
		System.out.println(" || 연산 후의 num값 : " + num);
		
		
		
		
		
	}
	
	
}
