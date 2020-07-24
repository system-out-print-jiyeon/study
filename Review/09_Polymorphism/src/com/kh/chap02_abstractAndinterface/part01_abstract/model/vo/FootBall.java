package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public class FootBall extends Sports {
	
	// 부모클래스에 있는 추상메소드를 강제로 오버라이딩 해야한다 (재정의)       ★ 추상메소드를 상속하면 강제성이 좀 짙어짐
	@Override
	public void rule() {
		System.out.println("손이 아닌 발로 공을 차야만한다.");
	}

}
