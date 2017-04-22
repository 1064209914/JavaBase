package com.hxd.imooc.thread;

public class Jia implements Runnable {
		private J j;
		
		
	public Jia(J j) {
			super();
			this.j = j;
		}


	@Override
	public synchronized void run() {
		for (int i = 0; i <100; i++) {
			j.jia();
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}

}
