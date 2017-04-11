package com.hxd.Javabase.helloword;
/**
 * 3次密码的输入
 */
import java.util.Scanner;

public class Verify {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//提示用户输入
		System.out.print("请输入你的用户名：");
		int name = in.nextInt();
		//3次密码的输入 
		System.out.print("请录入你的密码：");
		int pw = in.nextInt();
		for (int i = 2; i >= 0; i--) {
			System.out.print("请输入你的密码：");
			int n=in.nextInt();
			if (n!=pw ) {
				if (i != 0) {
					System.out.println("密码错误！！你还有 " + i + " 次机会!");
					continue;
				}
			} else {
				System.out.println("密码正确！！");
				break;
			}

		}

	}

}
