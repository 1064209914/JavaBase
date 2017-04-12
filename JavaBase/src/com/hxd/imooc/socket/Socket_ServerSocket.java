package com.hxd.imooc.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 基于TCP协议的socket的通信 实现用户登录 服务端
 */
public class Socket_ServerSocket {

	public static void main(String[] args) {
		try {
			// 1.创建一个服务端socket,即serversocket，并绑定端口 监听指定端口
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("*****服务器端即将启动*****");
			// 2.调用accept方法 来监听此端口 等待客户连接
			Socket socket = serverSocket.accept();
			// 3.获取输入流 并读取客户端信息
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
			serverSocket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
