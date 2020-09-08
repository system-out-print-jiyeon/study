package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���."));
		hs1.add(new String("������"));
//		hs1.add(new Integer(1));
//		hs1.add(new Integer(1));
		
		System.out.println(hs1); // ��������x, �ߺ����x
		
		
		HashSet<Person> hs2 = new HashSet<>();
		
		hs2.add(new Person("����", 40, 100));
		hs2.add(new Person("ȫ�浿", 26, 40));
		hs2.add(new Person("�踻��", 24, 20));
		hs2.add(new Person("����", 40, 100));
		//hs2.add("��");
		
		System.out.println(hs2); // ��������x, �ߺ����..? (��? ���ϰ�ü�� �Ǵ��� �ȵǼ�!!)
								 // hashCode�� equals �޼ҵ带 �������̵� �ϰ� �Ǹ� �� �ʵ尪���� ��� ��ġ�� ��� ���ϰ�ü�� �ǴܵǱ� ���� => �ߺ�����
		
		// Set�迭 Ư¡ �� index�������!! => ��, Ư�� ��ü �ϳ����� ���� �� ����!!
		
		// ��, ����մ� ��ü�鿡 ���������� ������ ����!!
		
		// 1. for�� ��밡��! (��, ���� for�����θ� ����!! for each�����θ�!!)
		//for(Object p : hs2) {
		for(Person p : hs2) {
			//System.out.println(p);
			//System.out.println(((Person)p).getName());
			System.out.println(p.getName());
		}
		
		// 2. ArrayList�� ���� �� ArrayList �ݺ��� �������鼭 �����ϴ� ���
		//    List <--> Set
		
		//ArrayList list = new ArrayList(); // �󸮽�Ʈ�� ���� �� 
		//list.addAll(hs2); 				// addAll�޼ҵ�� ��°�� �߰��ϴ� ���
		
		ArrayList<Person> list = new ArrayList<>(hs2); // hs2�� ����ִ� ��ü�� ����Ʈ�� ���ʿ� �����鼭 �����ϴ� ���
		
		System.out.println("==========");
		
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i));
			//System.out.println(((Person)list.get(i)).getName());
			System.out.println(list.get(i).getName());
		}
		
		// 3. Iterator �ݺ��ڸ� �̿��ϴ� ���
		System.out.println("========");
		// 1) hs2�� ��ü�� --> Iterator(�ݺ���) �Ű� ���			: set�迭.iterator()
		Iterator<Person> it = hs2.iterator(); // hs2 => it		
		
		// 2) �ݺ����� ���ؼ� ��� �̾���
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		*/
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			//System.out.println(((Person)it.next()).getName());
			System.out.println(it.next().getName());
		}
		
		// HashSet ������ ��ü�� add�� ��
		// ������ ����ִ� ��ü���" hashCode�޼ҵ�, equals�޼ҵ�"�� ���ϰ�ü���� �Ǵ���
		

	}

}





