package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	// CheckedException : �ݵ�� ����ó���� ������ϴ� ���ܵ�
	// 					  ���� �Ұ��� ��Ȳ�� �־ ���ܰ� �߻��ϱ� ������ �̸� ���ܰ� "�߻�"���� ���� ����ؼ� "ó��"�ϴ� ���� ����ص־ߵ�!!
	
	// ���� �ܺ� �Ű�ü�� � ������� �߻��� �� Exception �߻�!!
	
	public void method1 () {
		/*
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//method2();
		
	}
	
	public void method2() throws IOException {
		
		// Scanner sc = new Scanner(System.in);
		
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü(��, ���ڿ��θ� ����)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("�ƹ� ���ڿ� �Է����ּ��� : ");
		
		
		// ����ó����� 1.
		/*
		try {
			String str = br.readLine() ;
			System.out.println(str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		*/
		
		// ����ó����� 2. throws - ���� ���� ���⼭ ����ó�������ʰ� �ش� �� �޼ҵ带 ȣ���� ������ ���ѱ�ڴ�! (����)
		String str = br.readLine() ;
		System.out.println(str);
		
	}
		
	//						|	 	  ���ܹ߻����� 	    	|		   ����ó��
	//============================================================================================================= 
	// RuntimeException		|    ��Ÿ�� ���� (���α׷� ����) 	 |	���� (������ �ɹ���)		--> UncheckedException
	// RuntimeException �� 	|		������ ���� (������)       |		�ʼ�				--> CheckedException
	
	
	
	
	
	
	
	
	
	
	
	
	
}
