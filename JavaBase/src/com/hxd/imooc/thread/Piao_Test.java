package com.hxd.imooc.thread;

public class Piao_Test {

	public static void main(String[] args) {
			
		Piao piao=new Piao();
		
		Thread a=new Thread(new Person(piao), "张三");
		Thread b=new Thread(new Person(piao), "李四");
		Thread c=new Thread(new Person(piao), "王五");
	
		a.start();
		b.start();
		c.start();
	
	}
}
