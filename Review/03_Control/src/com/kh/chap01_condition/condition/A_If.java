package com.kh.chap01_condition.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * 1. �ܵ� if��
	 * 
	 * if(���ǽ�) {
	 * 		.. ������ �ڵ�..;
	 * }
	 * --> ���ǽ��� ����� ��(true)�� ��� �߰�ȣ ���� �ڵ� ����
	 * --> ���ǽ��� ����� ����(false)�� ��� �߰�ȣ ���� �ڵ� ������� X �����ϰ� �Ѿ
	 */
	
	public void method1() {
		// �ǽ����� 1 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
		System.out.println("����� ");
		}

		if(num <= 0) {
			System.out.println("����� �ƴϴ� ");
		}
		
	}
	
	public void method2() {
		// �ǽ����� 3 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
		System.out.println("¦����");
		}
		
		if(num % 2 == 1) {
		System.out.println("Ȧ����");
		}
	}
	
	public void method3() {
		// �ǽ����� 5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();

		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);

	
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ����� ) : ");
		double score = sc.nextDouble();
		
		String result = "";	// �������� ���ý� �ݵ�� �ʱ�ȭ �س��� ������ �鿩��
		
		if(gender == 'M' || gender == 'm') {
			 result = "��";				// �������� {  } <-- �� �ȿ����� ����
		}
		if (gender == 'F' || gender == 'f') {
			 result = "��";
		}
		if(gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
	
			return;				//	�޼ҵ� ��ü�� (�޼ҵ带 ȣ���ߴ� ������) ���������ڴٴ� ����
								//  �׷��� �ڿ� ���� ��¾ȵ�!!
		}

		
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.", grade, classNum, num, name, result, score);
		
		
	}
	
	public void method4() {
		// �ǽ����� 6
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("���� : ");
			int age = sc.nextInt();
		
			if(age <= 13) {
				System.out.println("���");
			}
			if(age >13 && age<= 19) {
				System.out.println("û�ҳ�");
			}
			if(age > 19) {
				System.out.println("����");
			}
	
		
	
	}
	
	
	
}
