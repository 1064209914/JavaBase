package com.hxd.Javabase.common_class;

public class stringMaths {
	public static void empty(String string) {
		if (string.length() == 0) {
			System.out.println("此字符串为空字符串");
		} else if (string.equals("")) {
			System.out.println("此字符串为空字符串");
		} else {
			System.out.println("此字符串不是空字符串");
		}
	}

	public static void main(String[] args) {
		char[] cs = { 'j', 'j', 'd', 'a' };
		System.out.println(new String(cs));
		String str2 = "hjkkk";
		System.out.println(str2.equals(str2.toUpperCase()));
		System.out.println(str2.equalsIgnoreCase(str2.toUpperCase()));
		System.out.println(new String(str2.getBytes()));
		empty(str2);
		empty("");
	}

}
