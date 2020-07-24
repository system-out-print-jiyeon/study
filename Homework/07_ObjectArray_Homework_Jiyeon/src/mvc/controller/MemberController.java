package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE=10;
	
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20 ,'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60 ,'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17 ,'F', "yo5@hanmail.com");
		mem[3] = new Member("user04", "pass04", "연개소문", 57 ,'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45 ,'F', "shin@naver.com");
		memberCount = 5;
	}	
		
	
	
	
	
	
	public int getMemberCount() {
		return memberCount;
	}
	
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		Member m = null;
		for(int i=0; i<memberCount;i++) {
			if(userId.equals(mem[i])) {
				m = mem[i];
			}
		}
		
		return m;
		
	}
	
	public void insertMember(Member m) {
		
			mem[memberCount++] = m;
			
		
	}
	
	public Member searchMember(int menu, String search) {
		
		Member searchMember = null;
		
		for(int i=0; i<memberCount; i++) {
			if(menu == 1 && search.equals(mem[i].getUserId())) {
				searchMember = mem[i];
			}else if(menu == 2 && search.equals(mem[i].getUserId())) {
				searchMember = mem[i];
			}else if(menu == 3&& search.equals(mem[i].getUserId())) {
				searchMember = mem[i];
			}
		}
		return searchMember;
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		
		
		for(int i=0; i<memberCount; i++) {
			if(menu == 1) {
				m.setUserPwd(update);
			}else if(menu == 2 ) {
				m.setName(update);;
			}else if(menu == 3) {
				m.setEmail(update);;
			}
		}
	
		
		
	}
	
	
	public void deleteMember(String userId) {
		
		for(int i=0; i<memberCount; i++) {
		if(userId.equals(mem[i].getUserId())) {
			
		}
		
		}
	}
	
	
	
	
	
	
}
