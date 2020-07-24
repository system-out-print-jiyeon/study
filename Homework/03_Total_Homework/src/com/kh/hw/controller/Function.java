package com.kh.hw.controller;

import java.util.Scanner;

public class Function {

	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자 (+, -, x, /) : ");
		String op = sc.nextLine();
		
		int result =0;
		
		if(op.equals("/") && num2 == 0) {
		System.out.print("0으로 나눌 수 없습니다.\n");
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
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		int sum = 0;
		
		for(int i=1; i<=max; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지 정수들의 합 : %d \n" , min, max, sum );	
		System.out.println();
	}
	
	public void printProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		
		
		System.out.print("성격 : ");
		String person = sc.nextLine();
		
	
		System.out.printf("이름 : %s \n나이 : %d \n성별 : %s \n성격 : %s \n", name, age, gender, person);
		System.out.println();
	}
	
	
		public void printScore() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			
			System.out.print("반 : ");
			int classNum = sc.nextInt();
			
			System.out.print("번 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			
			System.out.print("성별 (M/f) : ");
			char gender = sc.nextLine().charAt(0);
			
			String result = "";	
			
			if(gender == 'M' || gender == 'm') {
				 result = "남";				
			}else if (gender == 'F' || gender == 'f') {
				 result = "여";
			}
			
			
			System.out.print("성적 : ");
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
	
			System.out.printf("%d학년 %d반 %d번 %s학생 %s의 점수는 %.2f이고 %s등급입니다. ", 
							grade, classNum, num, result, name, score, level);
			System.out.println();

		}
	
	public void printStarNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
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
			System.out.println("양수가 아닙니다.");
		}
		System.out.println();
		
	}
	
	public void sumRandom() {
		
		int random = (int)(Math.random()*100 + 1);
		
		int sum = 0;
		
		for(int i=1;i<=random;i++) {
			sum += i;
		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
		System.out.println();

	}
	
	public void exceptGugu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
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
		System.out.print("주사위 두 개의 합을 맞춰보세요(1~12입력) : ");
		int num = sc.nextInt();
		int random = (int)(Math.random()*12+1);
	
			if(num>=1 && num<=12) {
				
				if(num != random) {
					System.out.println("틀렸습니다.");
					}else {
					System.out.println("정답입니다. \n주사위의 합 : " + random);
					sc.nextLine();
					System.out.print("계속 하시겠습니까? (y/n) : ");
					char  yn = sc.nextLine().charAt(0);
				
					if(yn == 'Y' || yn == 'y') {
						continue;
					}else if (yn == 'N' || yn == 'n') {
						 System.out.print("종료합니다.");
					}else{
						System.out.println("잘못입력하셨습니다.");
					}break;
				}
				
			}else {
			System.out.println("1~12사이의 숫자를 입력해주세요.");
			}
		}System.out.println();

	
	}	
		*/
	
	
public void diceGame() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //while1
			
			//처음시작하거나, 맞추고 계속할 경우 여기서부터 시작.
			
			// 두 개의 주사위 경우의 수 (1~6) 각각 랜덤값을 설정해주자
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
						
			//두 랜덤수의 합
			int result = dice1+dice2;
		
			while(true) { //while2
				//못맞췄을 경우 여기서부터 시작한다. 못맞췄는데 랜덤값 재설정할 경우 1~12까지 입력해도 못맞출 수 있음.
				
				//두 수의 합 맞추기 
				System.out.print("주사위 두 개의 합을 맞춰보세요(1~12입력) : ");
				int ans = sc.nextInt();
				
				sc.nextLine(); //버퍼 비워주자.
		
				//1~12사이 값 입력 안했을 경우 다시입력받자
				if(ans < 1 || ans > 12) {
					System.out.println("1~12 사이의 값을 입력하세요 ^^");
					continue;
				}
			
				if(result == ans) { //맞춘 경우
				
					System.out.println("정답입니다.");
					System.out.printf("주사위의 합 : %d\n",result);
				
					while(true) //y나 n값 입력할 때 까지 반복한다.
					{
					
						System.out.print("계속 하시겠습니까?(y/n) : ");				
						String yN = sc.nextLine();
				
						if (yN.equals("y") || yN.equals("Y")) {
						
							//y나 Y입력했을 경우 계속하시겠습니까 그만출력하고 빠져나가자.
							break;
						
						}
						else if (yN.equals("n") || yN.equals("N")) {
						
							//n이나 N입력했을 경우 게임을 종료한다.
							System.out.println("종료합니다."); 
							return;
						
						}
						else continue; //이상한값 입력했을 경우 "계속하시겠습니까?" 다시 출력!
					}
					
					//맞추고 y 입력한 경우 처음부터 랜덤값 재설정하여 다시시작한다.
					System.out.println("주사위 랜덤값이 재설정됩니다.");
					break;  
				
				}
				else System.out.println("틀렸습니다. 맞출때까지 못가여"); //틀린 경우 맞출 때 까지 반복!
		
			}//while2의 끝
			
		}//while1의 끝
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

