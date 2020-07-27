package com.kh.part01_objectVSobjectArray.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.part01_objectVSobjectArray.model.vo.Book;

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		/*
		Book[] bk = new Book[3];
		
		bk[0] = new Book();
		bk[1] = new Book("자바의 정석", "강보람", 10000, "KH");
		bk[2] = new Book();
		*/
		
		ArrayList<Book> list = new ArrayList<>(3);
		
		list.add(new Book());
		list.add(new Book("자바의 정석", "강보람", 10000, "KH"));
		list.add(new Book());
		
		
		
		
		/*
		System.out.println(bk[0].information());
		System.out.println(bk[1].information());
		System.out.println(bk[2].information());
		*/
		// = 같은 구문 반복문으로 줄이기
		/*
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		*/
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		
		
		
		list.clear();
		
		// 사용자에게 값 입력받기
		
		Scanner sc = new Scanner(System.in);
		
		
		// 1. 전체 도서 정보 입력받기
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			// 조건처리 필요없이 해당 인덱스에 도서 객체 생성되도록
			//bk[i] = new Book(title, author, price, publisher);
			list.add(new Book(title, author, price, publisher));
				
		}
		
		// 2. 전체 도서 정보 출력하기
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		
		
		// 3. 도서 제목 검색하기
		
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(search)) {
				System.out.println(list.get(i).information());
			}
		}
		
		
		
		
	} 
	
}
