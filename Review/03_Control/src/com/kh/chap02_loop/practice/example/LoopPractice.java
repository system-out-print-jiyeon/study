package com.kh.chap02_loop.practice.example;

import java.util.Scanner;

public class LoopPractice {

public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}

		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}break;
	
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		
		}
		
	}
	
	
	
	
	public void practice3() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
			System.out.print(i + " ");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}
	
	

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num>=1) {
	
			for(int i=num; i>=1; i--) {
			System.out.print(i + " ");
			}break;
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	// �Ǳ�Ǵµ� �̻���
	public void practice5() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		
		
		if(num1>0 && num2>0) {
			for(int i=min; max>=i; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.print("1 �̻��� ���ڸ��� �Է����ּ���.");
		}
}

	

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
			
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
			
			
			
			if(num1>0 && num2>0) {
				for(int i=min; max>=i; i++) {
					System.out.print(i + " ");
				} break;
				
			}else {
				System.out.print("1 �̻��� ���ڸ��� �Է����ּ���. \n");
			}
			
	
		}
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "�� =====");
		
		for(int i=1;i<10;i++) {
			
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		}

	}
	
	
	
	public void practice9() {
		
		
		  Scanner sc = new Scanner(System.in);
		

		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan<2 || dan>10) {
			System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			
			
		}else {
			for(int i=dan; dan<=9;dan++) {
				System.out.println("===== " + dan+ "�� =====");
			
				for(int su=1; su<=9; su++) {
				
				
				System.out.println(dan + " X " + su + " = " + dan*su);
				}
			}
		}
	
		
	
		
		
	}
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {			
			
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { 
				
				for(int i = num; i <= 9; i++) {					
					System.out.printf("===== %d�� =====\n", i);
					
					for(int j = 1; j <= 9; j++) {				
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					
					System.out.println();
				}	
				break;
				
			} else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		}

	}
	
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		
		/*
		for(int i=1; i<=10;i++) {
			
			System.out.print(start + " ");
			start += num;
		}
		*/
		
		int count = 0;	// �ݺ��Ǵ� Ƚ���� �������� ���� 
		
		for(int i=start; ; i+=num) { // i�������� start�������� �Ź� num�� ����
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
		
		System.out.print("������(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		if(op.equals("exit")) {
			System.out.print("���α׷��� �����մϴ�."); break;
		}
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(op.equals("/") && num2==0) {
			System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
			continue;
		}
			int result = 0;
			
			switch(op) {
			case "+" : result = num1 + num2;break;
			case "-" : result = num1 - num2;break;
			case "*" : result = num1 * num2;break;
			case "/" : result = num1 / num2;break;
			case "%" : result = num1 % num2;break;
			default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n");continue;
			
			}
			
			System.out.printf("%d %s %d = %d \n", num1, op, num2, result );
			System.out.println();break;
			
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}
	
	
	
	

