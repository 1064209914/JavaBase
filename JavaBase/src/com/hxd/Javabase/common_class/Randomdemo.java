package com.hxd.Javabase.common_class;

import java.util.Random;
import java.util.UUID;

//生成5位数的随机数
public class Randomdemo {

	public static void main(String[] args) {
	//1.用UUID生成 取前5位  但是只能到f
		String str1=UUID.randomUUID().toString();
		System.out.println(str1.substring(0, 5));
		//真正的验证  比较时用equalsIgnoreCase
		String str2="abcdefghijklmnopqrstuvwxyz";
		str2+=str2.toUpperCase();
		str2+="0123456789";
		//System.out.println(str2);
		StringBuilder sb=new StringBuilder(5);
		for(int i=1;i<=5;i++){
			char c=str2.charAt(new Random().nextInt(str2.length()-1));
			sb.append(c);
		}
		System.out.println(sb);
	}

}
