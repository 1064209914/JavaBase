package com.hxd.Javabase.helloword;
import java.util.*;
public class Test_3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=in.nextInt();
/*		for(int a = 0; a < num; a++){
			for(int b = 0; b < (num-1)-a; b++){
				System.out.print(" ");
			}
			for(int c = 0; c< 2 * a + 1; c++ ){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	
		for(int i=0;i<num;i++){
			for(int j=0;j<=2*num+1;j++){
				if ((j>=2*num-i-1)&&(j<=2*num-1+i)) {
					System.out.print("*");
					continue;
				}else {
					System.out.print(" ");
					continue;
				}
			}System.out.print("\n"); 
		}
	}

}
