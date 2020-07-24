package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	// 실습문제 1. 
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.print(num > 0? "양수다" : "양수가 아니다") ;
	}
	
	// 실습문제 2.
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.print(num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다"));
	
	}
	
	
	// 실습문제 3.
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.print(num % 2 == 0 ? "짝수다" : "홀수다");
		
	}
	
	
	// 실습문제  4. 
	/* 모든 사람이 사탕을 골고루 나눠가지려고 한다.
	 * 인원 수와 사탕 개수를 키보드로 입력받고
	 * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
	 */
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.print("남는 사탕 개수 : " + (candy % people));	
	}
	
	
	// 실습문제 5. ★★★
	
	public void practice5() {
	
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
		String result = (gender == 'F' ? "여" : "남");
	
		System.out.print("성적(소수점 아래 둘째 자리까지 ) : ");
		double score = sc.nextDouble();
		
		//결과 출력
		// 0학년 0반 00번 000 0학생의 성적은 00.00이다.
		
		/*
		System.out.println( grade + "학년 " + classNum + "반 " + num + "번 " 
							+ name + " " + result + "학생의 성적은 " + score + "이다 . ");
		*/
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.",
							grade, classNum, num, name, result, score);
	}
	
	// 실습문제 6.
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print(age <= 13 ? "어린이" : (age > 13 && age <= 19? "청소년":"성인"));
	
	}
	
	
	// 실습문제 7.
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math); 	// 총점
		
		double avg = sum /3.0 ;	// (double)int / double => 300.0 / 3.0 => double --> 작은자료형이 큰자료형으로 자동형변환
								// int / int => 결과값 int => 소수점 표현이 어렵기 때문에 데이터 손실 발생할 수 있음
		
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + avg);
		
		String result = (kor>=40 && eng>=40 && math>=40 && avg>=60 ? "합격" : "불합격");
		System.out.println(result);
		
		
	}
	
	// 실습문제 8. ★★★
	
	public void practice8() {
		
		System.out.print("주민번호를 입력하세요 (- 포함) : ");
		Scanner sc = new Scanner(System.in);
		// xxxxxx-1xxxxxx / 3xxxxxx
		//		 -2xxxxxx / 4xxxxxx
		String str = sc.nextLine();	// "xxxxxx-xxxxxxx";
									//  0123456789.....
		
		// 성별자리에 해당하는 문자만을 추출해서 변수 기록
		char ch = str.charAt(7);	// int 아님! 무조건 문자로 인식됨
									// ex) '1', '2', '3' ,'4' ,,, 잘못된 값이 담겨있을 수도..
		String result = (ch=='1' || ch=='3' ? "남자" : 
						(ch=='2' || ch=='4' ? "여자 " : "잘못입력하셨습니다"));	
		//★★★ 1로입력해서 틀렸음. 문자 '1'로 입력해야함
		
		System.out.print (result);
		
	}
	
	// 실습문제 9.
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		System.out.print(num3 <= num1 || num3 > num2 ? "true" : "false");

	}
	
	// 실습문제 10. 
	
	public void prctice10() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.print(isTrue);
		
		
	}
	
	
}
