package com.kh.chap02_loop.practice.example;

import java.util.Scanner;

public class LoopPractice {

public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}

		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}break;
	
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		}
		
	}
	
	
	
	
	public void practice3() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
			System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	
	

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
	
			for(int i=num; i>=1; i--) {
			System.out.print(i + " ");
			}break;
			
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 되긴되는데 이상함
	public void practice5() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for(int i=1; i<=num; i++) {
			sum += i;
			if(i < num) { 
				System.out.print(i + " + ");
			}else { 
				System.out.print(i + " = "+sum);
			}
			
			
			
		}
		
	
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		
		
		if(num1>0 && num2>0) {
			for(int i=min; max>=i; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.print("1 이상의 숫자만을 입력해주세요.");
		}
}

	

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
			
			
			
			if(num1>0 && num2>0) {
				for(int i=min; max>=i; i++) {
					System.out.print(i + " ");
				} break;
				
			}else {
				System.out.print("1 이상의 숫자만을 입력해주세요. \n");
			}
			
	
		}
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i=1;i<10;i++) {
			
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		}

	}
	
	
	
	public void practice9() {
		
		
		  Scanner sc = new Scanner(System.in);
		

		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan<2 || dan>10) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			
			
		}else {
			for(int i=dan; dan<=9;dan++) {
				System.out.println("===== " + dan+ "단 =====");
			
				for(int su=1; su<=9; su++) {
				
				
				System.out.println(dan + " X " + su + " = " + dan*su);
				}
			}
		}
	
		
	
		
		
	}
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {			
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { 
				
				for(int i = num; i <= 9; i++) {					
					System.out.printf("===== %d단 =====\n", i);
					
					for(int j = 1; j <= 9; j++) {				
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					
					System.out.println();
				}	
				break;
				
			} else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}

	}
	
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		
		/*
		for(int i=1; i<=10;i++) {
			
			System.out.print(start + " ");
			start += num;
		}
		*/
		
		int count = 0;	// 반복되는 횟수를 세기위한 변수 
		
		for(int i=start; ; i+=num) { // i변수값은 start에서부터 매번 num값 증가
			System.out.print(i + " ");
			count++;
			
			if(count == 10) {
				break;
			}
		}
		
		
	
		}
		
		
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
		
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		if(op.equals("exit")) {
			System.out.print("프로그램을 종료합니다."); break;
		}
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(op.equals("/") && num2==0) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
			continue;
		}
			int result = 0;
			
			switch(op) {
			case "+" : result = num1 + num2;break;
			case "-" : result = num1 - num2;break;
			case "*" : result = num1 * num2;break;
			case "/" : result = num1 / num2;break;
			case "%" : result = num1 % num2;break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");continue;
			
			}
			
			System.out.printf("%d %s %d = %d \n", num1, op, num2, result );
			System.out.println();break;
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}
	
	
	
	

