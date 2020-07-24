package mvc.controller;

import mvc.model.vo.AniBook;
import mvc.model.vo.Book;
import mvc.model.vo.CookBook;
import mvc.model.vo.Member;

public class LibraryManager {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("�������� �� �����غ�", "������", "�ұ�å", true);
	}
	
	

	
	public void insertMember(Member mem) {
		this.mem=mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] newbList = new Book[5];
		
		int count = 0;
		
		for(int i=0; i<newbList.length; i++) {
			if(bList[i].getTitle().equals(keyword)) {
				count = i;
				
				
				if(bList[i] instanceof AniBook) {
					newbList[count] = new AniBook(bList[count].getTitle(), bList[count].getAuthor(), 
							bList[count].getPublisher(), ((AniBook)bList[count]).getAccessAge());
				}
				if(bList[i] instanceof CookBook) {
					newbList[count] = new CookBook(bList[count].getTitle(), bList[count].getAuthor(), 
							bList[count].getPublisher(), ((CookBook)bList[count]).isCoupon());
				}
			}
			
			
		}
		return newbList;
	}
	
	
	public int rentBook(int num) {
		
		int result = 0;
		int couponCount = 0;
		
		if(bList[num] instanceof AniBook && ((AniBook)bList[num]).getAccessAge() > mem.getAge() ) {
			result = 1;
		}
		if(bList[num] instanceof CookBook && ((CookBook)bList[num]).isCoupon() == true) {
			couponCount++;
			result = 2;
		}
		return result;
	}
	
	
	
	

}
