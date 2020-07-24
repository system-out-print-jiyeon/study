package com.kh.run;

import com.kh.operator.*;
import com.kh.operator.B_InDecrease;

public class Run {

	public static void main(String[] args) {
		
		A_LogicalNegation a = new A_LogicalNegation();
		//a.method();
		
		B_InDecrease b = new B_InDecrease();
		//b.method1();
		//b.method2();
		//b.method3();
		//b.method4();
		
		
		C_Arithmetic c = new C_Arithmetic();
		//c.method3();
		
		E_Logical e = new E_Logical();
		//e.method1();
		//e.method2();
		
		F_Triple f = new F_Triple();
		//f.method1();
		//f.method2();
		//f.method3();
		//f.method5();
		//f.method6();
		
		G_Compound g = new G_Compound();
		g.method();
		
		
		
		
	}

}
