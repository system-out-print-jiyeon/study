package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FileDao fd = new FileDao();
		
		
		while(true) {
			System.out.println("\n***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("4. ������");
			
			System.out.print("\n��ȣ�� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : fd.fileSave(); break;
			case 2 : fd.fileOpen(); break;
			case 3 : fd.fileEdit();break;
			case 4 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���"); 
			
			}
			
			
			
			
		}
		
		
		
		
		
	}
	
}//
