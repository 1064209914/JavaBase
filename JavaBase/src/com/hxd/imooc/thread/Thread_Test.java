package com.hxd.imooc.thread;
//测试pracyice_Thread 
public class Thread_Test  {

	public static void main(String[] args) {
		Practice_thread pThread=new Practice_thread();
		pThread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pThread.keeprunning=false;
	}

}
