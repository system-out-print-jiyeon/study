package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Student[] arr1 = new Student[3];
		
		arr1[0] = new Student("ȫ�浿",20, 178.2, 70.0, 1 , "�����ý��۰��а�");
		arr1[1] = new Student("�踻��",21, 187.3, 80.0, 2 , "�濵�а�");
		arr1[2] = new Student("������",23, 167.0, 45.0, 4, "������Ű��а�");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i].information());
		
		}
		
		
		
		
		
		//=========================================
		
		
		Employee[] arr2 = new Employee[10];
		/*
		arr2[0] = new Employee("�ں���",28, 180.3, 72.0, 100000000 , "������");
		arr2[1] = new Employee("������",40, 182.0, 76.0, 200000000 , "��ȹ��");
		*/
	
		
		
		int count = 0;
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			for(int i=0; i<arr2.length; i++) {
				
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			System.out.print("���� : ");
			double height = sc.nextDouble();
			
			System.out.print("������ : ");
			double weight = sc.nextDouble();
			
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			
			arr2[i] = new Employee(name,age, height, weight, salary, dept);
			count++;
			
			
			System.out.print("��� �߰��Ͻðڽ��ϱ�? (y/n) : ");
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
