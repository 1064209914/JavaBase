package com.hxd.Javabase.generics;

public class Person<T,E> {
	private T name;
	private E age;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public E getAge() {
		return age;
	}
	public void setAge(E age) {
		this.age = age;
	}
	public Person(T name,E age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("姓名"+name+"\t年龄"+age);
	}
	
	
	
	
}
