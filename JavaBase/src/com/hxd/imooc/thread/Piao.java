package com.hxd.imooc.thread;

public class Piao {

	private int num = 20;

	public synchronized int sellpiao(){
			
	System.out.println(Thread.currentThread().getName()+"买到票了     ------还剩"+--num+"张票");
			return num;
		}

}