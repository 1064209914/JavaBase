package com.hxd.imooc.thread;

public class Jian implements Runnable {
	private J j;
	
	
	public Jian(J j) {
		super();
		this.j = j;
	}


	@Override
	public synchronized void run() {
		
		for (int i = 0; i < 100; i++) {
			j.jian();
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}

}
