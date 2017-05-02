package com.hxd.imooc.io;

import java.io.File;


/**
 *  在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文
件
 * @author Administrator
 *
 */
public class Practice_1 {

	static File file=new File("E:\\ppt");
	public static void main(String[] args) {
	Practice_1.bianli(file);

	}
		public static void bianli(File file){
			if (!file.exists()) {
				System.out.println("文件不存在");
			}else if (!file.isDirectory()) {
				System.out.println("该路径下不是目录");
			}
		File[] files=file.listFiles();
		if (files.length>0) {
			for (File file2 : files) {
				if (file2.isDirectory()) {
					bianli(file2);
				}else{
					System.out.println(file2);
				}
			}
			
		}
		
		}
}
