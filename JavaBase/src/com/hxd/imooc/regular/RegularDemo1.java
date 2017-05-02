package com.hxd.imooc.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 第一个regular expression 案例
 * @author Administrator
 *
 */
public class RegularDemo1 {

	public static void main(String[] args) {
		
		//创建正则表达对象
		Pattern pattern=Pattern.compile("\\d");
		
		//穿件matcher 对象 将想要操作的字符串与表达式 关联起来
		Matcher m=pattern.matcher("11-11-111");
		//调用方法
		/*boolean b=	m.matches();	//尝试将整个字符串与模式相匹配匹配
		System.out.println(b);*/
		
		while(m.find()){   //尝试查找与该模式匹配的输入序列的下一个子序列
		System.out.print(m.group(0));	//返回找到的与之匹配的值  group()和group(0)都是放回全部  ,group(1)表示返回1号捕获组
		}
		Pattern p2=Pattern.compile("(?<=\\d)[a-z]+(?=ing)");
		m=p2.matcher("123hjkking 5545 54jk hkj 1hkjing ");
		while(m.find()){
			System.out.println(m.group());
		
		}
	
	
	}

}
