package com.hxd.imooc.thread;
/**
 *主舞台
 */
public class Stage extends Thread {
	
	public void run(){

		System.out.println("欢迎观看隋唐演义");
		//让观众们安静片刻，等待大戏上演
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("大幕徐徐拉开");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("话说隋朝末年，隋军与农民起义军杀得昏天黑地...");
		
		Army st=new Army();
		Army nm=new Army();
		//创建线程
		Thread starmy=new Thread(st, "隋唐");
		Thread  nmarmy=new Thread(nm,"农民");
		// 开始线程
		starmy.start();
		nmarmy.start();
		
		//使stage线程 休眠
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		Thread cheng=new KeyPerson();
		cheng.setName("程咬金");
		System.out.println("正当双方激战正酣，半路杀出个程咬金！");
		System.out.println("程咬金的理想就是结束战争还百姓一个安居乐业~~");
		
		//双方停止战争   把时间都留给程咬金
		st.keepruning= false;
		nm.keepruning = false;
		
		//舞台休眠
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//
		cheng.start();
		//它优先执行
		try {
			cheng.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			cheng.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("战争结束，人民安居乐业，程先生实现了积极的人生梦想，为人民作出了贡献！");
		System.out.println("谢谢观看隋唐演义，再见！");
	}


	public static void main(String[] args) {
		new Stage().start();
}
}