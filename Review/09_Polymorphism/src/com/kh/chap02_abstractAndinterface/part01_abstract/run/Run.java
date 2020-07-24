package com.kh.chap02_abstractAndinterface.part01_abstract.run;

import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.BasketBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * * 추상클래스
		 * - 미완성클래스
		 * - 객체생성불가!! (단, 레퍼런스타입으로는 기술 가능)
		 * - 일반필드 + 일반메소드 + [추상메소드]  이 클래스 작성하긴 했는데 아직은 미완성인것 같아서 얘가지고 객체생성하지마! 할 떄,
		 * 									일반필드 + 일반메소드로도 abstract기술해서 추상클래스로 만들 수 있다.
		 * --> 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
		 * --> 추상메소드가 굳이 없어도 추상클래스로 만드는 것 가능!!
		 * 		언제? --> 클래스를 정의하긴 했지만 이 클래스로 객체생성 불가하게끔 해놓고자 한다면
		 * 
		 * 
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부({})가 구현되어있지 않은 메소드
		 * - 추상메소드가 기술된 추상클래스를 상속받는 자식클래스에서 ★반드시! 오버라이딩 해줘야됨
		 * --> 오버라이딩 하지 않으면 에러발생
		 * --> 메소드 사용의 통일성 확보 목적
		 * 
		 * 
		 */
		
		
		// 추상클래스(미완성된 클래스)로는 바로 객체 생성 불가
		// Sports s = new Sports();		<-- 미완성된 클래스라 생성불가
		
		// 단, 레퍼런스타입으로는 기술가능, 객체생성만 X
		// 즉, 다형성으로는 적용가능
		// 부모타입으로 다양한 자식객체들 받아줄 수 있다.
		Sports s = new BasketBall();
		Sports[] arr = new Sports[2]; 	// 객체생성 아님!! 배열만 생성
		arr[0] = new FootBall();
		arr[1] = new BasketBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();   // 동적바인딩 됨 , 컨트롤로 타고 가보면 부모클래스지만 
							//실질적으로는 자식클래스에서 오버라이딩(재정의)되어 완성된클래스가  나옴
		}
		

	}

}
