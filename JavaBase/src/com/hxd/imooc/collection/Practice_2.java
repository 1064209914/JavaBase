package com.hxd.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;import java.util.ListIterator;

public class Practice_2 {

	public static void main(String[] args) {
		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(new Student(001, "张三"));
		arrayList.add(new Student(005, "张三"));
		arrayList.add(new Student(007, "张三"));
		arrayList.add(new Student(002, "张三"));
		arrayList.add(new Student(003, "张三"));
		
	for (Student student : arrayList) {
		System.out.println(student);
	}
	arrayList.remove(2);
	arrayList.set(2, new Student(6, "Lisi" ));
	System.out.println();
		Collections.sort(arrayList);
		for( Student student:arrayList){
			System.out.println(student);
		}
		
	}

}
