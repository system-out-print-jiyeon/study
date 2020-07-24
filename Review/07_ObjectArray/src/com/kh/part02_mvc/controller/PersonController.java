package com.kh.part02_mvc.controller;

import com.kh.part02_mvc.model.vo.Person;

// Controller : View(ȭ��)���� ����ڰ� ��û�� �͵��� ó�����ִ� ��ɿ� Ŭ����
public class PersonController {
	// �켱 3���� ȸ����ü�� �����ϱ� ���� �迭����
	private Person[] people = new Person[3];
	// ���� �߰��� ��� ���� ��Ÿ���� ����
	private int count = 0;
	
	public int insertPerson(String name, int age, int wealth) {
		
		if(count<people.length) {	// �߰� ����
			
			people[count++] = new Person(name, age, wealth);
			
			//System.out.println("���������� �߰��Ǿ����ϴ�!");
			return 1;
		}else {	// �߰� �Ұ�
			//System.out.println("���� �ο��� �� �� ����� �߰��� �Ұ��մϴ�.");
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
		
		Person searchPerson = null;		// �˻��� ��ġ�ϴ� ȸ���� ���� ����, �ּҰ� ���⶧���� �ʱ�ȭ�� null��
		
		for(int i=0; i<count; i++) {
			if(people[i].getName().equals(name)) {
				//System.out.println(people[i].information());
				searchPerson = people[i];	// ���Խ�Ű��
				
			}
		}
		
	return searchPerson;	// �˻��� ȸ����ü �Ǵ� null
		
	}
	
	
	
	
	public double selectAvgWealth() {
		
		double sum = 0;
		
		for(int i=0; i<count; i++) {
			sum += people[i].getWealth();
			
		}
		
		return  sum / count;
		
	}
	
	
	
	
	
	
	
	
}
