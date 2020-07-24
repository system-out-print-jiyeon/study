package com.kh.part02_mvc.controller;

import com.kh.part02_mvc.model.vo.Person;

// Controller : View(화면)에서 사용자가 요청한 것들을 처리해주는 기능용 클래스
public class PersonController {
	// 우선 3명의 회원객체를 관리하기 위한 배열셋팅
	private Person[] people = new Person[3];
	// 현재 추가된 사람 수를 나타내는 변수
	private int count = 0;
	
	public int insertPerson(String name, int age, int wealth) {
		
		if(count<people.length) {	// 추가 가능
			
			people[count++] = new Person(name, age, wealth);
			
			//System.out.println("성공적으로 추가되었습니다!");
			return 1;
		}else {	// 추가 불가
			//System.out.println("현재 인원이 다 찬 관계로 추가가 불가합니다.");
			return 0;
		}
		
	}
	
	public int getCount() {
		return count;
	}
	
	public Person[] selectList() {
		/*
		for(int i=0; i<count; i++) {
			System.out.println(people[i].information());
		}
		*/
		return people;
	}
	
	
	public Person searchPerson(String name) {
		
		Person searchPerson = null;		// 검색후 일치하는 회원을 담을 변수, 주소값 담기기때문에 초기화는 null로
		
		for(int i=0; i<count; i++) {
			if(people[i].getName().equals(name)) {
				//System.out.println(people[i].information());
				searchPerson = people[i];	// 대입시키기
				
			}
		}
		
	return searchPerson;	// 검색된 회원객체 또는 null
		
	}
	
	
	
	
	public double selectAvgWealth() {
		
		double sum = 0;
		
		for(int i=0; i<count; i++) {
			sum += people[i].getWealth();
			
		}
		
		return  sum / count;
		
	}
	
	
	
	
	
	
	
	
}
