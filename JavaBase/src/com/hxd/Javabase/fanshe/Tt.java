package com.hxd.Javabase.fanshe;

import java.lang.reflect.Constructor;

public class Tt {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c1 = null ;		// 声明Class对象
		c1 = Person.class ;	// 实例化对象
		Constructor<?> con[] = c1.getConstructors() ;	// 取得一个类中的全部构造
		for(int i=0;i<con.length;i++){
			System.out.println("构造方法：" + con[i]) ;	 // 输出构造，直接打印
		}

	}

}
