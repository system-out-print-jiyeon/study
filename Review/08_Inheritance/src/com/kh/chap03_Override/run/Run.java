package com.kh.chap03_Override.run;

import com.kh.chap03_Override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "나수학", 10000);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 20000);
		
		//System.out.println(bk1.information());
		//System.out.println(bk2.information());

		
		
		// * toString()
		// 오버라이딩 전 : Object 클래스의 toString() 실행  --> 풀클래스명 + @ + 주소값의 16진수값 반환
		// 오버라이딩 후 : Book클래스의 toString() 실행 --> 모든 필드값 하나의 문자열로 합쳐서 반환
		System.out.println(bk1/*.toString()*/);
		System.out.println(bk2.toString());
		// 출력문에서 어떤 레퍼런스를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스 .toString() 메소드 호출해줬던것!!
		
		
		// equals(), hashCode() 를 가지고 작업해볼 것!!
		
		Book bk3 = new Book("수학의 정석", "나수학", 10000);	// bk1과 동일한 필드값을 가진 bk3객체 생성
		
		System.out.println("bk1과 bk3가 같은 값입니까? : " + (bk1 == bk3));
		
		// 레퍼런스간의 동등한지 비교할 때 equals() 메소드 사용 가능
		
		// 오버라이딩 전 : Object클래스의 equals메소드 --> 두 주소값을 가지고 비교
		// 오버라이딩 후 : Book클래스의 equals메소드 --> 두 객체의 필드값을 가지고 비교	★★ equals 문자열만의 비교 아님!! 객체의 필드값의 비교
		System.out.println("bk1과 bk3가 같은 값입니까? : " + bk1.equals(bk3));
		
		
		// 동일객체 : 실제필드값들도 같고 해쉬코드값도 일치한 경우
		
		// 오버라이딩 전 : Object클래스의 hashCod메소드 --> "실제 주소값을 베이스"로 10진수로 계산한 결과 반환
		// 오버라이딩 후 : Book클래스의 hashCode메소드 --> "각 객체의 필드값을 베이스"로 해시코드값 반환
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode());
		System.out.println(bk3.hashCode());
		
		
		//-----------------------------------------------
		
		//String클래스
		//String은 일반자료형 아님
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);		// 단순한 주소값 비교
		System.out.println(str1.equals(str2));	// 실제내용을 가지고 비교하게끔 String클래스에서 이미 equals 재정의 됨
		
		System.out.println(str1/*toString()*/);	// toString도 이미 저절로 재정의 됨
		System.out.println(str2/*toString()*/);
		
		System.out.println(str1.hashCode());	// hashCode로 재정의 되어있음
		System.out.println(str2.hashCode());
		
		
		
		
	}

}
