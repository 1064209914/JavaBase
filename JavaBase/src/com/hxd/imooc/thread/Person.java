package com.hxd.imooc.thread;


import lombok.Setter;

public class Person implements Runnable {
	private int i;
	private Piao piao;
	@Setter
	volatile boolean flag=true;
	
	
	
	public Person(Piao piao) {
		super();
		this.piao = piao;
	}

	
	@Override
	public void run() {
		while(flag){
		piao.sellpiao();
		i=piao.sellpiao();
		if (i<=0) {
			flag=false;
			//break;
		}
		}
	}



	public Person() {
		super();
	}






}
