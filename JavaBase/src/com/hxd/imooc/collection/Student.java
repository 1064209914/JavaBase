package com.hxd.imooc.collection;

import java.util.HashSet;
import java.util.Set;

public class Student {
	public int id;
	public String name;
	public Set<Course> course;

	public Student(int id,String name){
		 this.id=id;
		 this.name=name;
		 this.course=new HashSet<Course>();
}
}