package com.hxd.imooc.thread;
/**
 * 实现Runnable 来写线程
 * @author Administrator
 *
 */
public class Practice_Runnable implements Runnable {

	@Override
	public void run() {
		System.out.println("我是："+Thread.currentThread().getName()+"我也要执行了。。");
		for(int i=1;i<=100;i++){
			System.out.println("这是我："+Thread.currentThread().getName()+"\t第\t"+i+"\t次执行");
		}
	}

}
