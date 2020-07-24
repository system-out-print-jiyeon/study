package com.kh.hw.controller;

import java.util.Scanner;

public class Function {

	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������ (+, -, x, /) : ");
		String op = sc.nextLine();
		
		int result =0;
		
		if(op.equals("/") && num2 == 0) {
		System.out.print("0���� ���� �� �����ϴ�.\n");
		System.out.printf("%d %s %d = %d", num1, op, num2, result);
		}else {
			switch(op) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2;
		
			}
			System.out.printf("%d %s %d = %d", num1, op, num2, result);
		}	System.out.println();

		}
		
	public void totalCalculator() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		int sum = 0;
		
		for(int i=1; i<=max; i++) {
			sum += i;
		}
		System.out.printf("%d���� %d���� �������� �� : %d \n" , min, max, sum );	
		System.out.println();
	}
	
	public void printProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		String gender = sc.nextLine();
		
		
		System.out.print("���� : ");
		String person = sc.nextLine();
		
	
		System.out.printf("�̸� : %s \n���� : %d \n���� : %s \n���� : %s \n", name, age, gender, person);
		System.out.println();
	}
	
	
		public void printScore() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			
			System.out.print("�� : ");
			int classNum = sc.nextInt();
			
			System.out.print("�� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			
			System.out.print("���� (M/f) : ");
			char gender = sc.nextLine().charAt(0);
			
			String result = "";	
			
			if(gender == 'M' || gender == 'm') {
				 result = "��";				
			}else if (gender == 'F' || gender == 'f') {
				 result = "��";
			}
			
			
			System.out.print("���� : ");
			double score = sc.nextDouble();
			
			char level = 'F' ;
			if(score>=90) {
				level = 'A';
			}else if(score>=80) {
				level = 'B';
			}else if(score>=70) {
				level = 'C';
			}else if(score>=60) {
				level = 'D';
			}
	
			System.out.printf("%d�г� %d�� %d�� %s�л� %s�� ������ %.2f�̰� %s����Դϴ�. ", 
							grade, classNum, num, result, name, score, level);
			System.out.println();

		}
	
	public void printStarNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					if(i==j) {
						System.out.print(i);break;
					}else {
						System.out.print("*");
					}
				}System.out.println();
			}
		}else {
			System.out.println("����� �ƴմϴ�.");
		}
		System.out.println();
		
	}
	
	public void sumRandom() {
		
		int random = (int)(Math.random()*100 + 1);
		
		int sum = 0;
		
		for(int i=1;i<=random;i++) {
			sum += i;
		}
		System.out.println("1���� " + random + "������ �� : " + sum);
		System.out.println();

	}
	
	public void exceptGugu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		for(int i=num; i<=9; i++ ) {
			
			for(int j=1; j<=9;j++) {
				if(i!=j) {
					System.out.println(i + " X " + j + " = " + i*j);
				}
			}break;
		}System.out.println();
	
	}
	
	/*
	public void diceGame() {
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.print("�ֻ��� �� ���� ���� ���纸����(1~12�Է�) : ");
		int num = sc.nextInt();
		int random = (int)(Math.random()*12+1);
	
			if(num>=1 && num<=12) {
				
				if(num != random) {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					}else {
					System.out.println("�����Դϴ�. \n�ֻ����� �� : " + random);
					sc.nextLine();
					System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
					char  yn = sc.nextLine().charAt(0);
				
					if(yn == 'Y' || yn == 'y') {
						continue;
					}else if (yn == 'N' || yn == 'n') {
						 System.out.print("�����մϴ�.");
					}else{
						System.out.println("�߸��Է��ϼ̽��ϴ�.");
					}break;
				}
				
			}else {
			System.out.println("1~12������ ���ڸ� �Է����ּ���.");
			}
		}System.out.println();

	
	}	
		*/
	
	
public void diceGame() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //while1
			
			//ó�������ϰų�, ���߰� ����� ��� ���⼭���� ����.
			
			// �� ���� �ֻ��� ����� �� (1~6) ���� �������� ����������
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
						
			//�� �������� ��
			int result = dice1+dice2;
		
			while(true) { //while2
				//�������� ��� ���⼭���� �����Ѵ�. ������µ� ������ �缳���� ��� 1~12���� �Է��ص� ������ �� ����.
				
				//�� ���� �� ���߱� 
				System.out.print("�ֻ��� �� ���� ���� ���纸����(1~12�Է�) : ");
				int ans = sc.nextInt();
				
				sc.nextLine(); //���� �������.
		
				//1~12���� �� �Է� ������ ��� �ٽ��Է¹���
				if(ans < 1 || ans > 12) {
					System.out.println("1~12 ������ ���� �Է��ϼ��� ^^");
					continue;
				}
			
				if(result == ans) { //���� ���
				
					System.out.println("�����Դϴ�.");
					System.out.printf("�ֻ����� �� : %d\n",result);
				
					while(true) //y�� n�� �Է��� �� ���� �ݺ��Ѵ�.
					{
					
						System.out.print("��� �Ͻðڽ��ϱ�?(y/n) : ");				
						String yN = sc.nextLine();
				
						if (yN.equals("y") || yN.equals("Y")) {
						
							//y�� Y�Է����� ��� ����Ͻðڽ��ϱ� �׸�����ϰ� ����������.
							break;
						
						}
						else if (yN.equals("n") || yN.equals("N")) {
						
							//n�̳� N�Է����� ��� ������ �����Ѵ�.
							System.out.println("�����մϴ�."); 
							return;
						
						}
						else continue; //�̻��Ѱ� �Է����� ��� "����Ͻðڽ��ϱ�?" �ٽ� ���!
					}
					
					//���߰� y �Է��� ��� ó������ ������ �缳���Ͽ� �ٽý����Ѵ�.
					System.out.println("�ֻ��� �������� �缳���˴ϴ�.");
					break;  
				
				}
				else System.out.println("Ʋ�Ƚ��ϴ�. ���⶧���� ������"); //Ʋ�� ��� ���� �� ���� �ݺ�!
		
			}//while2�� ��
			
		}//while1�� ��
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

