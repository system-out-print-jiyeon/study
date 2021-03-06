package com.kh.variable;

import java.util.Scanner;

public class C_KeyboardInput {
	
	// 紫遂切亜 徹左球稽 脊径廃 葵聖 痕呪拭 奄系馬澗 号狛
	
	public void inputScanner1() {
		
		// 紫遂切拭惟 娃舘廃 昔旋紫牌(戚硯, 蟹戚, 徹) 脊径閤精 板 ず喚径
		
		// java.util.Scanner 適掘什税 五社球研 亜走壱 紫遂切亜 脊径廃 葵聖 亜走壱 臣 呪 赤製!!
		// 適掘什 持失 --> 五社球 硲窒!
		
		Scanner sc = new Scanner(System.in);
		
		// 脊径閤壱切 馬澗 鎧遂聖 胡煽 窒径背辞 脊径聖 政亀背操醤走!!
		System.out.print("雁重税 戚硯精 巷譲脊艦猿 : ");
		
		// 紫遂切亜 脊径廃 庚切伸聖 嗣焼神澗 五社球 (next(), nextLine())
		// String name = sc.next(); // <-- 戚 走尻 戚虞壱 帖檎 "戚" 幻 蟹身
		// next() : 紫遂切亜 脊径廃 葵 掻 因拷戚 赤聖 井酔 因拷 戚穿猿走税 葵幻 石嬢神惟喫!!
		
		String name = sc.nextLine();
		// nextLine() : 紫遂切亜 脊径廃 葵 乞砧 陥 石嬢身!!
		
		
		System.out.print("雁重税 蟹戚澗 護詞脊艦猿 : ");
		// 紫遂切亜 脊径廃 舛呪葵聖 嗣焼神澗 五社球(nextInt())
		int age = sc.nextInt();
		
		System.out.print("雁重税 徹澗 護 cm脊艦猿 : ");
		// 紫遂切亜 脊径廃 叔呪葵聖 嗣焼神澗 五社球(nextDouble())
		double height = sc.nextDouble();
		
		// 設 眼医澗走 溌昔背左切!!
		// "xxx還精 xx室 戚悟,徹澗 xxxcm脊艦陥."
		System.out.println(name + "還精 " + age + "室 戚悟, 徹澗 " + height + "cm脊艦陥.");
		
		
	}
	
	public void inputScanner2() {
		
		// 戚硯, 蟹戚, 爽社, 徹
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("戚硯 : ");
		String name = sc.nextLine();
		
		System.out.print("蟹戚 : ");
		int age = sc.nextInt();
		
		/*
		 * sc.nextLine() : 獄遁拭辞 "殖斗"猿走 熟 石嬢神澗 五社球 ("殖斗" 搾趨像!)
		 * sc.nextLine() 戚須税 五社球 : 獄遁拭辞 "殖斗"澗 石嬢神走 省製!! (紫遂切亜 脊径廃 葵幻聖 石嬢身 == "殖斗" 害焼赤製)
		 */
		
		// 薄仙 戚 獣繊拭 獄遁拭 殖斗亜 害焼赤生糠稽
		// 獄遁拭 害焼赤澗 殖斗研 搾趨爽澗 引舛聖 蓄亜馬檎 喫!!
		
		sc.nextLine();
		
		System.out.print("爽社 : ");
		String address = sc.nextLine();
		
		System.out.print("徹(cm舘是) : ");
		double height = sc.nextDouble();
		
		
		sc.nextLine();
		
		System.out.print("失紺 : ");
		String gender = sc.nextLine();
		
		// 窒径
		// "xxx還精 xx詞戚悟, 紫澗 員精 xxx戚壱, 徹澗 xxxcm脊艦陥."
		
		System.out.println(name + "還精 " + age + "詞戚悟, 紫澗 員精 " 
						+ address + "戚壱, 徹澗 " + height + "cm 脊艦陥.");
		
		System.out.printf("%s還精 %d詞戚悟, 紫澗 員精 %s戚壱, 徹澗 %.2fcm 脊艦陥", name, age, address, height);
		
		//System.out.println("失紺 : " + gender);
		
		
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 庚切伸聖 脊径閤聖 凶 --> sc.nextLine()
		// 舛呪莫聖 脊径閤聖 凶 --> sc.nextInt()
		// 叔呪莫聖 脊径閤聖 凶 --> sc.nextDouble()
		
		// 庚切研 脊径閤聖 凶 --> sc.nextChar() 	???
		
		// 戚硯, 失紺(M/F), 蟹戚, 徹
		System.out.print("戚硯 : ");
		String name = sc.nextLine();
		
		System.out.print("失紺(M/F) : ");		// Male Female
		// char gender = sc.nextChar();	<-- nextChar 澗 蒸製!!!
		char gender = sc.nextLine().charAt(0);
		//				"Male".charAt(0);
		
		
		System.out.print("蟹戚 : ");
		int age = sc.nextInt();
		
		System.out.println("徹(cm舘是) : ");
		double height = sc.nextDouble();
		
		// 窒径聖 搭背辞 溌昔!!
		// ししし還税 鯵昔舛左
		// 失紺 : し
		// 蟹戚 : しし
		//徹 : ししし.し
		
		System.out.println(name + "還税 鯵昔舛左");
		System.out.println("失紺 : " + gender);
		System.out.println("蟹戚 : " + age);
		System.out.println("徹 : " + height);
		
		System.out.println("=== 発慎杯艦陥^.^ ===");
		
	}

	public void inputScanner4() {
		
		// 紫遂切拭惟 砧 鯵税 舛呪葵 脊径閤精 板
		// 機疾 尻至廃 衣引 窒径
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("湛 腰属 舛呪 : ");
		int num1 = sc.nextInt();
		
		System.out.print("砧 腰属 舛呪 : ");
		int num2 = sc.nextInt();
		
		/*
		 * int result = num1 + num2 ;
		System.out.print("機疾衣引 : " + result);
		*/
		
		System.out.print("機疾衣引 : " + (num1 + num2));	// "機疾衣引 : 10" + num2 => "機疾衣引 : 105"
		// + - * / %
	}
	
	
	/*
	 * ** 舛軒 **
	 * 
	 * 1. 嬬車但(乞艦斗)拭 窒径馬奄 是背辞 : System.out.println() 五社球 戚遂
	 * 2. 嬬車但(徹左球)生稽 脊径閤奄 是背辞 : Scanner sc = new Scanner(System.in);
	 * 								sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble()
	 * 
	 * - 爽税拝 繊
	 *  > sc.nextXXX() 及拭  sc.nextLine() 五社球亜 人醤鞠澗 井酔
	 *  	獄遁拭 害精 殖斗研 皐爽澗 引舛 琶呪!! => sc.nextLine(); 廃 腰 希 潤爽檎 喫!!
	 *  
	 *  > '庚切' 葵聖 脊径閤奄 是背辞澗 sc.nextLine() 五社球研 搭背 庚切伸稽 胡煽 閤焼爽壱
	 *  	益 及拭 .charAt(0) 五社球研 搭背 庚切研 蓄窒馬澗 引舛!
	 * 
	 */
	
	
}
