package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest {

	// ���α׷� (�ڹ� �ڵ�) --> �ܺθ�ü(����) (��� : ���α׷� ���� �����͸� ���Ϸ� �������� ��, ���Ͽ� �����ϰڴ�.)
	public void fileSave() {
		
		// FileOutputStream : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		FileOutputStream fos = null;
		
		
		try {
			// 1. FileOutputStream ��ü ����  : �ش� ���ϰ��� ������ΰ� �������
			 fos = new FileOutputStream("a_byte.txt" /*, true*/);	//�ش�������  ������ �ڵ����� ������� �� ����, ������ �ٷ� ����
			 													// , true ����ϸ� �����Ҷ����� ���̾ ��µ� , �ȱ���ϸ� ��� �������
			// fos�� �ٷ� �������
			// true ���ۼ��� 	--> ������ �ش����� ���� ��� ������� (�⺻�� false)
			// true �ۼ��� 	--> ������ �ش����� ���� ��� ���̾ �ۼ��� 
			 
			 
			// 2. ��η� ������ ��� : Write() �޼ҵ� ���
			//    ��, 1����Ʈ �����ιۿ� ��������� �Ұ�
			fos.write(97);	// a	// ���ڰ� �״�� ����Ǵ°� �ƴ� �ش� ������ �ƽ�Ű�ڵ�(0~127)������ ���� �����
			fos.write('b');
			// ���⼭ IOException�߻��ϸ� �ٷ� catch������ �Ѿ, ���� ���� ����ȵ�
			
			//fos.write('��');	// �ѱ��� 2byte¥���̱� ������ 1byte��η� ���޽� ������ ��ϵ�!!
			//fos.write('��');
			
			// ����Ʈ �迭�� ��� ����
			byte[] bArr = {99, 100, 101};	// cde
			fos.write(bArr);
			
			// for.write(�迭, �����ε���, ����) => �迭�� �����ε����κ��� �ش� ������ŭ ���
			fos.write(bArr, 1, 2);  // de
			
		
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// � ���ܰ� �߻��ϵ簣�� �ݵ�� ������ ������ ����ص�
			
			// 3. ��Ʈ�� �� �̿������� �ݳ��ϱ� (close �޼ҵ�) 		��ιݳ� �ݵ�� �������ٰ�!!
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 	
			
		}
		
	}
	
	
	
	// ���α׷� (�ڹ� �ڵ�) <-- ����     (�Է�: ���Ͽ� ��ϵ� ������ ��������)
	public void fileread() {
		
		// FileInputSteam : ���Ϸκ��� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ��
		
		// 1. FileInputStream ��ü ���� : �ش� ���ϰ��� ������ΰ� �������
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.txt");
			
			// 2. ���Ϸκ��� �����͸� �Է¹ް��� �� �� read() �޼ҵ� ���
			/*
			System.out.println(fis.read());  // ���� �ϳ��� �о��
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			*/
			// ��� �о���ٺ��� ������ ���� ������ ���� -1�� ��ȯ�ϴ� ���� �ľ�!!
			
			/* ���ǰ˻�� �о�� ���� ����ؾ߸� �ϴµ� ���������� ����ϰ��ִ� ������ �ٽ� �о�� ���� ��� (�������� �ǳʶٱ��)
			while(fis.read() != -1) {	// �о�� ���� -1�� �ƴ� ��� ����� �ǰԲ�
				System.out.println(fis.read());
			}
			*/
			
			// fis.read()�� �ݺ����� ����ɶ����� �� �ѹ��� ����Ǿ����!!
			
			
			// �ذ��� 1. ���ѹݺ����� �����鼭 ���ǰ˻�
			/*
			while(true) {
				int value = fis.read();		// ���ڰ����� �����⶧���� int
				
				if(value != -1) {
					System.out.print(value + " ");
				}else {
					break;
				}
				
			}
			*/
			
			
			// (�� ������ ������)
			// �ذ��� 2. 
			int value = 0; // �Ź� �Է¹޾ƿ� �����͸� ����� ���� �����α�
			while((value = fis.read()) != -1) {
				System.out.print((char)value + " ");	// char�� ��������ȯ�ϸ� ���ڷ� ���
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			// 3. �� �� �ڿ� �ݳ��ϱ�
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
