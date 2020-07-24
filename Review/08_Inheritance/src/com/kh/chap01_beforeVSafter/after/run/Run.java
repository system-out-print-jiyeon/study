package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {

		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 1500000, true);
		
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰11pro", 1500000, "KT");
		
		Tv t = new Tv("LG", "t-01", "겁나얇은티비", 3500000, 60);
		
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이
		 * --> 코드의 중복을 제거하여 프로그램의 생산성이나 유지보수에 크게 기여
		 * 
		 * * 상속의 특징
		 * - 클래스간의 상속은 다중상속이 불가능! (단일 상속만 가능)
		 * - 부모의 private 접근제한자로 기술되어있는 경우 아무리 상속구조라고 해서 직접 접근 불가
		 * 	(단, protected로 하게 되면 자식에서 직접 접근 가능!)
		 * - 명시되어있진 않지만 모든 클래스는 Object 클래스의 후손이다!
		 * 	--> Object클래스에서 제공하는 메소드는 얼마든지 갖다 쓸 수 있다.
		 * 	--> 맘에 안들면 내 입맛대로 재정의(오버라이딩) 가능하다.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
