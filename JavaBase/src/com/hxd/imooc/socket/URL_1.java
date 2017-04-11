package com.hxd.imooc.socket;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * URL openStream(字节)
 */
import java.net.MalformedURLException;
import java.net.URL;

public class URL_1 {

	public static void main(String[] args) {
		try {
			//创建一个URL实例
			URL url=new URL("http://baidu.com");
			//用URL的openStream方法获取URl对象所表示的资源的字节输入流
			InputStream inputStream=url.openStream();
			//将字节流装换成字符流
			InputStreamReader isr=new InputStreamReader(inputStream,"utf-8");
			//缓存
			BufferedReader bis=new BufferedReader(isr);
			String string=bis.readLine();
			while(string!=null){
				System.out.println(string);
				string=bis.readLine();
				
			}
			bis.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
