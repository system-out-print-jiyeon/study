package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class Run {
	
	public static void main(String[] args) {
		
		// Desktop ��ü ����
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 1500000, true);
		
		// Tv ��ü ����
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "t-01", "�̳�����Ƽ��", 3500000, 60);
		
		// SmartPhone ��ü ����
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("����", "s-01", "������11pro", 1500000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
	}

}








