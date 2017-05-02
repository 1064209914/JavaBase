package com.hxd.Javabase.common_class;

import java.util.Arrays;

/**
 * 与系统相关的常用类
 * 1.System
 * 2.Runtime
 * @author Administrator
 *
 */
public class SystemDemo2 {

	public static void main(String[] args) {
		//数组copy
		int[] is={14,7,88,6,9,4,1};
		int[] is2=new int[10];
		System.out.println(Arrays.toString(is2));
		System.arraycopy(is, 0, is2, 1, 3);
		System.out.println(Arrays.toString(is2));
		//当前时间
		System.out.println(System.currentTimeMillis());
		//退出JVM 和回收垃圾	 他们都调用了runtime的方法
		System.gc();
		System.exit(0);
	}

}
