package com.hxd.imooc.collection;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student> {
	public int id;
	public String name;
	public Set<Course> course;

	public Student(int id,String name){
		 this.id=id;
		 this.name=name;
		 this.course=new HashSet<Course>();
}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return   id + ", name=" + name ;
	}

	@Override
	public int compareTo(Student o) {
		if (this.id < o.id) {
			return -1;
		} else if (this.id == o.id) {
			return 0;
		} else {
			return 1;
		}
	
	}
}