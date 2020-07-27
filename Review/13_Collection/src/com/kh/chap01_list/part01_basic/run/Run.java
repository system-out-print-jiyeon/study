package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * * 컬렉션이란 뭘까?
		 * - 컬렉션이란 자료구조가 내장되어있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"
		 * 
		 * * 자료구조?
		 * - 방대한 데이터를 효율적(구조적)으로 다룰 때 필요한 개념이 바로 자료구조
		 * 
		 * * 프레임워크?
		 * - 자바에서 이미 제공되고있는 틀이 있기 때문에 편리하게 갖다쓰라는 개념
		 * 
		 * 
		 * * 배열의 특징 (단점)
		 * 1. 배열을 사용하기 위해서 반드시 크기지정을 해야만 했음!!
		 * 	   => 한 번 지정된 크기 변경 불가!!
		 * 	   => 아싸리 배열의 크기를 너무 크게 잡아도 메모리 낭비가 심하다!!
		 * 	 
		 * 2. 배열의 중간 위치에 새로운 데이터를 추가한다거나 삭제하는 경우에 있어서
		 * 	   직접 코드로써 값을 땡겨주는 작업을 일일히 알고리즘으로 구현을 해야만 함 (반복문같은걸로) => 복잡하다..ㅠㅠ
		 * 
		 *  3. 한 타입의 데이터만 저장가능하다.( int[] 같은 경우 int값만, double[] double값만, Person[] Person객체만)
		 * 
		 * 
		 * 
		 * * 이런 배열의 모든 단점을 보완한 개념이 바로 컬렉션!!! 컬렉션의 장점
		 * 1. 크기를 지정해줄 필요도 없고 만일 크기지정을 한다고 해도 담기는 값에 있어서 알아서 크기가 증가될것이기 때문에 크기의 제약이 없다 !!
		 * 
		 * 2. 중간에 값을 추가한다거나 삭제하는 경우에 값을 땡겨주는 작업을 직접 구현할 필요가 없음
		 * 	   이미 메소드로 정의해서 제공해주고 있음 (즉, 해당 메소드 호출시 내부적으로 값 땡기는 과정 알아서 해줌)
		 * 
		 * 3. 여러 타입의 데이터를 저장할 수 있음 (단, 객체만 저장 가능)
		 * 
		 * 
		 * * 방대한 데이터들을 관리할 때 삭제나 추가, 수정, 정렬 등등의 기능들을 많이 할 것 같은 경우 *컬렉션* 을 사용하는게 용이
		 * 	  단지 보관만 한 채로 값을 조회만 해줄 경우 *배열* 을 사용하는게 용이	
		 * 
		 * 
		 * *				|		List		|     	set		|		Map			
		 * =====================================================================================
		 *   담을 수 있는 데이터	|        저장하고자 하는 데이터 (value)    | Key값 + 저장하고자 하는 데이터 (value)
		 * --------------------------------------------------------------------------------------
		 *  	 순서 유지		|	O (index 개념)	|	    X		|		X ( Key값이 곧 index의 역할수행)
		 * --------------------------------------------------------------------------------------
		 * 		 중복 허용		|      	 O 			|       X		| 		X ( Key값이 동일하게 들어가면 중복허용불가)
		 *              (똑같은 데이터여도 순서유지하기때문에
		 *               새 인덱스에 차곡차곡 잘 담김)
		 * 
		 * 
		 * * List의 후손 클래스
		 * - "ArrayList", Vector, LinkedList(잘 안씀)
		 *  - Vector가 성능저하를 야기시키기때문에 새로 나온게 ArrayList (똑같지만 동기화를 제공하냐안하냐의 차이, Buffer & Builder처럼)
		 * 
		 * 
		 * - Vector와 ArrayList 동일한 기능 제공
		 * 단 차이점 : Vector - 동기화 제공 O		=> 멀티스레드환경에 있어서만 좋다. (단일 스레드 환경에 있어서는 성능저하 야기) => Deprecate 되어있음
		 * 			ArrayList - 동기화 제공 X
		 * 			(여러개의 스레드가 접근할때 기다렸다가 하나씩하게하는게 동기화)
		 * 
		 * 
		 * 
		 * - ArrayList와 LinkedList의 차이점
		 * 	> ArrayList같은 경우 내부적으로 배열을 가지고 있음 (배열베이스)
		 *    특정 인덱스에 값을 추가한다거나 삭제를 할 때 내부적으로 반복문이 들어가면서 값이 땡겨지는 과정이 진행될 것!
		 *    
		 *  > LinkedList 같은 경우는 데이터와 데이터를 체인처럼 연결해서 관리함
		 *    특정 인덱스에 값을 추가한다거나 삭제를 할 때 내가 작업하고자 하는 인덱스 앞과 뒤를 인지하고 있기 때문에 연결만 시켜주면 끝
		 *    
		 *    새로운 데이터 추가한다거나 삭제를 하는 경우에 있어서는 LinkedList가 속도가 더 빠름!! 단, 검색을 할 때는 속도가 느림!! (전체 탐색을 해야만 하기 때문)
		 *    
		 * 
		 */
		
		
		// ArrayList 컬렉션 사용해보기
		
		// ArrayList<E>  --> 제네릭 타입 제시!!
		ArrayList<Music> list = new ArrayList<>(3);	// 크기지정 할 수도 있음!!
		//ArrayList<Object> list = new ArrayList<Object>(3); 제네릭 지정 안하면 <Object> 생략되어있는 것
		//ArrayList<Music> list = new ArrayList<Music>(3);  --> <Music>객체만 담는다고 타입의 제한 둔 것, 그 외의 객체들 절대 들어올 수 없다.
		// ArrayList<Object> list = new ArrayList<>(3);  --> 6버전 이후부터는 뒤에는 <>만 해도 앞에 기술된것 적용됨
		
		System.out.println(list);	// 현재 아무것도 안담긴 상태 (비어있는 상태)
		
		// E --> Element : 리스트에 담길 요소들 (객체라고 생각하면 됨)
		
		
		// ★★★  --> 많이 쓰이는 메소드
		
		
		// ★★★1. add(E e) : 리스트의 끝에 전달된 객체를 추가해주는 메소드 
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		//list.add("끝");
	
		
		// 지정한 크기보다 크게 넣어도 오류나지 않음 --> 장점1 : 크기의 제약이 없다.
		// 다양한 타입의 데이터가 들어가도 문제 없음 --> 장점3 : 여러타입들을 보관할 순 있다.
		
		System.out.println(list); 	// 차례대로 순서유지 되고있음
		
		// 2. add(int index, E e) : 해당 인덱스에 내가 전달한 객체를 추가시켜주는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		// 3. set(int index, E e) : 해당 인덱스의 값을 새로이 전달한 객체로 변경시켜주는 메소드
		list.set(0, new Music("술이 달다", "에픽하이"));
		
		System.out.println(list);
		
		// ★★★4. size() : 리스트 안에 몇개의 객체가 담겨있는지 갯수 반환시켜주는 메소드 ( .length와 동일한 기능)
		System.out.println(list.size());
		
		// 5. remove(int index) : 해당 인덱스의 객체 삭제시켜주는 메소드, 삭제되고 뒤에있던것들 한칸씩 땡겨옴
		list.remove(1);
		
		System.out.println(list);
		System.out.println(list.size()); 	// 사이즈도 줄어듦
		
		// ★★★6. get(int index) : E (반환형)  => 해당 인덱스의 "객체" 반환시켜주는 메소드
		Object m = list.get(0);		// 객체배열로 치면 list[0]와 똑같은 개념
		// 우선은 Object로 반환함
		
		Music mu = /*(Music)*/list.get(0);
		// 꼭 Music으로 받고자한다면 강제형변환 하면 됨
		// <Music> 제네릭 설정하면 강제형변환 안해줘도 됨
		
		//String str = (String)list.get(3);
		// 얘도 강제형변환
		
		System.out.println(m);
		System.out.println(mu);
		//System.out.println(str);
		
		
		// 7. subList(int index1, int index2) : List	=> index1부터 index2까지의 해당 객체들 추출해서 새로운 List로 반환시켜주는 메소드
		List<Music> sub = list.subList(0, 2);	// 0 <=  <2    (subString과 같은 맥락,  beginIndex 위치에서부터 endIndex-1까지)
		// 여기도 제네릭 설정 --> 노란줄 사라짐
		
		System.out.println(sub);
		
		// 8. addAll(Collection c)  : 컬렉션에 담겨있는 모든 객체들을 통째로 추가해주는 메소드
		list.addAll(sub);
		
		System.out.println(list);
		
		System.out.println("===========================================================");
		
		
		// ★★★9. isEmpty() : 컬렉션이 비어있는지 묻는 메소드 (비어있으면 true, 비어있지 않으면 false 반환) 
		System.out.println(list.isEmpty());
		
		// 10. clear() : 컬렉션에 담긴 객체를 싹 비워주는 메소드
		//list.clear();
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
		
		// 해당 리스트에 담겨있는 모든 객체들에 순차적으로 접근해서 출력
		System.out.println("============================================================");
		
		// 0번 인덱스부터 마지막 인덱스(list사이즈 -1)까지
		
		// for loop문
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		// for each문
		for(Music o:list) { // 변수 = list.get(0); --> 변수 = list.get(1); --> 변수 = list.get(2);
			// Music객체들 + String("끝")이라 Object로 반환되기때문에 Object로 받아야함
			// <Music> 제네릭 설정하면 Music으로 받을 수 있음
			System.out.println(o);
		}
		
		
		/*
		 * * <> 제네릭스 을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 두기 위해서
		 * 2. 해당 그 컬렉션의 저장된 객체를 꺼내서 사용할 때도 매번 형변환해야하는 절차를 없앨 수 있음!! 
		 * 
		 */
		
		
		
		
		

	}

}
