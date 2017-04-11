package com.hxd.Javabase.helloword;
/**
 * 提示
1、使用循环进行累加，循环的范围是从1至10
2 、判断当前数是否为偶数
3 、如果为奇数跳过，执行下一个循环，如果为偶数，进行累加

 * 
 */
public class Num {

	public static void main(String[] args) {
		int sum=0;
		for(int i= 1;i<=10;i++){
			if(i%2!=0){
				continue;
			}
			sum=sum+i;
		}
		System.out.println("10以内的偶数之和："+sum);

	}
		}
