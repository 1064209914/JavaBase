package com.hxd.imooc.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class IOTest_2 {

	public static void main(String[] args) throws IOException  {
		// 为了满足BufferefRead 创建inputsteam
		InputStreamReader  in=new InputStreamReader(System.in);
		BufferedReader bis=new BufferedReader(in);
		//用printsteam去写
		PrintStream bos=new PrintStream("E:\\vbox\\Test,txt");
		try {
			String string;
			string=bis.readLine();
			while(!string.equals("null")){
				bos.println(string);
				bos.flush();
				string=bis.readLine();
				}
			bis.close();
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
