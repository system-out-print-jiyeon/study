package com.kh.chap05_constructor.run;

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
	
		
		// 1. �⺻�����ڷ� ��ü ����
		User u1 = new User();
		
		System.out.println(u1.information());	// JVM�� �ʱⰪ�� �������
		
		
		//		setter�� ���� �� �ʱ�ȭ
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("ȫ�浿");
		
		System.out.println(u1.information());
		
		// ������ ���ÿ� �ʱ�ȭ�� �� ������?
		// 2. �Ű����� 3��¥�� �����ڸ� ���� ��ü ����
		User u2 = new User("user02", "pass02", "�踻��");
		System.out.println(u2.information());
		
		// setter�޼ҵ� �־���ϴ� ���� : �ϳ��� ���� ���� ���氡��
		u2.setAge(30);
		System.out.println(u2.information());
		
		
		// 3. �Ű����� 5��¥�� �����ڸ� ���� ��ü ����
		User u3 = new User("user03", "pass03", "ȫ���", 20, '��');
		System.out.println(u3.information());
		
		
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String userPwd = sc.nextLine();
		
		System.out.print("�̸� : ");
		String userName = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		
		User u4 = new User(userId, userPwd, userName, age, gender);
		System.out.println(u4.information());
		*/
		
		
		
		// �⺻������ ���
		
		User u4 = new User();
		
		System.out.print("���̵� : ");
		u4.setUserId(sc.nextLine());
		
		System.out.print("��й�ȣ : ");
		u4.setUserPwd(sc.nextLine());
		
		System.out.print("�̸� : ");
		u4.setUserName(sc.nextLine());
		
		System.out.print("���� �Ǵ� ������ �߰��� �Է��Ͻðڽ��ϱ�? (y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch=='y' || ch=='Y') {
			
			System.out.print("���� : ");
			u4.setAge(sc.nextInt());
			sc.nextLine();
			
			System.out.print("����(��/��) : ");
			u4.setGender(sc.nextLine().charAt(0));
		
		}
		System.out.println(u4.information());
		
	}

	
	
}
