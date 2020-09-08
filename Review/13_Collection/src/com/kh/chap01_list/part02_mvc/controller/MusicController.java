package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part02_mvc.model.sort.ArtistDesc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleAsc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleDesc;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	
	/*
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	*/
	
	public void insertMusic(Music m) {
		list.add(m);
	}
	
	public ArrayList<Music> selectList() {
		
		return list;
		
	}
	
	// 간단버전
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			//		   "강보람".contains("강")
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searchList.add(list.get(i));
			}
		}
		
		// 반복문이 다 끝난 시점에 있어서 searchList에는 검색된 곡이 담겨있을 것!
		// 단, 검색된 곡이 하나도 없었을 경우 searchList는 비어있을 것!!
		return searchList;
	}
	
	
	public ArrayList<Music> searchMusic(String keyword, int search) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(search == 1) {  // 제목으로 검색
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			
		}else if(search == 2) { // 가수명으로 검색
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			
		}else if(search == 3) { // 제목+가수명으로 검색
			
			for(int i=0; i<list.size(); i++) {
				
				// 방법1.
				//if(list.get(i).getTitle().contains(keyword) 
				//		|| list.get(i).getArtist().contains(keyword)) {
				
				// 방법2. 곡명과 가수명을 하나의 문자열로 합친 후 contains로 비교하는 방법 ("이 밤양다일".contains("밤양"))
				if(list.get(i).getTitle().concat(list.get(i).getArtist()).contains(keyword)) {
					
					searchList.add(list.get(i));
				}
			}
			
		}
		
		// 반복문이 다 끝난 시점에 있어서 searchList에는 검색된 곡이 담겨있을 것!
		// 단, 검색된 곡이 하나도 없었을 경우 searchList는 비어있을 것!!
		return searchList;
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;  // 처리 결과를 보관할 변수
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i--);
				//System.out.println("성공적으로 삭제되었습니다.");
				result++;
				//i--;
			}
		}
		
		// 반복문이 다 끝난시점에 있어서 여전히 result값이 0일 경우 => 삭제할 곡을 찾지 못함..
		// 							  result값이 0보다 클 경우 => 뭔가 삭제가 되었다란 소리
		return result;
		
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;		// 처리결과를 담을 변수
		
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				
				// list.get(i)	== 수정할 곡
				// 방법1. setter메소드로 변경
				/*
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				*/
				
				// 방법2. list에서 제공하는 set메소드 이용
				list.set(i, new Music(upTitle, upArtist));
				
				result++;
				//System.out.println("성공적으로 수정되었습니다.");
			}
		}
		
		
		return result;
		
	}
	
	
	public ArrayList<Music> sortMusic(int menu) {
		
		// 복사본 리스트
		ArrayList<Music> sortList = new ArrayList<>();	// 빈 리스트
		sortList.addAll(list); // list에 기존에 담겨잇던 Music객체들 통째로 추가하기 
		
		switch(menu) {
		case 1: Collections.sort(sortList); break; // 가수명 오름차순
		case 2: Collections.sort(sortList, new ArtistDesc()); break; // 가수명 내림차순
		case 3: Collections.sort(sortList, new TitleAsc()); break; // 곡명 오름차순
		case 4: Collections.sort(sortList, new TitleDesc()); break; // 곡명 내림차순
		}
		
		return sortList;
		
		
	}
	
	
}



