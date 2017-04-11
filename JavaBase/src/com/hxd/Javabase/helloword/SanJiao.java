package com.hxd.Javabase.helloword;
/**
 * 打印空三角型 并向右移动 
 * 一开始的思想是：分成2部分   建立再原本的三角形之上
 */
public class SanJiao {
	 int num;
	 int k;

	public void play(int num, int k) {
		for (int i = 0; i < num - 1; i++) {
			/**
			 * j=0时，底边是靠边的 。因为去掉最后一行所以要向右移一格，即初始值为-1。 
			 * 也正因为少了一行   所以要打印2*(num-1)-1个*    
			 * 原本的num-1-i 也变成num-2-i
			 */
			for (int j = -1 - k; j <= 2 * num - 3; j++) { 
				if ((j == num - 2 - i) || (j == num - 2 + i)) {
					System.out.print("*");

				} else {
					System.out.print(" ");

				}
			}
			System.out.print("\n");
		}
		for (int m = 1; m <= k; m++) {		//控制最后一行的平移
			System.out.print(" ");
		}
		for (int i = 0; i < 2 * num - 1; i++) {		//打最后一行*
			System.out.print("*");
		}
		for(int i=0;i<5;i++){
		/*	for (int j = 0; j <2*5-1; j++) { // j控制 打多少个*
				if (j>=5-1-i&&j<=5-1+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
	}
}}
