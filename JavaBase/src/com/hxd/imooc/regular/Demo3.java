package com.hxd.imooc.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args) {
			Pattern pattern=Pattern.compile("a\\w+");
			Matcher m=pattern.matcher("adkkk ashjkshjk l k h fg adkkk ua ik");
			while(m.find()){
				System.out.println(m.group());
			
			}

	}

}
