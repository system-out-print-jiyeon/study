package com.kh.chap04_assit.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

public class ObjectsDao {

	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("벨벳", "엘지", 1000000);
		arr[1] = new Phone("갤럭시", "삼성", 1300000);
		arr[2] = new Phone("아이폰", "애플", 1500000);
		
		
		// 객체단위로 파일에 출력시 사용되는 스트림 클래스
		// ObjectOutputStream : 객체단위로 출력 가능한 보조 바이트 스트림 
		// FileOutputStream   : 파일과 직접적으로 연결한 후 데이터 출력가능한 기반 바이트 스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phones.dat"))){
			
			/*
			oos.writeObject(arr[0]);
			oos.writeObject(arr[1]);
			oos.writeObject(arr[2]);
			*/
			
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// dat에 출력된것 파악불가.(외계어) 보려면 입력받아와야함

	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// 파일에 기록된 데이터를 객체단위로 입력받아올 때 필요한 스트릠
		// ObjectInputStream : 객체단위로 입력받아올 수 있는 보조 바이트 스트림
		// FileInputStream   : 파일과 직접적으로 연결해서 데이터 입력받을 수 있는 기반 바이트 스트림
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phones.dat"))){
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());	// EOFException
			*/
			
			// 파일의 끝을 만났을 때
			// read() : -1을 반환
			// readLine() : null을 반환
			// readObject() : EOFException 발생 	(EOF : End Of File)
			
			
			while(true) {// 반환되는 것 없기때문에 무한반복 돌림
				System.out.println(ois.readObject());
			}
			
			
		} catch(EOFException e) {
			System.out.println("파일을 다 읽었습니다.");  	// 부모인 IOException보다 위에 기술해야함!!
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
