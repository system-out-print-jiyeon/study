package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class Run {

	public static void main(String[] args) {

		// ���� ��������� �Ϳ� ���� ���� �׽�Ʈ
		// java.io ��Ű���� �ִ� File Ŭ���� ������ ���ϸ� ����
		
		
		
		
		try {
			
			// 1. ������� ���� ���� ���� ����  --> �ش� �� ������Ʈ ���� ����
			File f1 = new File("test.txt");
			f1.createNewFile();	// �޼ҵ� �����ؾ߸� ���� ������ �������!!  --> IOException �߻��� ���� ����
		
			
			// 2. �����ϴ� ���� ����̺곪 ������ ���� ����
			File f2 = new File("D:\\test.txt");
			//File f3 = new File("C:\\java_workspace\\test.txt");
			f2.createNewFile();
			//f3.createNewFile();
			
	
			// 3. ���� ����� ���� ����
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			//temp��� ���� ���⶧���� �Ұ�
			
			// ���� ���� ���� ��
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir();
			
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			// ������ �ִ� �����̳� ������ ���� ��� ������ �ȸ������
			
			System.out.println(f1.exists());
			System.out.println(f2.exists());
			System.out.println(tempFolder.exists());
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			// ������ ��� ���� ���ϸ� �� ������Ʈ �ȿ� ���������.
			File folder = new File("parent");
			folder.mkdir();
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("������ : " + folder.getName());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("�������� : " + file.getParent());
			System.out.println("������ : " + file.getAbsolutePath());  //�ش������� ����ִ� �������� ���
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();	// �������� �����ؼ� ���
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	
	/*
	 * ���α׷����� �����͸� �ܺθ�ü�� ����� �Ѵٰų� / �Ǵ� �ܺθ�ü�κ��� �Է¹޾ƿ� ��
	 * �ݵ�� �� �ܺθ�ü���� �������� ��θ� �����ߵ�!!  => �װ� �ٷ� ��Ʈ��
	 * 
	 * * ��Ʈ���� Ư¡
	 * - �ܹ��� : �Է��̸� �Է� / ����̸� ��¸� ����!! (��, �Է°� ����� ���ôٹ������� �ϰ������ ������ ��Ʈ���� ���� �����ߵ�!)
	 * - ���Լ��� (FIFO) : ���� ���� ���� ���� ����!! (�ð� ����) 
	 * 
	 * 
	 * 
	 * * �ڹݿ��� �����ϴ� ��Ʈ�� Ŭ����
	 * > ����� ������ (1byte / 2byte)
	 * - ����Ʈ(byte)��Ʈ�� : 1byte¥���� �Դٰ����� �� ���� ������ ������ (���� ���)
	 * 				�Է� (InputStream) / ��� (OutputStream)
	 * 
	 * - ����(char)��Ʈ�� : 2byte¥�� �Դٰ����� �� ���� ������ ������ (���� ���)
	 * 			     �Է� (Reader) / ��� (Writer)
	 * 
	 * byte == 1byte
	 * char == 2byte
	 * 
	 * 
	 * 
	 * 
	 * > �ܺθ�ü�� ���� ���� ����
	 * - ���(�⺻) ��Ʈ�� : �ܺθ�ü�� ���������� �����ϴ� ���
	 * 					������ �ʼ��� �־����
	 * 
	 * - ���� ��Ʈ�� : ���״�� ���� ���Ҹ��� �����ϴ� ���, ��ݽ�Ʈ���� �����Ҷ� ����
	 * 				�ܵ����δ� ��� �Ұ� !! (�ݵ�� �ܺθ�ü�� ����Ǿ��ִ� ��� ��Ʈ�� �ʿ�!!)
	 *  
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
















