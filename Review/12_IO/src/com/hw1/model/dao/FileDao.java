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
			
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오 (exit을 입력하면 내용입력 끝 ) : ");
			String save = sc.nextLine();
			
			if(save.equals("exit")) {
				break;
			}else {
				sb.append(save);
			}
			
			System.out.print("저장하시겠습니까? (y/n) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				System.out.println("저장할 파일명을 입력하세요 : ");
				String title = sc.nextLine();
				
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(title + ".txt" ,true))){
					
					bw.write(save);
					System.out.println(title + "파일에 성공적으로 저장하였습니다.");
					
				} catch (IOException e) {
					e.printStackTrace();
				
				}
					
			}else {
				System.out.println("다시 메뉴로 돌아갑니다."); break;
			}
				
		}
		
	}

	
	
	
	public void fileOpen() {
		System.out.print("열기 할 파일명 : ");
		String openTitle = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(openTitle + ".txt"))){
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void fileEdit() {
		
		System.out.print("수정할 파일명 : ");
		String editTitle = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(editTitle + ".txt"))){
			
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			String addNote = sc.nextLine();
			if(addNote.toUpperCase().equals("exit")) {
				break;
			}else {
			
				sb.append("\n");
				sb.append(addNote);
			
			}
			
			
			
			
			System.out.print("변경된 내용을 추가하시겠습니까? (y/n) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(editTitle + ".txt", true))){
					
				
		
					bw.write(sb.toString());
				
					
					System.out.println(editTitle + ".txt 파일의 내용이 변경되었습니다."  );
					
					
					
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
