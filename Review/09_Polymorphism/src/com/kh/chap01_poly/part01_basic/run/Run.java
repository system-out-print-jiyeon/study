package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		
		// ����	'='	 ������		���� �������� �׻� ���� �ڷ���(Ÿ��)
		
		// 1. �θ�Ÿ�� ���۷����� �θ�ü�� �ٷ�� ���
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ�ü �ٷ�� ���");
		Parent p1 = new Parent();
		p1.printParent();
		// p1���۷����� Parent���� ���� ����
		
		
		// 2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽİ�ü �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();		// �굵 �ڵ�����ȯ �� ���̽�
		// c1 ���۷����� Parent, Child1 �Ѵ� ���� ����
		
		
		// �� ������ �ٷ� �������� ����� ���̽�
		// 3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���");
		Parent p2 = /*(Parent)*/ new Child1();		// �ڽ�-->�θ� �� �ڵ�����ȯ �Ȱ�
		p2.printParent();
		// p2��� ���۷����� Parent���� ���ٰ���
		// ������ Child1�� �����ϰ��� �Ѵٸ� ��������ȯ�� �ϸ� ��!!
		// p2.printChild1();		--> �ȵ�
		((Child1)p2).printChild1(); 	// ��������ȯ
		
		/*
		 * ��ӱ����� Ŭ���������� ����ȯ ����!!
		 *
		 * 1. UpCasting
		 * 	�ڽ�Ÿ�� --> �θ�Ÿ��
		 * 	�ڵ�����ȯ (��������)
		 *	 ex) �θ�Ÿ�� = (�θ�Ÿ��) �ڽİ�ü;
		 * 	     ((�θ�Ÿ��)�ڽ�).�θ�޼ҵ�();
		 * 
		 * 
		 * 2. DownCasting 
		 * 	�θ�Ÿ�� --> �ڽ�Ÿ��
		 *	 ��������ȯ (�ڻ����Ұ�)
		 * 	 ex) ((�ڽ�Ÿ��)�θ�).�ڽĸ޼ҵ�();
		 * 
		 * 
		 */
		
		
		//---------------------------------------------------------------
		
		System.out.println("=======================================");
		
		// �������� �� ������, ���������� �˾ƺ���!
		// ������ : �ϳ��� �θ�Ÿ������ ���������� �ڽİ�ü�� �ٷ� �� �ִ� ����
		
		
		// Child1��ü 2��, Child2��ü 2���� �ʿ��� ���ϰ� �̿��غ���
		
		// ������ ���� ��
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5,7,2);
		arr2[1] = new Child2(2,1,5);
		
		
		// ������ ��� ��
		/*
		 Parent p3 = new Child1();
		 Parent p4 = new Child2();
		 */
		
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(5,7,2);
		arr[2] = new Child2(2,1,5);
		arr[3] = new Child1(2,3,5);
		// �θ� = �ڽ�;
		
		// ����1. �ϳ��� �θ�Ÿ������ �پ��� �ڽĵ��� ���� �� �ִ�.
		// --> �ڽĵ��� ������ �� �ϳ��� Ÿ������ ������ �� ���� --> ���ϴ�. �ڵ� ���̰� ����
		
		
		// ������ ����ִ� �ڽ�Ŭ������ �޼ҵ� ����
		// --> �ڽ�Ÿ������ ����ȯ�ؼ� �ڽ� �޼ҵ� ���� (��, �� �ε������� ������ �����ϰ� �ִ� ���� �ڽ�Ÿ������ ����ȯ�ؾߵ�!)
		
		((Child1)arr[0]).printChild1();
		//((Child1)arr[1]).printChild1();		// �����δ� Child2��ü ����ֱ⶧���� �������� �ȶ��� �����ϸ� ������
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		
		System.out.println("========== �ݺ��� �̿� ==========");
		
		
		for(int i=0; i<arr.length; i++) {
		
			/*
			 * instanceof ������
			 * 
			 * ���� ���۷����� � �ڽİ�ü�� �����ϰ��ִ��� Ȯ���� �� ���
			 * 
			 * [ǥ����]
			 * ���۷��� instanceof Ŭ������
			 * 
			 * �ش� ���۷����� ������ �����ϰ��ִ� Ŭ����Ÿ���� �ش�Ŭ������� ��ġ�ϸ� true, �ƴϸ� false
			 * ���� �����ϰ��ִ°Ϳ� ���缭 �����ϰ� ��������ȯ���ִ� ������
			 */
			
			/*
			//if(i == 0 || i == 3) {
			if(arr[i] instanceof Child1) {	// �ش� �ε����� ���� Child1�� �����ϰ������� true, �װ� �ƴϸ� false
			((Child1)arr[i]).printChild1();
			}else {
			((Child2)arr[i]).printChild2();
			}
		}
		*/
			
			arr[i].print();	// �������ε� : �����Ͻÿ��� ���۷���Ÿ���� Ŭ������ ����� �޼ҵ�� ���ε� ������ 
							// 				���� ����Ǵ°� ������ �����ϰ��ִ� �ڽ�Ŭ������ ����� �������̵��� �޼ҵ尡 �����!
		
		
		
		
		}
	}
}