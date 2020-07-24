package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {

	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		// �޴� ���ѹݺ� �ݺ��� ���
		while(true) {
			
			// �޴����
			System.out.println("\n====== ȸ�� ���� �޴� ======");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			
			}
					
		}
		
	}
	
	/**
	 * ����ȭ�� 1. �ű�ȸ�� ����ϴ� ȭ��
	 */
	public void insertMember() {
		System.out.println("== �ű� ȸ�� ��� ==");
		
		int count = mc.getMemberCount();
		
		if(count>MemberController.SIZE) {
			return;
		}
		
		
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		Member m = mc.checkId(userId);
		
		if(m != null) {
			System.out.println("�̹� ������� ���̵��Դϴ�.");
		
		}else {
			System.out.print("��й�ȣ : ");
			String pwd = sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("���� : ");
			char gender = sc.nextLine().charAt(0);
			System.out.print("�̸��� : ");
			String email = sc.nextLine();
			
		    m = new Member(userId, pwd, name, age, gender, email);
			mc.insertMember(m);
		    
			System.out.println("ȸ������� �Ϸ�Ǿ����ϴ�");
		    
		}
		
	}
	
	
	/**
	 * ����ȭ�� 2. ȸ�� ���� �˻��ϴ� ȭ��
	 */
	
	public void searchMember() {
		
		// �޴���� >> �ݺ�����
		while(true) {
		System.out.println("\n== ȸ�� ���� �˻� ==");
		
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. ���� �޴���");
		
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		if(menu == 9) {
			return;
		}
		
		System.out.print("�˻� ���� : ");
		String search = sc.nextLine();
		Member searchMember = mc.searchMember(menu, search);
		
		
		if(searchMember == null) {
			System.out.println("�˻��� ����� �����ϴ�.");
		}else {
			System.out.println(searchMember.information());
		}
		
		}
		
	}
	
	
	/**
	 * ����ȭ�� 3. ȸ�� ���� ����
	 */
	
	public void updateMember(){
		
		while(true) {
			System.out.println("\n== ȸ�� ���� ���� ==");
			
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("9. ���� �޴���");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				return;
			}
			System.out.print("������ ȸ�� ���̵� : ");
			String userId = sc.nextLine();
			
			Member m = mc.checkId(userId);
			
			if(m == null) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�."); return;
			}else {
				System.out.println(m.information());
			}
			
			System.out.print("������ ���� : ");
			String update = sc.nextLine();
			
			mc.updateMember(m, menu, update);
			
			System.out.println("ȸ�������� ����Ǿ����ϴ�.");
			
		}
		
	}
	
	/**
	 * ����ȭ�� 4. ȸ�� ���� �����ϴ� ȭ��
	 */
	
	public void deleteMember() {
		System.out.println("\n== ȸ�� ���� ���� ==");
		
		System.out.print("������ ȸ�� ���̵� : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		if(m == null) {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(m.information());
		}
		
		System.out.print("���� �����Ͻðڽ��ϱ�? (y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			mc.deleteMember(userId);
			System.out.println("ȸ���� ������ �����Ǿ����ϴ�.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//
