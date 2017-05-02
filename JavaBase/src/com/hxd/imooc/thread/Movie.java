package com.hxd.imooc.thread;


public class Movie {
	public int i=1;
	public  String name;
	// flag 为true的时候 生产者生产 消费者 等待		所以可以让消费者等待
	// flag false时 消费者消费 生产者等待
	volatile boolean flag =true;

	public Movie() {
		super();
	}


	public synchronized void play(String name) {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//生产
		this.name=name;
		System.out.println(Thread.currentThread().getName()+"表演了"+name+i++);
		//通知消费者
		notify();
		flag=false;
		
	}
	public synchronized void wacth() {
		if (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//xiaofei
		System.out.println(Thread.currentThread().getName()+"观看了"+name);
		notify();
		flag=true;
		
	}
}