package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public interface Basic {
	
	// 추상클래스 --> 일반필드 + 일반메소드 + [추상메소드]
	// 인터페이스 --> only 상수(public static final)필드 + 추상메소드
	//		  --> 완벽히 미완성!! 항상 미완성이여야함
	
	
	// 인터페이스에서의 필드는 무조건 상수필드이기 때문에 생략가능
	// 인터페이스라고 기술했기 때문에 생략해도 알아서 상수로 만들어짐
	/*public static final*/ int NUM = 10;
	
	// 인터페이스에서의 메소드는 무조건 추상메소드이기 때문에
	// 인터페이스라고 기술했기 때문에 알아서 추상메소드로 인식, public abstract 생략가능, 그러나 반환형은 무조건 있어야함!!
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	

}
