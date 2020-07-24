package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		
		
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 (남/여): ");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
		
		while(true) {
			System.out.println("\n==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 선택 : \n");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: System.out.println(lm.myInfo()); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			
			}	
		}	
	}
	
	
	
	
	
	/**
	 * 2. 도서 전체 조회
	 */
	
	public void selectAll() {
		Book[] bList = lm.selectAll();
		System.out.println("\n==== 도서 전체 조회 ====");
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "번째 도서 : " + bList[i]);
		}	
	}
	
	
	/**
	 * 3. 도서 검색
	 */
	
	public void searchBook() {
		System.out.println("\n==== 도서 검색 ====");
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		
		
		/*
		for(Book b : searchList) {
			System.out.println(b);
		}
		*/
		
		for(int i=0; i<searchList.length; i++) {
			
		if(searchList[i] != null) {
			System.out.println(searchList[i]);
		}
		
		}
	}
	
	
	/**
	 * 4. 도서 대여하기
	 */
	
	public void rentBook() {
		System.out.println("==== 도서 대여하기 ====");
		
		Book[] bList = lm.selectAll();
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "번째 도서 : " + bList[i]);
		}	
		
		System.out.println("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		int result = lm.rentBook(num);
		
		switch(result) {
		case 0 : System.out.println("성공적으로 대여되었습니다."); break;
		case 1 : System.out.println("나이제한으로 대여 불가능입니다."); break;
		case 2 : System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. \n마이페이지를 확인하세요"); break;
		}
			
	}
	

}//
