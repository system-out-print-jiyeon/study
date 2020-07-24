package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * * �� ������ (���� ������)
	 * - �� ������ �����ϴ� ������
	 * 
	 * ���� && ���� : �� ���� ��� true�� ��� ���� ����� true
	 * ���� || ���� : ����, ������ �� �߿� �ϳ��ϵ� true�� ��� �������� true
	 *
	 */
	
	public void method1() {
		// ����ڰ� �Է��� �������� 1�̻� 100������ ������ Ȯ���ϱ� (1���� 100������ ������)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		// ����ڰ� �Է��� ���� 1~100 ������ ��?
		//					1�̻� 100�����ΰ���?
		
		// ���� 1 �̻��̰�, 100�����ΰ���?
		//System.out.println(1 <= num <= 100); 	// �� ���� �Է� �ȵ�
		System.out.println(num >= 1 && num <= 100); // &&�� ����
		
		// &&(And) �ǹ� : ~�ϰ�, �׸���, ~�ϸ鼭, ~�̰�
		//		   �� ���� ������ ��� true���߸� &&������ ������� true
		// 		   �� �߿� �ϳ��� false�� �ȴٸ� &&������ ������� false
	
		
	}
	
	public void method2() {
		
		// ����ڰ� �Է��� �����ڰ��� �빮������ Ȯ���ϱ� (A~Z)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// ����ڰ� �Է��� �����ڰ��� 'A' ~ 'Z' 	(65~90������ ���ڷ� ���޾� �����Ǿ�����)
		//System.out.println('A' <= ch <= 'Z');
		System.out.println( ch >= 'A' && ch <= 'Z');
		// �ƽ�Ű�ڵ� ǥ  (0~127 : ������, ����, Ư������)
		// �����ڵ� ǥ (0~65535 : �ѱ�����)

	}
	
	public void method3() {
		
		// �����Ͻðڽ��ϱ�? (y�Ǵ� Y�� �Է����ּ���)
		
		Scanner sc = new Scanner(System.in);
		
		// ����ڰ� �Է��� ���� y�Ǵ� Y���� Ȯ���ϱ�
		System.out.println("�����Ͻ÷��� y�Ǵ� Y�� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y' || ch == 'Y');
		
		// || (Or) �ǹ� : ~�̰ų�, ~�Ǵ�
		//				�� ���� ���� �߿� �ϳ��� true�� �ִٸ� || ������ ������� true
		//				�� ���� ���� ��� false�� ��� || ������ ������� false
		
		System.out.println("����ڰ� �Է��� ���� y�Ǵ� Y�Դϱ� : " + result);
		
		
	}
	
	/*
	 * && : �� ���� ������ ��� true���� ������� true�̴�. (And)
	 * 
	 * true && true		=> true
	 * true && false	=> false 
	 * false && true	=> false
	 * false && false	=> false
	 * 
	 * --> && �����ڸ� �������� ���� ����� false���� ���´ٸ� ���� ����(����)�� ���� ������� ����!!
	 * 
	 * 
	 * || : �� ���� ������ �ϳ��� true�̸� ������� true�̴�.(OR)
	 * 
	 * true || true		=> true
	 * true || false	=> true
	 * false || true	=> true
	 * false || false	=> false
	 * 
	 * --> || �����ڸ� �������� ���� ����� true���� ���´ٸ� ���� ����(����)�� ���� ������� ����!!
	 */
	
	
	public void method4() {
		
		// boolean result = true || true;
		
		int num = 10;
		System.out.println("&&���� ���� num�� : " + num);
		
		//num��  5���� �۰� 0���� Ů�ϱ�
		boolean result1 = num < 5 && ++num > 0;	// false && true
		
		System.out.println("result1 : " + result1);
		System.out.println("&&���� ���� num�� : " + num);
		
		boolean result2 = num < 20 || ++num> 0 ;		// <-- ++�� ���� �ƴ��� �ȵƴ��� Ȯ���� ���� ��
		
		System.out.println(" || ���� ���� num�� : " + num);
		
		
		
		
		
	}
	
	
}
