package com.hxd.Javabase;

import java.util.*;

public class Rhombus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个数");
		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 2 * num + 1; j++) {
				if ((j >= num - 1 - i) && (j <= num - 1 + i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		for (int i = 0; i <= num - 2; i++) {
			for (int j = 0; j < 2 * num - 1; j++) {
				if ((j >= 1 + i) && (j <= 2 * num - 3 - i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
