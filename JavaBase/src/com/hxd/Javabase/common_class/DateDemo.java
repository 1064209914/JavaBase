package com.hxd.Javabase.common_class;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

	public static void main(String[] args) {
		 /*	Calendar c=new GregorianCalendar();
		 	Date d=c.getTime();
		 	String dd= new SimpleDateFormat("HH:mm:ss").format(d);
		 	System.out.println(dd);*/
		 	//计算7天前；
		 	Calendar c=new GregorianCalendar();
		 	//设置成明天24点
		 	c.add(Calendar.DAY_OF_MONTH, 1);
		 	c.set(Calendar.HOUR_OF_DAY, 0);
		 	c.set(Calendar.MINUTE, 0);
		 	c.set(Calendar.SECOND, 0);
		 	String  endtime=c.getTime().toLocaleString();
		 	c.add(Calendar.DAY_OF_MONTH, -7);
		 	String  starttime=c.getTime().toLocaleString();
		 	System.out.println(endtime);
		 	System.out.println(starttime);
		 	
		 	
	}

}
