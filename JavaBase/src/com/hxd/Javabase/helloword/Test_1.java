package com.hxd.Javabase.helloword;

import java.util.function.DoubleToIntFunction;


public class Test_1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}
		System.out.println("他们的和是："+sum);
	}

}
