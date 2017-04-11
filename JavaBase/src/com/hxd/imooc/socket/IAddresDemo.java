package com.hxd.imooc.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 *
 */
public class IAddresDemo {

	public static void main(String[] args) throws UnknownHostException {
		//活动本机 InetAddress 实例
	InetAddress inetAddress=InetAddress.getLocalHost();			
	System.out.println("主机名："+inetAddress.getHostName());
	System.out.println("主机地址"+inetAddress.getHostAddress());
	byte[] bytes=inetAddress.getAddress();
	System.out.println("Ip地址："+Arrays.toString(bytes));	//以数组形式输出
	System.out.println(inetAddress); //直接输出主机名 和IP地址
	
	//根据名称 活动IP地址
	InetAddress inetAddress2= InetAddress.getByName("黄敏");	//无效
	System.out.println("主机名："+inetAddress.getHostName());
	System.out.println("主机地址"+inetAddress.getHostAddress());
	}

}
