package com.hxd.imooc.collection;
/**
 * 用hashmap存储 学生信息
 */
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {
	public HashMap<Integer, Student> students;

	public HashMapDemo() {
		this.students = new HashMap<Integer, Student>();
	}

	// 通过put方式 输入学生信息 如果没有 就要求输入学生姓名 如果有 提示用户
	public void mapPut() {
		Scanner in = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("请输入学生id：");
			int num = in.nextInt();
			//判断id 是否被占用
			Student st = students.get(num);
			if (st == null) {
				System.out.println("请输入学生姓名");
				String name = in.next();	 	//问老line 就不会执行这段代码  还有运行时输入问题
				Student newstudent = new Student(num, name);
				students.put(num, newstudent);
				i++;
			} else {
				System.out.println("该id已被占用！");
				continue;
			}
		}

	}

	public void paly() {
		// 通过可以keyset方法， 返回所有“键”的集
		Set<Integer> key = students.keySet();

		System.out.println("总共有" + students.size() + "个学生");
		for (Integer stid : key) {
			Student student = students.get(stid);
			if (student != null) {
				System.out.println("学生姓名：" + student.name);

			}
		}
	}

	public static void main(String[] args) {
		HashMapDemo hash = new HashMapDemo();
		hash.mapPut();
		hash.paly();

	}

}
