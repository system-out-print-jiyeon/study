package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	
	/*
	 * * RuntimeException
	 * - ���α׷� ����� �߻��Ǵ� ���ܵ� (���������� �������� ����!!) --> ����ó���� �ʼ��� �ƴ�
	 * 
	 * * RuntimeException�� �ļյ�
	 * - NullpointerException  :���۷��� ������ null�� ���¿��� �޼ҵ带 ȣ���ϴ� ���
	 * - ArrayIndexOutOfBoundsException : �迭�� ���ٿ� �������� �ε��� �� �������� ���
	 * - ClassCastException : ����� �� ���� ����ȯ�� ����Ǵ� ���
	 * - ArithmeticException : ������ ����� 0���� ������ ���
	 * - NegativeArraySizeException : �迭�� ũ�⸦ ������ �����ϴ� ���
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		// ArithmaticException : ������ ����� 0���� ������ ���
		
		// ����ڿ��� �ΰ��� �������� �Է¹��� �� ������ ������ ��� ���
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 (0 �Է�����������): ");
		int num2 = sc.nextInt();
		
		/*
		// ���ʿ� ������ü�� �߻� �ȵǰԲ� ���ǰ˻� => ����ó�� �ƴ�!!
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2 ;
		}
		
		System.out.println("��� : " + result);
		
		System.out.println("���α׷��� �����մϴ�.");
		*/
		
		
		// ����ó�� : ���ܰ� �߻����� �� ó���ϴ� ������ �̸� ����صδ� ��
		/*
		 * * try catch ���
		 * 
		 * try{
		 * 		���ܰ� �߻��ɹ��� ����;
		 * 		���ܰ� �߻��ɹ��� ����;  			... ������ ����
		 * 
		 * }catch(�߻��� ����Ŭ������ ������){
		 * 		�ش� ���ܰ� �߻��Ǵ°�� ó���� ����;		
		 * 
		 * }catch(�߻��� ����Ŭ������ ������){
		 * 		�ش� ���ܰ� �߻��Ǵ°�� ó���� ����;		
		 * 									... catch�� ����catch ����
		 * }
		 *  
		 */
		
		int result = 0;
		
		try {
		 result = num1 / num2;
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("��� : " + result);
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	
	
	public void method2() {
		
		// NegativeArraySizeException : �迭ũ�� ������ ������ �������� ���
		
		System.out.print("�迭�� ũ�� �Է� (����� �Է�) : ");
		
		
		
		/*
		// ���ʿ� ������ü�� �߻� �ȵǰԲ� ����ó�� ����
		if(size>0) {
			int[] arr = new int[size];
			System.out.println("0�� �ε��� �� : " + arr[0]);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		*/
		
		
		try {
			
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("0�� �ε��� �� : " + arr[0]);
			
		}
		// 1. ����catch
		/*
		catch(NegativeArraySizeException n) {
			System.out.println("����� �Է��ϼ���.");
			
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("�������� �ε����� �����߽��ϴ�.");
		}catch(InputMismatchException i ) {
			System.out.println("�������� �Է����ּ���");
		}
		*/
		
		
		// 2. �θ�Ŭ������ �� ���� �� �ִ� but ������� �߻����� ���� �ణ �η繶��
		catch(RuntimeException e) {
			System.out.println("���ܹ߻��߾�..");
		}
		
		
		// 3. �ڽ�Ŭ������ �θ�Ŭ���� ȥ���ؼ� ��� �� ��쿡�� �θ�Ŭ������ �ڿ� ����Ǿ�� ��
		/*
		catch(NegativeArraySizeException n) {
			System.out.println("����� �Է��ϼ���.");
		}catch(RuntimeException e) {
			System.out.println("���ܹ߻��߾�..");
		}
		*/
		
		
		
		System.out.println("���α׷��� �����մϴ�.");
		
		
	}
	
	
	// UncheckedException�� ����ó���� �ص� �ǰ� ���ص� ��
	// ���������� ��Ȳ�� �־ if������ ����ó�� �����ϴٰ� �ϸ�
	// ���ʿ� ���ܰ� �߻��ϱ� ���� ���ǹ����� �ڵ鸵���ִ°� �������!!
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
