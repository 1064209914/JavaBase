package com.hxd.imooc.thread;

public class KeyPerson extends Thread {
		public void  run(){
			System.out.println(Thread.currentThread().getName()+"加入战场");
			for(int i=1;i<=10;i++){
				System.out.println(Thread.currentThread().getName()+"左右突杀隋军");
			}
			
			System.out.println(Thread.currentThread().getName()+"结束了战斗");
			
		}
}
