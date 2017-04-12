package com.hxd.imooc.thread;
/**
 *军队线程  
 *模拟 双方攻击
 */
public class Army implements Runnable {
	// volatile 保证了线程准确的读取其他线程的值
	volatile boolean keepruning=true;

	@Override
	public void run() {
		while(keepruning){
			//军队每次进攻5次
			for(int i=1;i<6;i++){
				System.out.println(Thread.currentThread().getName()+"军队第"+i+"次进攻");
				Thread.yield();
			}
				//让出处理时间  下次  谁进攻 还不到呢
		}
		System.out.println(Thread.currentThread().getName()+"进攻结束了");
	}

}
