package com.kh.chap02_set.part02_treeSet.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part02_treeSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		TreeSet ts1 = new TreeSet();
		
		ts1.add(new String("������"));
		ts1.add(new String("������"));
		ts1.add(new String("�ٴٴ�"));
		ts1.add(new String("������"));
		ts1.add(new String("�K�K�K"));
		ts1.add(new String("������"));
		
		
		System.out.println(ts1); // ��������x, �ߺ����x
		
		
		TreeSet<Person> ts2 = new TreeSet<>();
		
		ts2.add(new Person("����", 40, 100));
		ts2.add(new Person("ȫ�浿", 24, 40));
		ts2.add(new Person("�踻��", 26, 20));
		ts2.add(new Person("����", 20, 60));
		
		System.out.println(ts2);
		
		// TreeSet�� ���������� ��ü���� �߰��ɶ� compareTo�޼ҵ�� ���ϸ鼭 �߰� ��!!
		// compareTo�� ����Ǿ��ִ� ���ı����� �Ȱ��� ��� �ٸ� �ʵ尪���� �޶� ���ϰ�ü�� �Ǵ��ع���!! (�ߺ������x)
		
		
		
		// ���������� ������ ����!! (ts2)
		// 1. for each��
		for(Person p : ts2) {
			System.out.println(p);
		}
		
		System.out.println("=======");
		
		// 2. ArrayList�� ������ �ݺ���
		ArrayList<Person> list = new ArrayList<>(ts2);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=======");
		// 3. Iterator �ݺ��ڿ� ������ �ݺ���
		Iterator<Person> it = ts2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
