package com.kh.chap01_condition.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * 2. if-else ��
	 * 
	 * if(���ǽ�){
	 * 		..�����ڵ�1..
	 * }else{
	 * 		..�����ڵ�2..
	 * }
	 * 
	 * ���ǽ��� true�� ��� �����ڵ�1 ������ if-else�� ��������
	 * ������ ���ǽ��� false�� ��� ������ �����ڵ�2 ����
	 * 
	 * 
	 * 3. if-else��
	 * 
	 * ���� �񱳴������ �������� ������ ������ ���
	 * 
	 * if(���ǽ�){
	 * 		..�����ڵ�1..
	 * }else if(���ǽ�2){
	 * 		..�����ڵ�2..
	 * }else if(���ǽ�3){
	 * 		..�����ڵ�3..
	 * }else{
	 * 		..���� ���ǵ��� ��� false�� ��� �ݵ�� ������ �ڵ�..
	 * }							<-- else �������� !! �� �ʿ� X
	 * 
	 * ���ǽ�1��  ����� true�� ��� �����ڵ�1 �����ϰ� if-else if�� �������� 
	 * ��, ���ǽ�1�� ����� false���ٸ� ���ǽ�2 ����
	 * ���ǽ�2�� ����� true�� ��� �����ڵ�2 �����ϰ� if-else if�� ��������
	 * �ƴϸ� �� ���� ���ǽ� ����... �̷��� ����
	 * 
	 * ��, else������ ���õǾ����� ��� ���� ���ǵ��� ��δ� false�� �Ǹ� ������ else ���� ����
	 * 
	 */
	
	public void method1() {
		// method1()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		/*
		 * if(num > 0){
		 * 	System.out.println("�����");
		 * }else{
		 *  System.out.println("����� �ƴϴ�")
		 * }
		 * 
		 */
		
		if(num > 0) {
			System.out.println("�����.");
		}else if(num == 0 ) {
			System.out.println("0�̴�.");
		}else {
			System.out.println("������.");
		}
		
		
	} 
	
	public void method2() {
		// method 2
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0�̴�.");
		}else if(num % 2 == 0  ) {
			System.out.println("¦����.");
		}else {
			System.out.println("Ȧ����.");
		}

	}
	
	public void method3() {
		
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
		
		String result = "";	
		
		if(gender == 'M' || gender == 'm') {
			 result = "��";				
		}else if (gender == 'F' || gender == 'f') {
			 result = "��";
		}else{
			System.out.println("�߸��Է��Ͽ����ϴ�.");
	
			return;				
								
		}

		
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.", grade, classNum, num, name, result, score);
		}
	
	public void method4() {
		
		// method4()
	
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			if(age <= 13) {
				System.out.println("���");
			}else if(age <= 19){
				System.out.println("û�ҳ�");
			}else {
				System.out.println("����");
			}

	}
		
	public void method5() {
		// ���ο� ����

		// ����ڿ��� ������ �Է¹޾�
		// 90�� �̻��� A���
		// 90�� �̸� 80�� �̻��� B���
		// 80�� �̸� 70�� �̻��� C���
		// 70�� �̸� 60�� �̻��� D���
		// 60�� �̸��� F���
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		String grade = "F";
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else if (score >= 60) {
			grade = "D";
		}
		
		// "����� ������  �������̰�, ����� ������Դϴ�."
		System.out.println("����� ������ " + score + "�� �̰�, ����� " + grade + "����Դϴ�.");

	}
	
	public void method6() {
		// ���� ������ �� ��޺� �߰����� �̻��� ���
		// ��޿� "+"��� ���ڸ� �߰��ؼ� ����ϰ� ����
		// ex) 95�� �̻� A+		87 => B+	77 => C+	68 => D+
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		String grade = "F";
		
		// ���ǹ�
		/*
		 if(score >= 95) {
			grade = "A+";
		}else if(score>=90) {
			grade = "A";
		}else if(score>=85) {
			grade = "B+";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 75) {
			grade = "C+";
		}else if (score >= 70) {
			grade = "C";
		}else if(score >=65){
			grade = "D+";
		}else if (score >= 60) {
			grade = "D";
		}
		*/
		
		// ��ø if
		
		if(score >= 90) {
			grade = "A";
			if(score>=95) {
				grade += "+";			// grade = grade + "+"
			}
			
		}else if(score >= 80) {
			grade = "B";
			if(score>=85) {
				grade += "+";
			}
		}else if (score >= 70) {
			grade = "C";
			if(score>=75) {
				grade += "+";
			}
		}else if (score >= 60) {
			grade = "D";
			if(score>=65) {
				grade += "+";
		}
		
	}
		
		
		System.out.println("����� ������ " + score + "�� �̰�, ����� " + grade + "����Դϴ�.");
		
	}

	public void method7() {
		// ���ο� ����
		
		// ����ڿ��� �̸��� �Է¹��� ��
		// ����ڰ� �Է��� �̸��� "������"�� ��ġ�ϸ�	==> "�����Դϴ�."
		//					�װ� �ƴ� ���	==> "������ �ƴմϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է�: ");
		String name = sc.nextLine();
		
		/*
		if(name == "������") {
			System.out.println("�����Դϴ�.");			<-- error "�����Դϴ�." ��¾ȵ�!!
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		*/
		
		// ���ڿ����� ����񱳴� == �����ڰ� �ƴ� equals() �޼ҵ带 ���� ���ؾ߸� ��!!!
		
		// ���ڿ� .charAt(�ε���)		=> '����'
		// ���ڿ� .equals(���ڿ�)		=> true / false
		if(name.equals("������")) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		// �⺻�ڷ��� �� (int, char, double, boolean, ....)	=>	==������ ��밡��
		// �����ڷ��� (String)		=> equals() �޼ҵ�
		
		
		
	}
	
}
