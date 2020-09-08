package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 곡명 오름차순 정렬 기준
public class TitleAsc implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		// o1(앞)의 곡명이 o2(뒤)의 곡명보다 더 클경우 => 자리변경 => 양수값 반환
		
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}
