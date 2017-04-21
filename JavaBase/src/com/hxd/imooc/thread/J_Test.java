package com.hxd.imooc.thread;

public class J_Test {

	public static void main(String[] args) {
			J j=new J();
			Thread jia1=new Thread(new Jia(j));
			Thread jia2=new Thread(new Jia(j));
			
			Thread jian=new Thread(new Jian(j));
			Thread jian2=new Thread(new Jian(j));
			
			jia1.start();
			jia2.start();
			jian.start();
			jian2.start();
			
			
	}

}
