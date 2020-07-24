package com.kh.chap01_condition.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * 1. 단독 if문
	 * 
	 * if(조건식) {
	 * 		.. 실행할 코드..;
	 * }
	 * --> 조건식의 결과가 참(true)일 경우 중괄호 안의 코드 실행
	 * --> 조건식의 결과가 거짓(false)일 경우 중괄호 안의 코드 실행되지 X 무시하고 넘어감
	 */
	
	public void method1() {
		// 실습문제 1 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
		System.out.println("양수다 ");
		}

		if(num <= 0) {
			System.out.println("양수가 아니다 ");
		}
		
	}
	
	public void method2() {
		// 실습문제 3 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
		System.out.println("짝수다");
		}
		
		if(num % 2 == 1) {
		System.out.println("홀수다");
		}
	}
	
	public void method3() {
		// 실습문제 5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);

	
		System.out.print("성적(소수점 아래 둘째 자리까지 ) : ");
		double score = sc.nextDouble();
		
		String result = "";	// 지역변수 세팅시 반드시 초기화 해놓는 습관을 들여라
		
		if(gender == 'M' || gender == 'm') {
			 result = "남";				// 지역변수 {  } <-- 이 안에서만 쓰임
		}
		if (gender == 'F' || gender == 'f') {
			 result = "여";
		}
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("잘못입력하였습니다.");
	
			return;				//	메소드 자체를 (메소드를 호출했던 곳으로) 빠져나가겠다는 구문
								//  그래서 뒤에 내용 출력안됨!!
		}

		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grade, classNum, num, name, result, score);
		
		
	}
	
	public void method4() {
		// 실습문제 6
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("나이 : ");
			int age = sc.nextInt();
		
			if(age <= 13) {
				System.out.println("어린이");
			}
			if(age >13 && age<= 19) {
				System.out.println("청소년");
			}
			if(age > 19) {
				System.out.println("성인");
			}
	
		
	
	}
	
	
	
}
