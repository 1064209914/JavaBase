package com.hxd.Javabase.common_class;

public class stringMaths {
	public static void empty(String string) {
		//判断字符串是否为空
		if (string.length() == 0||string.trim().length()==0) {
			System.out.println("为空");
		}else{
			System.out.println("非空");
		}
			
	}
	public static void main(String[] args) {
		char[] cs = { 'j', 'j', 'd', 'a' };
		System.out.println(new String(cs));
		String str2 = "hjkkk";
		System.out.println(str2.equals(str2.toUpperCase()));
		System.out.println(str2.equalsIgnoreCase(str2.toUpperCase()));
		System.out.println(new String(str2.getBytes()));
		String string2=" a c ";
		System.out.println(string2.length());
		System.out.println(string2.trim().length());//去掉头尾的空格 返回字符串
		empty(str2);
		empty("");
		empty(" a");
	}

}
