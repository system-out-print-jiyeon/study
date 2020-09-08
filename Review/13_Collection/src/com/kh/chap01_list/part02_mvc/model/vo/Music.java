package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> {
	
	// 필드부
	private String title;
	private String artist;
	
	// 기본생성자, 매개변수생성자, setter/getter메소드, toString메소드
	public Music() {}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		
		// 가수명 오름차순 정렬이 되게끔 해줘야됨!!
		
		// 이 compareTo 메소드 실행시 반환값이 양수일 경우 두 객체의 순서가 바뀌게 됨!!
		
		// 	   m1.compareTo(m2)
		//    this(앞)		o(뒤)
		
		// this(앞)의 가수명이 o(뒤)의 가수명보다 더 큰 값일 경우 순서를 변경해야됨!! => 즉, 양수값 반환
		//   "하하"            "강보람"
		
		/*
		if(this.artist > o.artist) {
			return 1;
		}else {
			return 0 또는 -1;
		}
		*/
		
		// 문자열간에 대소비교를 해주는 String 클래스에서 제공하는 
		// 앞쪽문자열.compareTo(뒤쪽문자열)
		// 앞쪽문자열이 뒤쪽문자열보다 더 큰 경우 1반환, 뒤쪽문자열이 더 클경우 -1반환, 두개의 문자열이 일치할 경우 0을 반환
		
		return this.artist.compareTo(o.artist);
	}

	

}
