package com.hxd.imooc.collection;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		BX bx = new BX();
		bx.courseadd();
		bx.play();
		Student student = new Student(1, "张余良");
		System.out.println("欢迎" + student.name + "同学进来选课");
		Scanner in = new Scanner(System.in);
		// 选课
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第" + (i + 1) + "个课程ID");
			int courseId = in.nextInt();
			for (Course cr : bx.bcourse) {
				if (cr.id == (courseId)) {
					student.course.add(cr);
				}
			}

		}

		for (Course cr : student.course) {
			System.out.println("选择了课程：" + cr.id + ":" + cr.name);
		}
	}
}
