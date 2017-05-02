package com.hxd.imooc.collection;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import lombok.val;

/**
 * 练习 hanshmap的一些 运用
 * @author Administrator
 *
 */
public class Practice_1 {

	public static void main(String[] args) {
		HashMap<Integer ,String> hashMap=new HashMap<Integer,String>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		list.set(1, 1);
		System.out.println(list);
		
		hashMap.put(123, "1号选手");
		hashMap.put(1234, "2号选手");
		hashMap.put(12355, "3号选手");
		hashMap.put(1236, "4号选手");
		
		//删除一个
		hashMap.remove(123);
		System.out.println(hashMap);
		//获取所有的key		这hi一种获取 key 和values的方法		
			Set<Integer> sets=hashMap.keySet();
		for (Integer integer : sets) {
			System.out.println(integer);
			//打印出所有key对应的values
			String vString=hashMap.get(integer);
			System.out.println(vString);
		}
		//还有一种就是获取键值对entry的 方法
		for( java.util.Map.Entry<Integer, String> i:hashMap.entrySet()){
			System.out.println(i.getKey()+"-->"+i.getValue());
		}
	
	}

}
