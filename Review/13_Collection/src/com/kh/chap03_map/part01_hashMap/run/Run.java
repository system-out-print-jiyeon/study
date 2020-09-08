package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		
		// ���ο� ��ü�� �߰��ϰ��� �Ҷ� key + ��ü(value) ��Ʈ�� ��ƾߵ�!!
		
		// K => key
		// V => value
		
		// 1. put(K key, V value)
		hm.put("������", new Snack("���ڸ�", 1500));
		hm.put("ĭ��", new Snack("�ܸ�", 700));
		hm.put("�����", new Snack("§��", 500));
		hm.put("��������Ĩ", new Snack("§��", 500));
		
		System.out.println(hm); // ����������� �ȵ�!, value���� �ߺ��ǵ� Ű���� �ߺ����� �ʱ� ������ �� ����!
		
		hm.put("�����", new Snack("�ſ��", 700)); // Ű ���� �ߺ��Ǹ� ������ value������ �������!!
		
		System.out.println(hm);
		
		// 2. get(K key) : V
		Snack s = /* (Snack) */hm.get("������");
		System.out.println(s);
		
		// 3. size() : int
		System.out.println("���� : " + hm.size());
		
		// 4. replace(K key, V value)
		hm.replace("��������Ĩ", new Snack("�̳�§��", 1000));
		
		//list.set(1, new Music())
		
		System.out.println(hm);
		
		// 5. remove(Object key)
		hm.remove("��������Ĩ");
		System.out.println(hm);
		
		
		
		// hm ����ִ� ��� ��ü�鿡 ���������� ���� ����
		
		// for each �� (���� for��) => ��� �Ұ�
		/*for(Object o : hm) {
			
		}*/
		
		// ArrayList ��� �Ұ�
		//ArrayList list = new ArrayList(hm);
		
		
		//Iterator it = hm.iterator(); // ���̷�Ʈ�� hm.iterator() ȣ�� �Ұ�!! (Map �迭���� ������ ����)
		
		// Map => Set => Iterator
		
		// Map => Set
		// 1. keySet() �̿��ϴ� ���
		
		// 1) hm�� �ִ� Ű�鸸 Set�� ��� (Ű���� ���� ����)
		//     hm.keySet() : Set
		Set<String> keySet = hm.keySet();
		
		// 2) keySet�� Iterator �ݺ��ڿ� ���
		Iterator<String> itKey = keySet.iterator();
		
		// 3) �ݺ����� ���ؼ� �ϳ��� �̱�
		while(itKey.hasNext()) {
			String key = /* (String) */itKey.next();
			Snack value = /* (Snack) */hm.get(key);
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
			
		}
		
		System.out.println("=========================");
		
		
		// 2. entrySet() �̿��ϴ� ���
		
		// 1) hm�� �ִ� Ű��� ��Ʈ�� Set����� (Ű��� ��Ʈ(Entry)�� ���� ����)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet�� �ִ� Entry�� Iterator�� ���
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) �ݺ����� ���� �۾�
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /* (Entry) */itEntry.next();
			
			String key = /* (String) */entry.getKey();
			Snack value = /* (Snack) */entry.getValue();
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		
		
	}

}






