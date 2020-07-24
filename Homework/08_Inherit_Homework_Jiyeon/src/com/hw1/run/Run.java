package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] arr1 = new Student[3];
		
		arr1[0] = new Student("홍길동",20, 178.2, 70.0, 1 , "정보시스템공학과");
		arr1[1] = new Student("김말똥",21, 187.3, 80.0, 2 , "경영학과");
		arr1[2] = new Student("강개순",23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i].information());
		
		}
		
		
		
		
		
		//=========================================
		
		
		Employee[] arr2 = new Employee[10];
		/*
		arr2[0] = new Employee("박보검",28, 180.3, 72.0, 100000000 , "영업부");
		arr2[1] = new Employee("강동원",40, 182.0, 76.0, 200000000 , "기획부");
		*/
	
		
		
		int count = 0;
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<arr2.length; i++) {
				
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			arr2[i] = new Employee(name,age, height, weight, salary, dept);
			count++;
			
			
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'y' || ch == 'Y') {
				
				
			}else {
				for(int j=0; j<count; j++) {
					System.out.println(arr2[j].information());
					
					}
				return;
				}
			
			
			}
			
		} //while
		
	}//main
	
	
	
	
	
	
	
	

}
