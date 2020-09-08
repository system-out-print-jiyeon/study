package com.kh.chap01_list.part01_basic.model.vo;

public class Music {
	
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
	

}
