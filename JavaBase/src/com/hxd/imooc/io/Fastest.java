package com.hxd.imooc.io;

/**
 * 复制
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fastest {

	public static void main(String[] args) throws IOException {
		// File file=new File("E:\\videos\\02读书方法与教学大纲_2017-03-15_153707.wmv");
		File file2 = new File("E:\\vbox\\2.rmvb");
		// FileInputStream 常用的构造函数 有两个 一个(File file)或者(String name)
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("F:\\video\\02读书方法与教学大纲_2017-03-15_153707.wmv"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file2));

		byte[] unit = new byte[4096];// 数组的大小为4KB,作为数据的传输单元
		long start = System.currentTimeMillis();
		System.out.println("使用缓冲器--现在的开始时间毫秒是：" + start + " ms"); // 510ms

		while (bis.available() > 0) {
			if (bis.available() >= 4096) {
				bis.read(unit);
				bos.write(unit);
			} else {
				System.out.println("剩余的字节数不足4096 ,剩余为：" + bis.available());
				byte[] remain = new byte[bis.available()];
				bis.read(remain);
				bos.write(remain);
			}
		}
		bis.close();
		bos.flush();
		bos.close();

		long end = System.currentTimeMillis();
		System.out.println("现在的结束时间毫秒是：" + end + " ms");
		long useTime = end - start;
		System.out.println("使用缓冲器--文件拷贝完成，总共用时：" + useTime + " ms");
	}

}
