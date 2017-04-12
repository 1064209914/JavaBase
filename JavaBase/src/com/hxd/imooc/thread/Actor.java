package com.hxd.imooc.thread;

/**
 * 两个演员 男：张余粮 女：范平平
 */
public class Actor extends Thread {
	@Override
	public void run() {
		System.out.println("我" + Thread.currentThread().getName() + "就是力量的化身");
		for (int i = 1; i <= 100; i++) {
			System.out.println("这是我第：" + i + "次演出");
			if (i % 10 == 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread actor = new Actor();
		actor.setName("张余粮");
		actor.start();
		
		Thread aThread=new Thread(new Actress(), "范平平");
		aThread.start();
		
	}
}
	class Actress implements Runnable{

		@Override
		public void run() {
			System.out.println("我" + Thread.currentThread().getName() + "就是魔法的化身");
			for (int i = 1; i <= 100; i++) {
				System.out.println("这是我第：" + i + "次演出");
				if (i % 10 == 0) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
		
	}
