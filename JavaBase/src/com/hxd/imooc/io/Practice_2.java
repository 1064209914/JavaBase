package com.hxd.imooc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class Practice_2 {

	public static void main(String[] args) throws IOException {
	/*	InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		PrintStream ps=new PrintStream("E:\\ppt\\one.txt");
		String s=null;
		while(!(s=br.readLine()).equals(" ")){
			ps.println(s);
			ps.flush();
		}
		br.close();
		ps.close();*/
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\QQ图片20151204235056.jpg"));
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\ppt\\two.jpg")) ;
			
		byte[] byt=new byte[1*1024];
		//int i=0;
		while(bis.available()>0){
			if (bis.available()>1*1024) {
				bis.read(byt);
				bos.write(byt);
				bos.flush();
			}else {
				System.out.println("剩余的字节数不足4096 ,剩余为：" + bis.available());
				byte[] remain = new byte[bis.available()];
				bis.read(remain);
				bos.write(remain);
				bos.flush();
			}
		}
		bis.close();
		bos.close();
		System.out.println("完成了！");
	}

}
