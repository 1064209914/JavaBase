package com.hxd.imooc.thread;

public class Piao {

	private int num = 20;

	public synchronized int sellpiao() {
		if (num > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "买到票了     ------还剩" + --num + "张票");
		} 

			return num;
		
	}
}