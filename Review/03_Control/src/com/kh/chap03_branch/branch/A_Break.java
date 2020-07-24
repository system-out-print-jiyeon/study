package com.kh.chap03_branch.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * * break문 : break문이 기술되어있는 가장 가까운 반복문을 빠져나가는 문구
	 */
	
public void method1() {
		
		// 사용자에게 문자열 입력받은 후 그 입력받은 문자열 출력 (이 내용을 계속 반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복을 종료하게끔
		
		Scanner sc = new Scanner(System.in);
		
		/*
		for(;;) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			System.out.println(str);
		}
		*/
		
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break; // 반복문을 강제로 빠져나가게 하는 구문
			}
			
			System.out.println(str);
		}
		
		System.out.println("프로그램 종료합니다.");
		
	}
	
	public void method2() {
		
		// 매번 랜덤값(1~10)을 발생 시킨 후 출력
		// 단, 그 랜덤값이 홀수일 경우 반복문을 빠져나감
		
		while(true) {
			int random = (int)(Math.random() * 100 + 1);

			System.out.println(random);
			
			if(random % 2 == 1) {
				break;
			}
			
		}
		
	}
	
	
	public void method3() {
		
		// 매번 사용자에게 정수 두개와 연산기호(+또는-)를 입력받은 후
		// 그 연산결과를 출력해주는 내용을 매번 수행
		// 단, 연산기호를 잘 못 입력했을 경우 반복문을 빠져나가게
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("연산기호(+또는-) : ");
			char op = sc.nextLine().charAt(0);
			
			int result = 0; // 산술연산한 결과를 담아줄 변수
			if(op == '+') {
				result = num1 + num2;
			}else if(op == '-') {
				result = num1 - num2;
			}else { // 연산기호를 잘못입력했을 경우
				System.out.println("잘못입력하였습니다. 프로그램을 종료합니다.");
				break;
			}
			
			System.out.println("result : " + result);
			
		}
		
	}
	
	
	
	
}
