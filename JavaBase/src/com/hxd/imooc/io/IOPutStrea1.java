package com.hxd.imooc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.dgc.Lease;

public class IOPutStrea1 {
	public static void main(String[] args) throws IOException {
	File file=new File("F:\\一开始的小游戏\\Test.java");
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\vbox\\ll.java"));
	byte[] bytes=new byte[1024];
	while(bis.available()>0){
		if (bis.available()>1024) {
		}else{
			byte[] bs=new byte[bis.available()];
			bis.read(bs);
			bos.write(bs);
		}
	}
	bos.flush();
		bis.close();
		bos.close();
		System.out.println("ok了");
	}
}
