package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public abstract class Sports {
	
	private int people;	// �ش� �������� �����ϴ� ���
	
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
		return "�����ϴ� �� �� : " + people + "��";
	}
	
	
	public abstract void rule();
	

}
