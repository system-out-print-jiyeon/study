package com.kh.chap02_set.part02_treeSet.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part02_treeSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		TreeSet ts1 = new TreeSet();
		
		ts1.add(new String("하하하"));
		ts1.add(new String("나나나"));
		ts1.add(new String("다다다"));
		ts1.add(new String("가가가"));
		ts1.add(new String("핳핳핳"));
		ts1.add(new String("나나나"));
		
		
		System.out.println(ts1); // 순서유지x, 중복허용x
		
		
		TreeSet<Person> ts2 = new TreeSet<>();
		
		ts2.add(new Person("공유", 40, 100));
		ts2.add(new Person("홍길동", 24, 40));
		ts2.add(new Person("김말똥", 26, 20));
		ts2.add(new Person("공유", 20, 60));
		
		System.out.println(ts2);
		
		// TreeSet은 내부적으로 객체들이 추가될때 compareTo메소드로 비교하면서 추가 됨!!
		// compareTo에 기술되어있는 정렬기준이 똑같을 경우 다른 필드값들이 달라도 동일객체로 판단해버림!! (중복값허용x)
		
		
		
		// 순차적으로 접근은 가능!! (ts2)
		// 1. for each문
		for(Person p : ts2) {
			System.out.println(p);
		}
		
		System.out.println("=======");
		
		// 2. ArrayList에 담은후 반복문
		ArrayList<Person> list = new ArrayList<>(ts2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=======");
		// 3. Iterator 반복자에 담은후 반복문
		Iterator<Person> it = ts2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
