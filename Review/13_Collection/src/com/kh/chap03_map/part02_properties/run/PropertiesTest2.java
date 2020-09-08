package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();	// 비어있는 상태
		
		try {
			prop.load(new FileInputStream("test.properties"));
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		// value 값을 알아내고 할 때
		System.out.println(prop.getProperty("List"));
		
		/*
		 *  .properties를 사용하는 경우
		 *  1. 해당 프로그램의 기본정보들을 주로 .properties 확장자 문서로 저장해놓으면
		 *     key value 모두다 문자열이기 때문에 개발자가 아닌 일반 관리자가 해당 문서를 다루기 수월하고
		 *     
		 *  .xml를 사용하는 경우
		 *  1. .xml 문서는 다양한 프로그래밍 언어간에 호환이 쉽다. 
		 */
		
		

	}

}
