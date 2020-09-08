package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesTest1 {

	public static void main(String[] args) {
		
		// Properties : Map계열임 => Key, Value 세트로 저장
		//  단, Key값과 Value값이 String이다.
		
		Properties prop = new Properties();
		
		// Map 계열이기때문에 put메소드 사용가능하긴 함
		/*
		prop.put("다이제", new Snack("단맛", 1500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		
		// 단, Properties를 사용하는 목적은 보통 파일로 출력하고 불러올 때 사용함..
		// store() 메소드, load() 메소드
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		// setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 순서유지x, key값 중복시 나중의 value으로 덮어씌워짐
		
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}







