package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// ������ �������� ���ı���
public class ArtistDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		//			 compare(m1, m2)		=> ����� ��ȯ�� �ڸ�����!
		//				   o1(��), o2(��)
		
		//    o1(��)   VS    o2(��)
		
		//  o2(��)�� �������� o1(��)�� �������� Ŭ��� => �ڸ����� => ��, ����� ��ȯ
		
		/*
		if(o2.getArtist() > o1.getArtist()) {
			return 1;
		}else {
			return 0 or -1;
		}
		*/
		
		return o2.getArtist().compareTo(o1.getArtist());
	}

	

}
