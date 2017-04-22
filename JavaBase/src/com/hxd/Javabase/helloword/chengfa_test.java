package com.hxd.Javabase.helloword;

import java.io.FileNotFoundException;

public class chengfa_test {
	public static void main(String[] args) throws FileNotFoundException {
		C_T che = new C_T();
		Thread chengfa = new Thread(che);
		chengfa.start();
		System.out.println("打印好了");

	}
}
