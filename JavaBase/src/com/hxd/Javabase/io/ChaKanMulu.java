package com.hxd.Javabase.io;
/**
 * 用递归的方法写查看所有子目录  
 */
import java.io.File;
import java.io.IOException;

public class ChaKanMulu {
	public static void listDrectory(File file) throws IOException {
		if (!file.exists()) {
			throw new IllegalArgumentException("目录" + file + "不存在");
		} else if (!file.isDirectory()) {
			throw new IllegalArgumentException(file + "不是目录");
		} else {
			/*
			  String[] mul=file.list(); //返回字符串数组 for (String string : mul) {
			  System.out.println(file+"\\"+string);
			 */
			File[] files = file.listFiles(); // 返回子目录下文件的抽象
			if (files != null && files.length > 0) {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						// 递归
						listDrectory(file2);
					}else {
						System.out.println(file2);
					}
				}

			}
		}
	}
}
