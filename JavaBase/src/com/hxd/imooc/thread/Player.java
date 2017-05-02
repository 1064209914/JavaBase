package com.hxd.imooc.thread;

public class Player implements Runnable {
		private Movie movie;
		
		
		
	public Player(Movie movie) {
			super();
			this.movie = movie;
		}



	@Override
	public void run() {
	for (int m = 1; m <= 20; m++) {
		if (m%2==0) {
			movie.play("右白虎");
		}else{
			movie.play("左青龙");
		}
	}

	}

}
