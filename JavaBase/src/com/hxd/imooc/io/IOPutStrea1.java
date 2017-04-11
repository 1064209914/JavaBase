package com.hxd.imooc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOPutStrea1 {
	public static void main(String[] args) throws FileNotFoundException {
	File file=new File("F:\\一开始的小游戏\\Test.java");
	FileInputStream in=new FileInputStream(file);
	/**
	 * 将指定文件按16进制输出到控制台		
	 * 每10行换一行
	 * 
	 */
/*	int b;
	int i=1;
	try {
		 while((b=in.read())!=-1){
			 if (b<=0xf) {
				System.out.print("0");
			}
			 //Integer.toHexString 将整形转换成16进制的字符串形式
			 System.out.print(Integer.toHexString(b) +" ");
			 i++;
			 if (i%10==0) {
				System.out.println();
			}
		 }
		 in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	/**
	 * 以数组的形式读
	 */
	byte[] buf=new byte[20*1024];
	try {
		int b=in.read(buf,0,buf.length);
		int m;
		int j=1;
		for(m=0;m<b;m++){
			if (b<=0xf) {
				System.out.print("0");
			}System.out.print(Integer.toHexString(buf[m] & 0xff)+" ");
			if (j++%10==0) {
				System.out.println();
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
