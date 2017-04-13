package com.hxd.imooc.thread;
/**
 * 测试线程
 * @author Administrator
 *
 */
public class practice_Test {

	public static void main(String[] args) {
	
		//Thread rThread=new Thread(new Practice_Runnable(), "大师兄");
		Practice_thread practice_thread=new Practice_thread();
		practice_thread.setName("唐僧");
		//rThread.start();
		practice_thread.start();
				
		
	}

}
