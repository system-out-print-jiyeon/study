package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public abstract class Sports {
	
	private int people;	// 해당 스포츠에 참여하는 명수
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	
	public String toString() {
		return "참여하는 명 수 : " + people + "명";
	}
	
	
	public abstract void rule();
	

}
