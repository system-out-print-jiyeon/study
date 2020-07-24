package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		// 개체생성을 통해 Heap영역에 공간을 먼저 확보해둬야됨(할당)
		Person p = new Person();
		/*
		p.id = "user01";
		p.pwd = "pass01";
		*/					// --> private으로 은닉해놔서 안됨
		
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("지연이");
		p.setAge(24);
		p.setGender('F');
		p.setPhone("010-0209-0209");
		p.setEmail("jy971114@naver.com");
		
		// String id = p.getId();
		// System.out.println(id);
		
		/*
		System.out.println("id : " + p.getId() + ", pwd : " + p.getPwd() 
						 + ", name : " + p.getName() + ", age : " + p.getAge() 
						 + ", gender : " + p.getGender() + ", phone : " + p.getPhone()
						 + ", email : " + p.getEmail());
		*/
		
		System.out.println(p.information());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 이름 : ");
		String name = sc.nextLine();
		
		p.setName(name);		// 변경요청
		
		System.out.println(p.information());
		
	
		
	}

}
