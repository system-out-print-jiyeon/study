package com.kh.chap04_assit.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// 1. 기반스트림 먼저 생성(어떤 "외부매체"와 데이터를 주고 받을것인지 선택해주는 기반 스트림 객체 먼저생성!)
		//FileWriter fw = new FileWriter("c_buffer.dat");
		
		
		// 2. 보조스트림 객체 생성 (해당 기반스트림객체를 담은 채로 생성) (부족한 성능 향상)
		//BufferedWriter bw = new BufferedWriter(fw);	// 파일과 접근한 기반스트림이 꼭 있어야함!!
		
		
		// 위의 과정을 한 줄로 줄여보자!  (finally~~close()구문 안써도 됨)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"))){
			
			// 데이터 출력 : write()
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			// 버퍼라는 공간에 계속 쌓다가 한번에 출력시킴 --> 속도향상에 좋다.
			
			bw.newLine(); 	// 기반스트림에서 제공하지 않는 메소드도 제공 (newLine() : 개행 넣어주는 메소드)
			bw.write("저리가세요.");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	// 프로그램 <-- 파일    (입력)
	public void fileRead() {
		
		// BufferedReader 객체 생성
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"))){
			
			/*
			System.out.println(br.readLine()); 	// .readLine() : 한줄단위로 읽어들임
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			// 파일의 끝을 만나는 순간 null을 반환
			
			
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
