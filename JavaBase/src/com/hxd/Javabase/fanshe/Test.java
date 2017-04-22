package com.hxd.Javabase.fanshe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;

import com.hxd.Javabase.annotation.ListDemo;
import com.hxd.Javabase.generics.personTest;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
		// 获取包名 类名
		/*
		 * Person test = new Person();
		 * System.out.println(test.getClass().getName());
		 */
		// 写入指定的文本
		/*
		 * String string =new String();
		 * System.out.println(string.getClass().getName());
		 */
		PrintStream Pos = new PrintStream("E:\\vbox\\Person,txt");
		// 获取整个类
		Class c = ListDemo.class;
		// new 个新对象
		//Object o = c.newInstance();
		// 定义一个可变长的字符串来存储属性
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers()) + "class" + c.getSimpleName() + "{\n");
		// 获取所有的属性
		Field[] fs = c.getDeclaredFields();
		// 遍历所有属性
		for (Field field : fs) {
			sb.append("\t");// 空格
			sb.append(Modifier.toString(field.getModifiers()) + " ");// 获得属性的修饰符，例如public，static等等
			sb.append(field.getType().getSimpleName() + " ");// 属性的类型的名字
			sb.append(field.getName() + ";\n");// 属性的名字+回车
		}
		sb.append("\n");

		// 获取所有的构造行数
		Constructor[] cs = c.getDeclaredConstructors();
		// 遍历所有的构造函数
		for (Constructor constructor : cs) {
			sb.append("\t");
			sb.append(Modifier.toString(constructor.getModifiers()) + " ");
			sb.append(c.getSimpleName() + "(");
			// 遍历所有的参数列表
			Class[] xc = constructor.getParameterTypes();
			// 如果为空 则不循环
			if (xc.length == 0) {
				sb.append("){");
			} else {
				for (int i = 0; i <= xc.length - 1; i++) {
					if (i == xc.length - 1) {
						sb.append(xc[i].getSimpleName() + "){");

					} else {
						sb.append(xc[i].getSimpleName() + ",");
					}
				}
			}
			sb.append("}\n");
		}
		sb.append("\n");
		// 获取所有方法
		Method[] ms = c.getDeclaredMethods();
		for (Method method : ms) {
			sb.append("\t");
			sb.append(Modifier.toString(method.getModifiers()) + " ");
			sb.append(method.getReturnType().getSimpleName() + " ");
			sb.append(method.getName() + "(");

			// 遍历参数列表 先遍历出来 便于唤醒 再唤醒方法
			Class<?>[] xc = method.getParameterTypes();
			if (xc.length == 0) {
				sb.append("){");
			} else {
				for (int i = 0; i <= xc.length - 1; i++) {
					if (i == xc.length - 1) {
						sb.append(xc[i].getSimpleName() + "){");

					} else {
						sb.append(xc[i].getSimpleName() + ",");
					}
				}
			}
			sb.append("}\n");
		}
		sb.append("}");
		System.out.println(sb);
		Pos.print(sb);
		Pos.close();
	}
}
