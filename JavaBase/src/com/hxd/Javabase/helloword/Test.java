package com.hxd.Javabase.helloword;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		SanJiao  sanJiao=new SanJiao();
		Scanner in = new Scanner(System.in);
		int num = -1;
		int k = -1;
		boolean isEx = false;			

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入個正确的数值：(a>0，b>=0)"); 
			try {
				num = input.nextInt();
				k = input.nextInt();
				isEx =false;
				if (num<=0||k<0) {
					isEx=true;
				}
			} catch (Exception e) {
				System.out.println("请重新输入個正确的数值：");
				isEx = true;
			}

		} while (isEx);

		
		sanJiao.play(num, k);
	}

}
