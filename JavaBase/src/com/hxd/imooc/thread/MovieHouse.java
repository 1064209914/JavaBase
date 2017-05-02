package com.hxd.imooc.thread;

public class MovieHouse {

	public static void main(String[] args) {
		//共同的资源
		Movie movie=new Movie();
		
		//两个线程
		Player player=new Player(movie);
		wacther	wc=new wacther(movie);
		
		//代理
		Thread p=new Thread(player, "范平平");
		Thread w=new Thread(wc, "东哥");
		p.start();
		w.start();
		

	}

}
