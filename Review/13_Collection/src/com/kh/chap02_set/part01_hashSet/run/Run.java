package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요."));
		hs1.add(new String("여러분"));
//		hs1.add(new Integer(1));
//		hs1.add(new Integer(1));
		
		System.out.println(hs1); // 순서유지x, 중복허용x
		
		
		HashSet<Person> hs2 = new HashSet<>();
		
		hs2.add(new Person("공유", 40, 100));
		hs2.add(new Person("홍길동", 26, 40));
		hs2.add(new Person("김말똥", 24, 20));
		hs2.add(new Person("공유", 40, 100));
		//hs2.add("끝");
		
		System.out.println(hs2); // 순서유지x, 중복허용..? (왜? 동일객체로 판단이 안되서!!)
								 // hashCode와 equals 메소드를 오버라이딩 하게 되면 각 필드값들이 모두 일치할 경우 동일객체로 판단되기 때문 => 중복제거
		
		// Set계열 특징 상 index개념없음!! => 즉, 특정 객체 하나만을 뽑을 순 없음!!
		
		// 단, 담겨잇는 객체들에 순차적으로 접근은 가능!!
		
		// 1. for문 사용가능! (단, 향상된 for문으로만 가능!! for each문으로만!!)
		//for(Object p : hs2) {
		for(Person p : hs2) {
			//System.out.println(p);
			//System.out.println(((Person)p).getName());
			System.out.println(p.getName());
		}
		
		// 2. ArrayList에 담은 후 ArrayList 반복문 돌려가면서 접근하는 방법
		//    List <--> Set
		
		//ArrayList list = new ArrayList(); // 빈리스트로 생성 후 
		//list.addAll(hs2); 				// addAll메소드로 통째로 추가하는 방법
		
		ArrayList<Person> list = new ArrayList<>(hs2); // hs2에 담겨있는 객체들 리스트에 애초에 담으면서 생성하는 방법
		
		System.out.println("==========");
		
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i));
			//System.out.println(((Person)list.get(i)).getName());
			System.out.println(list.get(i).getName());
		}
		
		// 3. Iterator 반복자를 이용하는 방법
		System.out.println("========");
		// 1) hs2의 객체들 --> Iterator(반복자) 옮겨 담기			: set계열.iterator()
		Iterator<Person> it = hs2.iterator(); // hs2 => it		
		
		// 2) 반복문을 통해서 쏙쏙 뽑아줌
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		*/
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			//System.out.println(((Person)it.next()).getName());
			System.out.println(it.next().getName());
		}
		
		// HashSet 공간에 객체가 add될 때
		// 기존에 담겨있던 객체들과" hashCode메소드, equals메소드"로 동일객체인지 판단함
		

	}

}





