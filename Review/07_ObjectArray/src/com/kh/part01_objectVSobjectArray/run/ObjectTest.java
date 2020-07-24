package com.kh.part01_objectVSobjectArray.run;

import java.util.Scanner;

import com.kh.part01_objectVSobjectArray.model.vo.Book;

public class ObjectTest {

	public static void main(String[] args) {
		
		Book bk1 = new Book();									// 기본생성자
		Book bk2 = new Book("자바의 정석", "강보람", 10000, "KH");	// 매개변수생성자
		Book bk3 = new Book();
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		// 사용자에게 값 입력받기 (도서 개수 3개로 정해놓는다는 가정하)
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {	// 총3번
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
			
			// 조건처리 일일히 해줘야됨..(100개면 100번 써야됨)
			if(i == 0) {
			bk1 = new Book(title, author, price, publisher);		// 매개변수생성자 이용
			}else if(i == 1) {
			bk2 = new Book(title, author, price, publisher);	
			}else {
			bk3 = new Book(title, author, price, publisher);	
			}												
		
		}
		
		// 2. 전체도서 정보 출력하기
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		// 반복문으로 실행 못함..
		
		
		// 3. 도서 제목 검색하기
		
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		// 문자열.equals(문자열)
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		
		// 반복문안되고 일일히 비교해야됨..
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
