package com.hxd.imooc.thread;
/**
 * 输出当前时间的倒计时 10s内的
 */
import java.sql.Date;
import java.text.SimpleDateFormat;

public class DaoJiShi {

	public static void main(String[] args) {
		//	当前时间
		Date times=new Date(System.currentTimeMillis());
		int i=1;
		while(true){
			//转换格式      并打印出当前时间
			System.out.println(new SimpleDateFormat("HH:mm:ss").format(times));
			//休眠一秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				times=new Date(System.currentTimeMillis());
				i++;
				if(i>100){
					break;
				}
		}
			
	}

}
