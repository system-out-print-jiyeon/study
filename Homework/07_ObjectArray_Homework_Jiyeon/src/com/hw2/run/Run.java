package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] st = new Student[10];
		
		int count = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			
			System.out.print("반 : ");
			int classNum = sc.nextInt();
			sc.nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			
			
			st[count] = new Student(grade, classNum, name, kor, eng, math);
	
			count++;

			sc.nextLine();
			
			
			
			System.out.print("계속 추가하나요?(y/n) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'n') {
	
					break;
			}
			if(yn == 'y') {
			
				continue;
			}
				
			}
			for(int j = 0; j<count; j++) {
				System.out.println(st[j].information());
				
	}	

		
		

	}

}
