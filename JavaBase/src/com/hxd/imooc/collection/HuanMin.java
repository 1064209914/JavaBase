package com.hxd.imooc.collection;
import java.util.ArrayList;
import java.util.Collections;

public class HuanMin {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<10;i++){
		int num=(int)(Math.random()*100);
		list.add(num);
	}
	Collections.sort(list);
	System.out.println(list);
	}

}
