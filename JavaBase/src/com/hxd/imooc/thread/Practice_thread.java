package com.hxd.imooc.thread;

/**
 * 继承 thread方 法 写线程
 */
public class Practice_thread extends Thread {
	volatile boolean keeprunning=true;
	@Override
	public void run() {
		System.out.println("我是：" + Thread.currentThread().getName() + "我要执行10次。。。");
		/*for (int i = 1; i <= 10; i++){
			System.out.println(Thread.currentThread().getName() + "执行了第" + i + "次");
	}*/
		
		while(keeprunning){
			System.out.println("好好学习");
		}
}
	}
