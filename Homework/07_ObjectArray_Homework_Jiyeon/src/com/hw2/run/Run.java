package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] st = new Student[10];
		
		int count = 0;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			
			System.out.print("�� : ");
			int classNum = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			
			System.out.print("�������� : ");
			int math = sc.nextInt();
			
			
			st[count] = new Student(grade, classNum, name, kor, eng, math);
	
			count++;

			sc.nextLine();
			
			
			
			System.out.print("��� �߰��ϳ���?(y/n) : ");
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
