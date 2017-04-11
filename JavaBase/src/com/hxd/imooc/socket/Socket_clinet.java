package com.hxd.imooc.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 *
 */
public class Socket_clinet {

	public static void main(String[] args) {
		try {
			//1创建客户端socket	指定服务器和端口
			Socket socket=new Socket("localhost", 8888);
			//2.获取输出流 像服务器端发送信息
			OutputStream os=socket.getOutputStream();//字节流
			PrintWriter pW=new PrintWriter(os);//将输出流包装成打印流输出
			pW.write("黄敏 吊！");
			pW.close();
			//3. 关闭资源
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
