package com.hxd.Javabase.common_class;

import java.math.BigDecimal;

/**数字类
 * 常用类与常用方法
 * @author Administrator
 *
 */
public class MethDemo {

	public static void main(String[] args) {
		//Math类常用方法的
		int p=Math.max(11, 14);
		System.out.println(p);
		for (int i = 0; i <10; i++) {
			int  a =(int)(Math.random()*100);
			System.out.println(a);
		}
		//精确小数 的运用	 加：add 减 ：subtract 乘：multiply 除：divide
		System.out.println("3*0.3="+ 3*0.3);
		BigDecimal one=new BigDecimal("0.3");
		BigDecimal two=new BigDecimal("3");
		System.out.println(one.multiply(two));
	}

}
