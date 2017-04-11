package com.hxd.imooc.collection;

/**
 * 备选课程
 */
import java.util.ArrayList;

public class BX {
	/**
	 * 备选课程类型
	 */
	public ArrayList<Course> bcourse;

	public BX() {
		this.bcourse = new ArrayList();
	}

	public void courseadd() {
		Course c1 = new Course(1, "java");
		bcourse.add(c1);
		Course temp = (Course) bcourse.get(0);
		Course c2 = new Course(2, "php");
		Course c3 = new Course(3, "ui");
		Course c4 = new Course(4, "web");
		Course c5 = new Course(5, "c++");
		bcourse.add(c2);
		bcourse.add(c3);
		bcourse.add(c4);
		bcourse.add(c5);
		/*
		 * Course temp2=(Course) bcourse.get(1); Course temp3=(Course)
		 * bcourse.get(2); Course temp4=(Course) bcourse.get(3); Course
		 * temp5=(Course) bcourse.get(4);
		 */

	}

	public void play() {
		for (Course course : bcourse) {
			Course course1 = course;
			System.out.println("课程有：" + course1.id + ":" + course1.name);

		}
	}

}
