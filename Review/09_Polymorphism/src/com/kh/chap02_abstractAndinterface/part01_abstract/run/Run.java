package com.kh.chap02_abstractAndinterface.part01_abstract.run;

import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.BasketBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * * �߻�Ŭ����
		 * - �̿ϼ�Ŭ����
		 * - ��ü�����Ұ�!! (��, ���۷���Ÿ�����δ� ��� ����)
		 * - �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�]  �� Ŭ���� �ۼ��ϱ� �ߴµ� ������ �̿ϼ��ΰ� ���Ƽ� �갡���� ��ü����������! �� ��,
		 * 									�Ϲ��ʵ� + �Ϲݸ޼ҵ�ε� abstract����ؼ� �߻�Ŭ������ ���� �� �ִ�.
		 * --> �߻�޼ҵ带 ���� Ŭ������ �ݵ�� �߻�Ŭ������ ����ؾߵ�
		 * --> �߻�޼ҵ尡 ���� ��� �߻�Ŭ������ ����� �� ����!!
		 * 		����? --> Ŭ������ �����ϱ� ������ �� Ŭ������ ��ü���� �Ұ��ϰԲ� �س����� �Ѵٸ�
		 * 
		 * 
		 * * �߻�޼ҵ�
		 * - �̿ϼ��� �޼ҵ�� �����({})�� �����Ǿ����� ���� �޼ҵ�
		 * - �߻�޼ҵ尡 ����� �߻�Ŭ������ ��ӹ޴� �ڽ�Ŭ�������� �ڹݵ��! �������̵� ����ߵ�
		 * --> �������̵� ���� ������ �����߻�
		 * --> �޼ҵ� ����� ���ϼ� Ȯ�� ����
		 * 
		 * 
		 */
		
		
		// �߻�Ŭ����(�̿ϼ��� Ŭ����)�δ� �ٷ� ��ü ���� �Ұ�
		// Sports s = new Sports();		<-- �̿ϼ��� Ŭ������ �����Ұ�
		
		// ��, ���۷���Ÿ�����δ� �������, ��ü������ X
		// ��, ���������δ� ���밡��
		// �θ�Ÿ������ �پ��� �ڽİ�ü�� �޾��� �� �ִ�.
		Sports s = new BasketBall();
		Sports[] arr = new Sports[2]; 	// ��ü���� �ƴ�!! �迭�� ����
		arr[0] = new FootBall();
		arr[1] = new BasketBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();   // �������ε� �� , ��Ʈ�ѷ� Ÿ�� ������ �θ�Ŭ�������� 
							//���������δ� �ڽ�Ŭ�������� �������̵�(������)�Ǿ� �ϼ���Ŭ������  ����
		}
		

	}

}
