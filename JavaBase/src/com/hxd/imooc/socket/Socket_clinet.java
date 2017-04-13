package com.hxd.imooc.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
			// 1创建客户端socket 指定服务器和端口
			Socket socket = new Socket("localhost", 8888);
			// 2.获取输出流 像服务器端发送信息
			OutputStream os = socket.getOutputStream();// 字节流
			PrintWriter pW = new PrintWriter(os);// 将输出流包装成打印流输出
			pW.print("黄敏1\n");
			pW.flush();
			//pW.close();
			socket.shutdownOutput();		//用完之后  要关闭 流 不然  他会一直停在这
			//获取输入流  
			InputStream is=socket.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			is.close();
			br.close();			
			// 3. 关闭资源
			pW.close();
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
