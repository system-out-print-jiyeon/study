package com.kh.chap05_constructor.run;

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
	
		
		// 1. 기본생성자로 객체 생성
		User u1 = new User();
		
		System.out.println(u1.information());	// JVM의 초기값들 담겨있음
		
		
		//		setter를 통해 값 초기화
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("홍길동");
		
		System.out.println(u1.information());
		
		// 생성과 동시에 초기화할 수 없을까?
		// 2. 매개변수 3개짜리 생성자를 통해 객체 생성
		User u2 = new User("user02", "pass02", "김말똥");
		System.out.println(u2.information());
		
		// setter메소드 있어야하는 이유 : 하나의 값만 따로 변경가능
		u2.setAge(30);
		System.out.println(u2.information());
		
		
		// 3. 매개변수 5개짜리 생성자를 통해 객체 생성
		User u3 = new User("user03", "pass03", "홍길녀", 20, '여');
		System.out.println(u3.information());
		
		
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		User u4 = new User(userId, userPwd, userName, age, gender);
		System.out.println(u4.information());
		*/
		
		
		
		// 기본생성자 방법
		
		User u4 = new User();
		
		System.out.print("아이디 : ");
		u4.setUserId(sc.nextLine());
		
		System.out.print("비밀번호 : ");
		u4.setUserPwd(sc.nextLine());
		
		System.out.print("이름 : ");
		u4.setUserName(sc.nextLine());
		
		System.out.print("나이 또는 성별을 추가로 입력하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch=='y' || ch=='Y') {
			
			System.out.print("나이 : ");
			u4.setAge(sc.nextInt());
			sc.nextLine();
			
			System.out.print("성별(남/여) : ");
			u4.setGender(sc.nextLine().charAt(0));
		
		}
		System.out.println(u4.information());
		
	}

	
	
}
