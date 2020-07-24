package com.kh.first;	//패키지 선언부 : 해당 클래스가 어떤 패키지에 속해 있는지

public class A_MethodPrinter {//클래스명은 대문자로 시작!!
	
	// 기능단위 == 메소드
	// 클래스마다 무조건 메인 메소드를 포함할 필요 없음!
	
	// 일반메소드 : public void methodA()
	public void methodA() {// 메소드명은 소문자로 시작!
		System.out.println("어떡해벌써한시");
		methodB(); // 같은 클래스 내 메소드 호출시 바로 그냥 메소드명();
	}

	public void methodB() {
		System.out.println("개졸리당");
		methodC();
	}
	
	public void methodC() {
		System.out.println("이제 잘거임");
		//methodA(); <-- 주석 풀면 A,B,C 무한반복출력
	}



}
