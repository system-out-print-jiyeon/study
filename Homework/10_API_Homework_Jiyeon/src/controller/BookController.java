package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{
		list[0] = new Book("�ڹ��� ����", "���ӽ� ����", "����", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("�����е� �����Ҳ�����", "������", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API�� ����", "������", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("����� ���α׷���", "������", "���е���", new Date(2016-1900, 8-1, 30), 10000);
	}
	
	public BookController() {}
	
	// 1. ���� ��ü ��� ��� �޼ҵ�
	public void printAll() {
		
		// list �迭 ��ü ���
		
		// 1) for loop�� ���
		/*
		for(int i=0; i<list.length; i++) { // 0�� �ε������� �������ε���(4)���� ���������� �����ϸ鼭 ��� 
			
			//System.out.println(list[i]); // �̷��� �ٷ� ����ϸ�.. ������ �ε����� ���� Book��ü�� ������� �ʱ� ������ null ��µ�!!
			
			if(list[i] != null) { // ���� �ش� list[i]�� null�� �ƴ� ���(��, Book��ü ������� ���)�� ��µ� �� �ֵ��� ����ó�� �ʿ�!
				System.out.println(list[i]);
			}
			
		}
		*/
		
		// 2) for each�� ��� (���� for��)	
		for(Book bk : list) { // �� for���� ������ 0���ε������� �������ε������� �ݺ��� ��!!
			
			// for loop�������� ������ list[i]�� null�� �ƴҶ� ��µǰԲ� �ߴٸ�
			// �̹��� �Ź� ����ϱ� ���� ���Ͽ� ���� null�� ��� (��, �������ε����� �Ǿ��� ��)
			// �� �ݺ����� ���������Բ� 
			if(bk == null) {
				break;
			}
			
			System.out.println(bk);
			
		}
		
	}
	
	
	// 2. ���� �߰� ��� �޼ҵ�
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. �Ű������� ���޹��� newPrice��  ==>      String --> int�� ��ȯ �۾�
		//     								   "20000" -->  20000
		int price = Integer.parseInt(newPrice); // �Ľ�
		
		// --------------------------------------------------------
		// 2. �Ű������� ���޹��� newDate��   ==>       String --> Date�� ��ȯ �۾�
		//	  '-'�� �����ڷ� StringTokenizer�� �̿��Ͽ� ���ڿ� �и� �� ���� ��,��,�� �� Date�� ����
		
		// 1) �������� �䱸�ߴ� StringTokenizer�� �̿��� ���
		/*
			//  1_1) StringTokenizer�� �̿��Ͽ� ���� "2020-07-01" �� ���� ���ڿ��� �и�("2020", "07", "01")
			StringTokenizer stn = new StringTokenizer(newDate, "-"); 
			
			//  1_2) �� �и��� ���ڿ����� �Ź� �̾Ƽ� int �����鿡 ���
			//int year = stn.nextToken(); // stn.nextToken()���� ó�� ������ "2020" �ϰ��� (��, ������ ���ڿ� ����) --> �ٷ� int�� ������ ���� �Ұ� (�Ľ��ؾߵ�!!)
			
			int year = Integer.parseInt(stn.nextToken()); // "2020" --> 2020
			int month = Integer.parseInt(stn.nextToken());// "07"   --> 7
			int date = Integer.parseInt(stn.nextToken()); // "01"   --> 1
			
			//  1_3) year, month, date ������ Date��ü �����ϱ�
			Date publishDate = new Date(year - 1900, month - 1, date);
		*/
		
		// 2) split �޼ҵ带 �̿��� ���
		
		// 2_1) split �޼ҵ带 �̿��Ͽ� ���� "2020-07-01" �� ���� ���ڿ��� �и��� String[] �迭�� ���
		String[] arr = newDate.split("-");
		
		// 2_2) �� �и��� ���ڿ����� ����ִ� �ش� �迭�� �ε����� �����ؼ� int �����鿡 ���
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int date = Integer.parseInt(arr[2]);
		
		// 2_3) year, month, date ������ Date��ü �����ϱ�
		Date publishDate = new Date(year - 1900, month - 1, date);
				
		// ------------------------------------------------------
		// 3. ������ ���޹��� ����� ������ ��ȯ�۾��� ���� price�� date���� ������
		//	  �Ű����� �����ڸ� ���� ������ �� 4�� �ε����� ����
		list[4] = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
		
	
	}
	
	
	// 3. ���� �Ⱓ�� ��� ��� �޼ҵ�
	public void printBookPublishDate() {
		// ������ ������ �Ⱓ�� ���
		// "xxxx�� xx�� xx�� �Ⱓ" �� ���� �������� ���
		
		// SimpleDateFormat�� �̿��Ͽ� ���
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� �Ⱓ");
		System.out.println(sdf.format(list[4].getPublishDate())); // �ٷ� ���� (������ ���ڿ��� �������ϰ�)
		
	}
	
	
	// 4. ���� �˻� ��� �޼ҵ�
	public void searchBook(String searchTitle) {
		
		// ���� ����Ʈ�� ��ü������ ��ȸ�ϸ鼭 (for�� �̿�)
		// ���޹��� �˻����� "������!!" ������ ���  => contains() �޼ҵ� Ȱ��
		
		// 1) for loop�� ���
		/*
		for(int i=0; i<list.length; i++) {
			if(list[i].getTitle().contains(searchTitle)) {
				System.out.println(list[i]);
			}
		}
		*/
		
		// 2) for each�� ��� (���� for��)
		for(Book bk : list) {
			if(bk.getTitle().contains(searchTitle)) {
				System.out.println(bk);
			}
		}
	
		
	}
	
	
	

}
