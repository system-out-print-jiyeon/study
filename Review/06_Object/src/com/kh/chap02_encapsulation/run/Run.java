package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	
	/*
	 * 7. 캡슐화 과정 => 완벽한 클래스의 형태완성!!
	 * 
	 *    1) 정보은닉 : private
	 *       각 필드에 직접적으로 접근이 불가하게끔 처리
	 *       
	 *    2) setter/getter 메소드 : public
	 *       직접적으로 접근이 불가해졌기 때문에 간접적으로 접근해서 값을 초기화하거나 또는 값을 조회할 수 있는 메소드
	 *       
	 *       setter메소드 역할 : 전달값 받아서 해당 필드에 초기화(값을 변경)
	 *       getter메소드 역할 : 해당 필드에 담긴 값 반환(값을 조회)
	 */
	
	
	public static void main(String[] args) {
		
		// 홍길동 객체
		Student hong = new Student();
		
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 162.3;
		*/
		// private은 직접 접근 불가.. 어떻게 담지..?
		// 직접접근 막았다면 간접적으로나마 접근할 수 있도록!!
		
		// 간접적으로 접근할 수 있는 setter메소드 이용해서 값 초기화
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(162.3);
		
		
		// xxx님의 나이는 xx살이고, 키는 xxxcm입니다. 
		//System.out.println(hong.name + "님의 나이는 " + hong.age + "살이고, 키는" + hong.height + "cm입니다.");
		
		// 간접적으로나마 값을 반환해주는 getter메소드를 이용해서 값 알아내기
		System.out.println(hong.getName() + "님의 나이는 " + hong.getAge() + "살이고, 키는" + hong.getHeight() + "cm입니다.");
		
		
		
		
	}

}
