package com.hxd.Javabase.io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZuoYe {

	public static void main(String[] args) throws IOException, InterruptedException {
			File file=new File("F:\\ZuoYe\\one.wmv");
			File  file2=new File("F:\\ZuoYe\\two.wmv");
			System.out.println("等待3S中...");
			Thread.sleep(3000);
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(file2);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte[] unit = new byte[4096];// 数组的大小为4KB,作为数据的传输单元
			long start = System.currentTimeMillis();
			System.out.println("使用缓冲器--现在的开始时间毫秒是：" + start + " ms");
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
			bos.close();
			
			long end = System.currentTimeMillis();
			System.out.println("现在的结束时间毫秒是：" + end + " ms");
			long useTime = end - start;
			System.out.println("使用缓冲器--文件拷贝完成，总共用时：" + useTime + " ms");
			
	}

}
