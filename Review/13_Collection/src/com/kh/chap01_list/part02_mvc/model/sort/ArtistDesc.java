package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 가수명 내림차순 정렬기준
public class ArtistDesc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		//			 compare(m1, m2)		=> 양수값 반환시 자리변경!
		//				   o1(앞), o2(뒤)
		
		//    o1(앞)   VS    o2(뒤)
		
		//  o2(뒤)의 가수명이 o1(앞)의 가수명보다 클경우 => 자리변경 => 즉, 양수값 반환
		
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
