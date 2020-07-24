package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	// �ǽ����� 1. 
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.print(num > 0? "�����" : "����� �ƴϴ�") ;
	}
	
	// �ǽ����� 2.
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.print(num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������"));
	
	}
	
	
	// �ǽ����� 3.
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.print(num % 2 == 0 ? "¦����" : "Ȧ����");
		
	}
	
	
	// �ǽ�����  4. 
	/* ��� ����� ������ ���� ������������ �Ѵ�.
	 * �ο� ���� ���� ������ Ű����� �Է¹ް�
	 * 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���
	 */
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + (candy / people));
		System.out.print("���� ���� ���� : " + (candy % people));	
	}
	
	
	// �ǽ����� 5. �ڡڡ�
	
	public void practice5() {
	
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
		String result = (gender == 'F' ? "��" : "��");
	
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ����� ) : ");
		double score = sc.nextDouble();
		
		//��� ���
		// 0�г� 0�� 00�� 000 0�л��� ������ 00.00�̴�.
		
		/*
		System.out.println( grade + "�г� " + classNum + "�� " + num + "�� " 
							+ name + " " + result + "�л��� ������ " + score + "�̴� . ");
		*/
		
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.",
							grade, classNum, num, name, result, score);
	}
	
	// �ǽ����� 6.
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print(age <= 13 ? "���" : (age > 13 && age <= 19? "û�ҳ�":"����"));
	
	}
	
	
	// �ǽ����� 7.
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math); 	// ����
		
		double avg = sum /3.0 ;	// (double)int / double => 300.0 / 3.0 => double --> �����ڷ����� ū�ڷ������� �ڵ�����ȯ
								// int / int => ����� int => �Ҽ��� ǥ���� ��Ʊ� ������ ������ �ս� �߻��� �� ����
		
		System.out.println("�հ� : " + sum );
		System.out.println("��� : " + avg);
		
		String result = (kor>=40 && eng>=40 && math>=40 && avg>=60 ? "�հ�" : "���հ�");
		System.out.println(result);
		
		
	}
	
	// �ǽ����� 8. �ڡڡ�
	
	public void practice8() {
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (- ����) : ");
		Scanner sc = new Scanner(System.in);
		// xxxxxx-1xxxxxx / 3xxxxxx
		//		 -2xxxxxx / 4xxxxxx
		String str = sc.nextLine();	// "xxxxxx-xxxxxxx";
									//  0123456789.....
		
		// �����ڸ��� �ش��ϴ� ���ڸ��� �����ؼ� ���� ���
		char ch = str.charAt(7);	// int �ƴ�! ������ ���ڷ� �νĵ�
									// ex) '1', '2', '3' ,'4' ,,, �߸��� ���� ������� ����..
		String result = (ch=='1' || ch=='3' ? "����" : 
						(ch=='2' || ch=='4' ? "���� " : "�߸��Է��ϼ̽��ϴ�"));	
		//�ڡڡ� 1���Է��ؼ� Ʋ����. ���� '1'�� �Է��ؾ���
		
		System.out.print (result);
		
	}
	
	// �ǽ����� 9.
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		System.out.print(num3 <= num1 || num3 > num2 ? "true" : "false");

	}
	
	// �ǽ����� 10. 
	
	public void prctice10() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.print(isTrue);
		
		
	}
	
	
}
