package com.hxd.Javabase.common_class;
/**
 * 字符串类相关的
 * 
 * @author Administrator
 *
 */
public class StringDemo1 {
			public  static String get(){
				return "ab";
			}
	
	
	public static void main(String[] args) {
			String str1="abcd";
			String str2="a"+"b"+"c"+"d";
			String str3="ab"+"cd";
			String one="a"+"b";
			String str4=one+"c"+"d";
		
			String str5=get()+"cd";
			System.out.println(str1==str2);
			System.out.println(str1==str3);
			System.out.println(str1==str4);
			System.out.println(str1==str5);
	

	}

}
