package com.hxd.Javabase.common_class;

import org.ietf.jgss.Oid;

public class StringPractice {
	//查找以hello为靠头的后缀
	public static void one(){
		String string="hello.cc;kkk.cc;hello.txt";
		String[] strs=string.split(";");
		for (String str2 : strs) {
			//判断字符串是否以hello开头
			if (str2.startsWith("hello")) {
				//判断最后一个点的索引
				int num=str2.lastIndexOf(".");
				//接受后面的字符串
				String str3=str2.substring((num+1),str2.length());
				System.out.println(str3);
			}
		}
		
	}
	//将传入的字符串首字母大写
	public static void two(String string){
		String str=string.substring(0,1).toUpperCase(); //不能用charAt因为 他没有toUpperCase方法
		String str1=str+string.substring(1,string.length());
		System.out.println(str1);
	}
	public static void main(String[] args) {
		//one();
		two("hjkhskjs");
		

	}

}
