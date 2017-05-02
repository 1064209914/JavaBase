package com.hxd.imooc.regular;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args) {
	
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher("jsk124jjjs55skll1ppp");
		String s=m.replaceAll("-"); //替换  replaceall
		System.out.println(s);
		
		//切割 
		String s1="k2f2h5h7jk";
		 String[] strings=s1.split("\\d+");
		 System.out.println(Arrays.toString(strings));
		

	}

}
