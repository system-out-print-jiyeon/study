package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		
		// 왼쪽	'='	 오른쪽		왼쪽 오른쪽은 항상 같은 자료형(타입)
		
		// 1. 부모타입 레퍼런스로 부모객체를 다루는 경우
		System.out.println("1. 부모타입 레퍼런스로 부모객체 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1레퍼런스로 Parent에만 접근 가능
		
		
		// 2. 자식타입 레퍼런스로 자식 객체를 다루는 경우
		System.out.println("2. 자식타입 레퍼런스로 자식객체 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();		// 얘도 자동형변환 된 케이스
		// c1 레퍼런스로 Parent, Child1 둘다 접근 가능
		
		
		// ★ 지금이 바로 다형성이 적용된 케이스
		// 3. 부모타입 레퍼런스로 자식객체를 다루는 경우
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우");
		Parent p2 = /*(Parent)*/ new Child1();		// 자식-->부모 라서 자동형변환 된거
		p2.printParent();
		// p2라는 레퍼런스로 Parent에만 접근가능
		// 하지만 Child1에 접근하고자 한다면 강제형변환을 하면 됨!!
		// p2.printChild1();		--> 안됨
		((Child1)p2).printChild1(); 	// 강제형변환
		
		/*
		 * 상속구조의 클래스간에는 형변환 가능!!
		 *
		 * 1. UpCasting
		 * 	자식타입 --> 부모타입
		 * 	자동형변환 (생략가능)
		 *	 ex) 부모타입 = (부모타입) 자식객체;
		 * 	     ((부모타입)자식).부모메소드();
		 * 
		 * 
		 * 2. DownCasting 
		 * 	부모타입 --> 자식타입
		 *	 강제형변환 (★생략불가)
		 * 	 ex) ((자식타입)부모).자식메소드();
		 * 
		 * 
		 */
		
		
		//---------------------------------------------------------------
		
		System.out.println("=======================================");
		
		// 다형성을 왜 쓰는지, 언제쓰는지 알아보자!
		// 다형성 : 하나의 부모타입으로 여러가지의 자식객체를 다룰 수 있는 개념
		
		
		// Child1객체 2개, Child2객체 2개가 필요해 편리하게 이용해볼래
		
		// 다형성 배우기 전
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5,7,2);
		arr2[1] = new Child2(2,1,5);
		
		
		// 다형성 배운 후
		/*
		 Parent p3 = new Child1();
		 Parent p4 = new Child2();
		 */
		
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(5,7,2);
		arr[2] = new Child2(2,1,5);
		arr[3] = new Child1(2,3,5);
		// 부모 = 자식;
		
		// 장점1. 하나의 부모타입으로 다양한 자식들을 받을 수 있다.
		// --> 자식들을 관리할 때 하나의 타입으로 관리할 수 있음 --> 편리하다. 코드 길이가 감소
		
		
		// 각각의 담겨있는 자식클래스의 메소드 실행
		// --> 자식타입으로 형변환해서 자식 메소드 실핼 (단, 각 인덱스별로 실제로 참조하고 있는 실제 자식타입으로 형변환해야됨!)
		
		((Child1)arr[0]).printChild1();
		//((Child1)arr[1]).printChild1();		// 실제로는 Child2객체 담겨있기때문에 빨간줄은 안떠도 실행하면 오류뜸
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		
		System.out.println("========== 반복문 이용 ==========");
		
		
		for(int i=0; i<arr.length; i++) {
		
			/*
			 * instanceof 연산자
			 * 
			 * 현재 레퍼런스가 어떤 자식객체를 참조하고있는지 확인할 때 사용
			 * 
			 * [표현법]
			 * 레퍼런스 instanceof 클래스명
			 * 
			 * 해당 레퍼런스가 실제로 참조하고있는 클래스타입이 해당클래스명과 일치하면 true, 아니면 false
			 * 실제 참조하고있는것에 맞춰서 적절하게 강제형변환해주는 연산자
			 */
			
			/*
			//if(i == 0 || i == 3) {
			if(arr[i] instanceof Child1) {	// 해당 인덱스가 실제 Child1을 참조하고있으면 true, 그게 아니면 false
			((Child1)arr[i]).printChild1();
			}else {
			((Child2)arr[i]).printChild2();
			}
		}
		*/
			
			arr[i].print();	// 동적바인딩 : 컴파일시에는 레퍼런스타입의 클래스에 기술된 메소드로 바인딩 되지만 
							// 				실제 실행되는건 실제로 참조하고있는 자식클래스에 기술된 오버라이딩된 메소드가 실행됨!
		
		
		
		
		}
	}
}