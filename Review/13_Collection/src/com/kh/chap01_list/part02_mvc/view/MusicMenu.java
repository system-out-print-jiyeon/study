package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicMenu {
	
	// �ش� �� Ŭ���� �������� sc �ٷ� �� �� �ְԲ�
	private Scanner sc = new Scanner(System.in);
	// �ٷ� Controller ��û �� �� �ְԲ�
	private MusicController mc = new MusicController();
	
	
	/**
	 * * ���α׷� ���� �� ����ڰ� ���Ե� ù ȭ��
	 * 
	 */
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n== Welcome ���� ==");
			System.out.println("1. �ű� �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. Ư�� �� �˻�");
			System.out.println("4. Ư�� �� ����");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. �� ���� �ϱ�");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine(); 
			
			switch(menu) {
			case 1: insertMusic(); break;
			case 2: selectList(); break;
			case 3: searchMusic(); break;
			case 4: deleteMusic(); break;
			case 5: updateMusic(); break;
			case 6: sortMusic(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("��ȣ�� �߸� �����߽��ϴ�. �ٽ��Է����ּ���");
			}
		}
	}
	
	
	/**
	 * 1. �ű� �� �߰��ϴ� ȭ��
	 */
	public void insertMusic() {
		
		System.out.println("\n=== �ű� �� �߰� ===");
		System.out.print("���� �Է� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String artist = sc.nextLine();
		
		// �� �߰� ��û!! (Controller �޼ҵ� ȣ��!!)
		//mc.insertMusic(title, artist);
		mc.insertMusic(new Music(title, artist));
		
		System.out.println("���������� ���� �߰��Ǿ����ϴ�.");
		
	}
	
	/**
	 * 2. �� ��ü ��ȸ �ϴ� ȭ��
	 */
	public void selectList() {
		
		System.out.println("\n=== �� ��ü ��ȸ ===");
		
		// �� ��ü ��ȸ��û!! (Controller �޼ҵ� ȣ��!!)
		ArrayList<Music> list = mc.selectList();
		
		if(list.isEmpty()) { // ����Ʈ�� ������� ��� --> �����ϴ� ���� ���ٶ� �Ҹ�
			
			System.out.println("�����ϴ� ���� �����ϴ�.");
			
		}else { // ����Ʈ�� ������� ���� ��� --> �� ���̶� ����ִٶ� �Ҹ�
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));	// list[i]
			}
			
		}
		
	}
	
	
	/**
	 * 3. ����ڿ��� �˻��� �Է¹��� �� �ش� �˻� ��� ����ִ� ȭ��
	 */
	public void searchMusic() {
		
		System.out.println("\n=== Ư�� �� �˻� ===");
		
		System.out.println("1. �������� �˻�");
		System.out.println("2. ���������� �˻�");
		System.out.println("3. ����+���������� �˻�");
		System.out.print("��ȣ ���� : ");
		int search = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�˻��� �� Ű���� : ");
		String keyword = sc.nextLine();
		
		// �˻� ��û �ϱ�!! (Controller�� �޼ҵ� ȣ��!!)
		ArrayList<Music> searchList = mc.searchMusic(keyword, search);
		
		if(searchList.isEmpty()) { // ������� ���=> �˻��������
			
			System.out.println(keyword + "�� ���� �˻� ����� �����ϴ�.");
			
		}else { // �װԾƴҰ�� => �˻������ �ϳ��� ����ִٶ�� �Ҹ�
			
			//for(int i=0; i<searchList.size(); i++) {
			for(Music m : searchList) {
				System.out.println(m);
			}
			
		}
		
		
	}
	
	
	/**
	 * 4. Ư�� �� �����ϴ� ȭ��
	 */
	public void deleteMusic() {
		
		System.out.println("\n=== Ư�� �� ���� ===");
		
		System.out.print("�����ϰ��� �ϴ� �� �� : ");
		String title = sc.nextLine();
		
		// �� ���� ��û! (Controller �޼ҵ� ȣ��)
		int result = mc.deleteMusic(title);
		
		if(result > 0) { // ���������� ������
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else { // ������ ���� ã�� ����..
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
		
	}
	
	
	/**
	 * Ư�� �� �����ϴ� ȭ��
	 */
	public void updateMusic() {
		System.out.println("\n=== Ư�� �� ���� ===");
		
		// ����� �����Ұ��� �����ϰ��� �ϴ� ���
		System.out.print("�����ϰ����ϴ� �� �� : ");
		String title = sc.nextLine();			
		
		// ��������� �����Ұ��� ������ ���
		System.out.print("���� ����(���) : ");
		String upTitle = sc.nextLine();			
		// ��������� �����Ұ��� ������ ������
		System.out.print("���� ����(������) : ");
		String upArtist = sc.nextLine();
		
		// �� ���� ��û�ϱ�!! (Controller�޼ҵ� ȣ��)
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) { // ���� ������ �Ǿ��ٶ� �Ҹ�
			System.out.println("���������� �����Ǿ����ϴ�.");
		}else { // ������ ���� ã�� ���ߴٶ� �Ҹ�
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}
		
	}
	
	
	/**
	 * 6. �� ������ ��� ��ȸ�ϱ�
	 */
	public void sortMusic() {
		
		System.out.println("\n=== �� ���� �ϱ� ===");
		System.out.println("1. ������ �������� ����");
		System.out.println("2. ������ �������� ����");
		System.out.println("3. ��� �������� ����");
		System.out.println("4. ��� �������� ����");
		System.out.print("��ȣ ���� : ");
		int menu = sc.nextInt();
		
		// �� ���� ��ȸ ��û! (Controller �޼ҵ� ȣ��!)
		ArrayList<Music> sortList = mc.sortMusic(menu);
		
		for(int i=0; i<sortList.size(); i++) {
			System.out.println(sortList.get(i));
		}
		
		
		
	}
	
	

}
