package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	
	public void method() {
		
		String str1 = "Hell World";
		
		// 	�޼ҵ��(�Ű�����) : ��ȯ��
				
		// 1. ���ڿ�.charAt(int index) : char
		//	    ���ڿ����� ���޹��� index ��ġ�� ���ڸ��� �����ؼ� ����
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		
		// 2. ���ڿ�.concat(String str) : String
		//    ���ڿ��� ���޵� �Ǵٸ� ���ڿ��� �ϳ��� ���ļ� ���ο� ���ڿ��� ����
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
				
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);  	// �׳� ���ڿ� �����ص� ����
		
		
		// 3. ���ڿ�.toString() : String
		System.out.println("str1 : " + str1/*.toString()*/);
		
		
		// 4. ���ڿ�.equals(Object obj) : boolean
		System.out.println(str1.equals(str2));		// false
		System.out.println(str2.equals(str3));		// true
		
		
		// 5. ���ڿ�.hashCode() : int 
		System.out.println("str1�� �ؽ��ڵ� : " + str1.hashCode());
		System.out.println("str2�� �ؽ��ڵ� : " + str2.hashCode());
		System.out.println("str3�� �ؽ��ڵ� : " + str3.hashCode());  	// str2 = str3 ����
		
		
		// 6. ���ڿ�.length() : int
		System.out.println("str1�� ���� : " + str1.length() + "����");
		
		
		// 7. ���ڿ�.subString(int beginIndex) : String  			--> ���ڿ��� beginIndex ��ġ�������� �������� ���ڿ��� �����ؼ� ����
		//	   ���ڿ�.subString(int beginIndex, int endIndex) : String
		//													    --> ���ڿ��� beginIndex ��ġ�������� endIndex-1������ ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 6));	// begin <=   < end
		
		
		// 8. ���ڿ�.replace(char old, char new) : String
		//	  ���ڿ������� old���ڸ� new���ڷ� ��ȯ�� ���ڿ� ����
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		/*
		String str5 = "move";
		String str6 = str5.replace('m', 'l');
		System.out.println(str6);
		*/
		
		
		// 9. ���ڿ�.toUpperCase()/ toLowerCase() : String
		// 	   ���ڿ��� ��� �빮�ڷ� �����Ѵٰų� ��� �ҹ��ڷ� ������ ���ڿ� ����
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("lower : " + str5.toLowerCase());
				
		/*
		System.out.println("����Ͻðڽ��ϱ�? (y/n) : ");
		char ch = sc.nextLine.toUpperCase().charAt(0);	// toUpperCase������ ������ �빮�ڷ� �ٲ� 'Y', 'N'
					// �޼ҵ� ���̾ ȣ�� == �޼ҵ� ü�̴�  (sc.nextLine.toUpperCase().charAt(0);)
		if(ch == 'Y'){
				}
		*/
		
		
		
		// 10. ���ڿ�.trim() : String
		//		���ڿ��� �� �� ������ ������ ���ڿ� ����
		String str6 = "   JA  VA   ";
		System.out.println("trim : " + str6.trim());  // ������ ������ �������� �ʴ´�
		
		
		// 11. ���ڿ�.toCharArray() : char[]
		//	 	���ڿ��� �� ���ڵ��� ���ڹ迭�� �Űܴ�� �ش� �迭�� �ּҰ� ����
		//		String --> char[]
		String str7 = "Hello";
		char[] arr = str7.toCharArray();
		System.out.println(arr[1]);
		
		
		// 12. static valueOf(char[] data) : String
		//		char[] --> String        // char[]�迭�� String���� �����ִ� !
		System.out.println(String.copyValueOf(arr));
		
		
		
	}
	
	

}
