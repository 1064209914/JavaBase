package com.hxd.imooc.thread;

public class wacther implements Runnable {
	private Movie movie;

	
	
	public wacther(Movie movie) {
		super();
		this.movie = movie;
	}



	@Override
	public void run() {
		for(int i=1;i<=20;i++){
			movie.wacth();
		}
	}

}
