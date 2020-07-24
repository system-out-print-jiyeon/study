package com.kh.part02_mvc.view;

import java.util.Scanner;

import com.kh.part02_mvc.controller.PersonController;
import com.kh.part02_mvc.model.vo.Person;

// View  : 클라이언트(사용자)의 시각적인 요소 담당(화면)
//		       입력 및 출력
//		       여기서 보여지는 화면(메뉴)을 통해서 요청이라는 것을 함
//		       요청을 한다는건 Controller클래스의 메소드를 호출한다는 것을 의미
public class PersonView {
	// 사용자에게 입력받기 위한 Scanner객체 생성
	Scanner sc = new Scanner(System.in);
	// 사용자의 요청을 처리할 Controller객체 생성
	private PersonController pc = new PersonController();
	
	/**
	 * 프로그램 실행과 동시에 사용자에게 보여지는 메인화면(메뉴)
	 */
	public void mainMenu() {
		
		// 메인메뉴를 무한반복적으로 띄워줌(프로그램이 계속 실행되게끔)
		while(true) {
			
			System.out.println("\n===== 메뉴 =====");
			System.out.println("1. 신규 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 이름 검색");
			System.out.println("4. 회원 평균 재산 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : selectList();  break;
			case 3 : searchPerson(); break;
			case 4 : selectAvgWealth(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못입력하였습니다. 다시입력해주세요");
				
				
			}
		}
		
	}
	
	/**
	 * 서브화면 1. 신규회원을 추가하는 화면
	 */
	public void insertPerson() {
		
		System.out.println("\n== 신규 회원 추가 ==");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("재산 : ");
		int wealth = sc.nextInt();
		
		// "회원 추가해줘!" 요청!! (Controller 메소드 호출)
		int result = pc.insertPerson(name, age, wealth);
		
		if(result == 1) {
			System.out.println("성공적으로 추가되었습니다!");
		}else {
			System.out.println("현재 인원이 다 찬 관계로 추가가 불가합니다.");
		}
			
	}
	
	
	/**
	 * 서브화면2. 회원 전체 조회 화면
	 */
	public void selectList() {
		
		System.out.println("\n== 전체 회원 조회 ==");
		
		// 현재 추가된 사람수 요청!! (Controller 메소드 호출)
		int count = pc.getCount();
		
		if(count == 0) {	// 현재 추가된 회원이 없다!
			
			System.out.println("현재 추가된 회원이 없습니다.");
			
		}else {	// 한 명이라도 있다!!
			
			// 전체 회원 조회요청!! (Controller 메소드 호출)
			Person[] p = pc.selectList();
			for(int i=0; i<count; i++) {
				System.out.println(p[i].information());
			}
		}
		
	}
	
	
	/**
	 * 서브화면 3. 회원 이름으로 검색하는 화면
	 */
	
	public void searchPerson() {
		
		System.out.println("\n== 회원 정보 검색 ==");
		
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		
		// 검색요청하기!! (Controller 메소드 호출)
		Person searchPerson = pc.searchPerson(name);
		
		if(searchPerson == null) {	// 검색된 사람이 없음
			System.out.println("검색된 회원이 없습니다.");
		}else {	// 검색됨!
			System.out.println(searchPerson.information());
		}	
		
	}
	
	
	
	/**
	 * 서브화면 4. 회원들의 평균 재산 조회 화면
	 */
	public void selectAvgWealth() {
		
		System.out.println("\n== 회원 평균 재산 조회 ==");
		
		
		
		if(pc.getCount() == 0) {	
			
			System.out.println("현재 추가된 회원이 없습니다.");
			
		}else {
		double average = pc.selectAvgWealth();
		
		//System.out.println(average);
		System.out.printf("%.2f원\n", average);
		}
		
	}
	
	
	
	
	
	
	
}//
