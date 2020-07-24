package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class Run {
	
	public static void main(String[] args) {
		
		// Desktop 按眉 积己
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("伙己", "d-01", "炉炉单胶农啪", 1500000, true);
		
		// Tv 按眉 积己
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "t-01", "疤唱俱篮萍厚", 3500000, 60);
		
		// SmartPhone 按眉 积己
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("局敲", "s-01", "酒捞迄11pro", 1500000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
	}

}








