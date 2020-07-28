package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part02_mvc.model.sort.ArtistDesc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleAsc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleDesc;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	
	/* ���1.
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	*/
	
	// ���2.
	public void insertMusic(Music m) {
		list.add(m);
	}
	
	
	
	public ArrayList<Music> selectList() {
		return list;
		
	}
	
	// ���ܹ���
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			// 			"������".contains("��")  --> true
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searchList.add(list.get(i));
			}
		}
		
		// �ݺ����� �� ���� ������ �־ searchList���� �˻��� ���� ������� ��!
		// ��, �˻��� ���� �ϳ��� ���� ��� searchList�� ������� ��!!
		
		return searchList;
		
	}

	
	
	
	
	public ArrayList<Music> searchMusic(String keyword, int search) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(search == 1) { // �������� �˻�
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {	
					searchList.add(list.get(i));
				}
			}
			
		}else if(search == 2) { // ���������� �˻�
		
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			
		}else if(search == 3) { // ���� + ���������� �˻�
			
			for(int i=0; i<list.size(); i++) {
				
		// ��� 1.
		//		if(list.get(i).getTitle().contains(keyword) ||
		//				list.get(i).getArtist().contains(keyword)) {
					
		// ���2. ���� �������� �ϳ��� ���ڿ��� ��ģ �� contains�� ���ϴ� ��� ("�� ������".contains("���"))
				if(list.get(i).getTitle().concat(list.get(i).getArtist()).contains(keyword)){
				
				searchList.add(list.get(i));
				}
			}
				
		}	
		return searchList;
		
	}

	
	
	
	public int deleteMusic(String title) {
		
		int result = 0; // ó�� ����� ������ ����
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i--);
				result++;
				//i--;
				// System.out.println("���������� �����Ǿ����ϴ�.");
			}
		}
		
		// �ݺ����� �� ���� ������ �־ ������ result���� 0�� ��� => ������ ���� ã�� ����..
		//							 result���� 0���� Ŭ ��� => ���� ������ �Ǿ��� �Ҹ�
		
		return result;
		
	}
	
	
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				
				// list.get(i) == ������ ��
				// ��� 1. setter�޼ҵ�� �����ϱ�
				/*
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				*/
				
				// ��� 2. list���� �����ϴ� set�޼ҵ� �̿�
				list.set(i, new Music(upTitle, upArtist));
				
				result++;
				//System.out.println("���������� �����Ǿ����ϴ�!");
				
			}
		}
		
		return result;
		
	}
	
	
	
	public ArrayList<Music> sortMusic(int menu) {

		// ���纻 ����Ʈ
		ArrayList<Music> sortList = new ArrayList<>();	// ���� �� ����Ʈ
		sortList.addAll(list);	// list�� ������ ����ִ� Music��ü�� ��°�� �߰��ϱ�
	
		
		switch(menu) {
		case 1 : Collections.sort(sortList); break;	// ������ ��������
		case 2 : Collections.sort(sortList, new ArtistDesc()); break; // ������ ��������
		case 3 : Collections.sort(sortList, new TitleAsc()); break; // ��� ��������
		case 4 : Collections.sort(sortList, new TitleDesc()); break; // ��� ��������
		}
		
		return sortList;
	
	}
	
	
	
}













