package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {

	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		// 메뉴 무한반복 반복문 사용
		while(true) {
			
			// 메뉴출력
			System.out.println("\n====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			
			}
					
		}
		
	}
	
	/**
	 * 서브화면 1. 신규회원 등록하는 화면
	 */
	public void insertMember() {
		System.out.println("== 신규 회원 등록 ==");
		
		int count = mc.getMemberCount();
		
		if(count>MemberController.SIZE) {
			return;
		}
		
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		
		if(m != null) {
			System.out.println("이미 사용중인 아이디입니다.");
		
		}else {
			System.out.print("비밀번호 : ");
			String pwd = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("성별 : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			
		    m = new Member(userId, pwd, name, age, gender, email);
			mc.insertMember(m);
		    
			System.out.println("회원등록이 완료되었습니다");
		    
		}
		
	}
	
	
	/**
	 * 서브화면 2. 회원 정보 검색하는 화면
	 */
	
	public void searchMember() {
		
		// 메뉴출력 >> 반복실행
		while(true) {
		System.out.println("\n== 회원 정보 검색 ==");
		
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 이전 메뉴로");
		
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		if(menu == 9) {
			return;
		}
		
		System.out.print("검색 내용 : ");
		String search = sc.nextLine();
		Member searchMember = mc.searchMember(menu, search);
		
		
		if(searchMember == null) {
			System.out.println("검색된 결과가 없습니다.");
		}else {
			System.out.println(searchMember.information());
		}
		
		}
		
	}
	
	
	/**
	 * 서브화면 3. 회원 정보 수정
	 */
	
	public void updateMember(){
		
		while(true) {
			System.out.println("\n== 회원 정보 수정 ==");
			
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				return;
			}
			System.out.print("변경할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			Member m = mc.checkId(userId);
			
			if(m == null) {
				System.out.println("변경할 회원이 존재하지 않습니다."); return;
			}else {
				System.out.println(m.information());
			}
			
			System.out.print("변경할 내용 : ");
			String update = sc.nextLine();
			
			mc.updateMember(m, menu, update);
			
			System.out.println("회원정보가 변경되었습니다.");
			
		}
		
	}
	
	/**
	 * 서브화면 4. 회원 정보 삭제하는 화면
	 */
	
	public void deleteMember() {
		System.out.println("\n== 회원 정보 삭제 ==");
		
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		if(m == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else {
			System.out.println(m.information());
		}
		
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			mc.deleteMember(userId);
			System.out.println("회원의 정보가 삭제되었습니다.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//
