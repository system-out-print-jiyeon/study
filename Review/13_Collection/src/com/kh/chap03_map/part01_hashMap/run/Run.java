package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		
		// 새로운 객체를 추가하고자 할때 key + 객체(value) 세트로 담아야됨!!
		
		// K => key
		// V => value
		
		// 1. put(K key, V value)
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 700));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // 저장순서유지 안됨!, value값이 중복되도 키값이 중복되지 않기 때문에 잘 담긴다!
		
		hm.put("새우깡", new Snack("매운맛", 700)); // 키 값이 중복되면 마지막 value값으로 덮어씌워짐!!
		
		System.out.println(hm);
		
		// 2. get(K key) : V
		Snack s = /* (Snack) */hm.get("다이제");
		System.out.println(s);
		
		// 3. size() : int
		System.out.println("갯수 : " + hm.size());
		
		// 4. replace(K key, V value)
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		
		//list.set(1, new Music())
		
		System.out.println(hm);
		
		// 5. remove(Object key)
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		
		
		// hm 담겨있는 모든 객체들에 순차적으로 접근 가능
		
		// for each 문 (향상된 for문) => 사용 불가
		/*for(Object o : hm) {
			
		}*/
		
		// ArrayList 사용 불가
		//ArrayList list = new ArrayList(hm);
		
		
		//Iterator it = hm.iterator(); // 다이렉트로 hm.iterator() 호출 불가!! (Map 계열에서 제공은 안함)
		
		// Map => Set => Iterator
		
		// Map => Set
		// 1. keySet() 이용하는 방법
		
		// 1) hm에 있는 키들만 Set에 담기 (키들의 집합 형태)
		//     hm.keySet() : Set
		Set<String> keySet = hm.keySet();
		
		// 2) keySet을 Iterator 반복자에 담기
		Iterator<String> itKey = keySet.iterator();
		
		// 3) 반복문을 통해서 하나씩 뽑기
		while(itKey.hasNext()) {
			String key = /* (String) */itKey.next();
			Snack value = /* (Snack) */hm.get(key);
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
			
		}
		
		System.out.println("=========================");
		
		
		// 2. entrySet() 이용하는 방법
		
		// 1) hm에 있는 키밸류 세트로 Set에담기 (키밸류 세트(Entry)의 집합 형태)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet에 있는 Entry들 Iterator에 담기
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 통해 작업
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /* (Entry) */itEntry.next();
			
			String key = /* (String) */entry.getKey();
			Snack value = /* (Snack) */entry.getValue();
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
		}
		
		
		
	}

}






