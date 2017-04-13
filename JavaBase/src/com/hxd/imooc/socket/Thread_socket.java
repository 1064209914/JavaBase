package com.hxd.imooc.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Thread_socket extends Thread {

	Socket socket=null;

	public Thread_socket(Socket socket) {
		this.socket = socket;
	}
	//线程执行方法  相应客户端
	public void run(){
		try {
			InputStream inputStream = socket.getInputStream();// 用socket的方法
			InputStreamReader isr = new InputStreamReader(inputStream);
			BufferedReader br = new BufferedReader(isr);
			// 循环读取客户端信息
			String s = null;
			while ((s = br.readLine())!=null) {		//readline 是以\t \n 结束
				System.out.println("客户端输入的信息：" + s);
			}
			//socket.shutdownInput();// 关闭输入流
			//获取输出流  用socket
			OutputStream os=socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			pw.println("欢迎您！");
			pw.flush();
			pw.close();
			// 4.关闭资源
			inputStream.close();
			isr.close();
			br.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
