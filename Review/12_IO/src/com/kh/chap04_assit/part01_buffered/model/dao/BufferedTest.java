package com.kh.chap04_assit.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// 1. ��ݽ�Ʈ�� ���� ����(� "�ܺθ�ü"�� �����͸� �ְ� ���������� �������ִ� ��� ��Ʈ�� ��ü ��������!)
		//FileWriter fw = new FileWriter("c_buffer.dat");
		
		
		// 2. ������Ʈ�� ��ü ���� (�ش� ��ݽ�Ʈ����ü�� ���� ä�� ����) (������ ���� ���)
		//BufferedWriter bw = new BufferedWriter(fw);	// ���ϰ� ������ ��ݽ�Ʈ���� �� �־����!!
		
		
		// ���� ������ �� �ٷ� �ٿ�����!  (finally~~close()���� �Ƚᵵ ��)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"))){
			
			// ������ ��� : write()
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�");
			// ���۶�� ������ ��� �״ٰ� �ѹ��� ��½�Ŵ --> �ӵ���� ����.
			
			bw.newLine(); 	// ��ݽ�Ʈ������ �������� �ʴ� �޼ҵ嵵 ���� (newLine() : ���� �־��ִ� �޼ҵ�)
			bw.write("����������.");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	// ���α׷� <-- ����    (�Է�)
	public void fileRead() {
		
		// BufferedReader ��ü ����
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"))){
			
			/*
			System.out.println(br.readLine()); 	// .readLine() : ���ٴ����� �о����
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			// ������ ���� ������ ���� null�� ��ȯ
			
			
			String value = null;
			
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
	
	
}
