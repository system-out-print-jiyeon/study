package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music> {
	
	// �ʵ��
	private String title;
	private String artist;
	
	// �⺻������, �Ű�����������, setter/getter�޼ҵ�, toString�޼ҵ�
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
		
		// ������ �������� ������ �ǰԲ� ����ߵ�!!
		
		// �� compareTo �޼ҵ� ����� ��ȯ���� ����� ��� �� ��ü�� ������ �ٲ�� ��!!
		
		// 	   m1.compareTo(m2)
		//    this(��)		o(��)
		
		// this(��)�� �������� o(��)�� �������� �� ū ���� ��� ������ �����ؾߵ�!! => ��, ����� ��ȯ
		//   "����"            "������"
		
		/*
		if(this.artist > o.artist) {
			return 1;
		}else {
			return 0 �Ǵ� -1;
		}
		*/
		
		// ���ڿ����� ��Һ񱳸� ���ִ� String Ŭ�������� �����ϴ� 
		// ���ʹ��ڿ�.compareTo(���ʹ��ڿ�)
		// ���ʹ��ڿ��� ���ʹ��ڿ����� �� ū ��� 1��ȯ, ���ʹ��ڿ��� �� Ŭ��� -1��ȯ, �ΰ��� ���ڿ��� ��ġ�� ��� 0�� ��ȯ
		
		return this.artist.compareTo(o.artist);
	}

	

}
