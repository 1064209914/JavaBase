package com.hxd.Javabase.helloword;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印乘法口诀表到文件中。 要求： A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
 * B.在另一个测试类中，创建一个实现Runnable接口的线程； C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
 * D.启动线程，打印乘法口诀表到文件中！
 *
 */
public class Cheng {
	public void play() throws FileNotFoundException {
		PrintStream bos = new PrintStream("E:\\vbox\\Test.txt");
		for (int i = 1; i <= 9; i++) {
			for (int a = 1; a <= i; a++) {

				bos.print(a + "*" + i + "=" + i * a + "\t");
			}
			bos.println();
		}
		bos.close();
	}
}
