package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileDao {

	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ� (exit�� �Է��ϸ� �����Է� �� ) : ");
			String save = sc.nextLine();
			
			if(save.equals("exit")) {
				break;
			}else {
				sb.append(save);
			}
			
			System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				System.out.println("������ ���ϸ��� �Է��ϼ��� : ");
				String title = sc.nextLine();
				
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(title + ".txt" ,true))){
					
					bw.write(save);
					System.out.println(title + "���Ͽ� ���������� �����Ͽ����ϴ�.");
					
				} catch (IOException e) {
					e.printStackTrace();
				
				}
					
			}else {
				System.out.println("�ٽ� �޴��� ���ư��ϴ�."); break;
			}
				
		}
		
	}

	
	
	
	public void fileOpen() {
		System.out.print("���� �� ���ϸ� : ");
		String openTitle = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(openTitle + ".txt"))){
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void fileEdit() {
		
		System.out.print("������ ���ϸ� : ");
		String editTitle = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(editTitle + ".txt"))){
			
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
			System.out.print("���Ͽ� �߰��� ������ �Է��Ͻÿ� : ");
			String addNote = sc.nextLine();
			if(addNote.toUpperCase().equals("exit")) {
				break;
			}else {
			
				sb.append("\n");
				sb.append(addNote);
			
			}
			
			
			
			
			System.out.print("����� ������ �߰��Ͻðڽ��ϱ�? (y/n) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(editTitle + ".txt", true))){
					
				
		
					bw.write(sb.toString());
				
					
					System.out.println(editTitle + ".txt ������ ������ ����Ǿ����ϴ�."  );
					
					
					
				}
				
			}else {
				break;
			}
			
			
		}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
