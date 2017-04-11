package com.hxd.Javabase.annotation;
public class ListDemo implements IList {
	@CostomAnnotion()
	String name="007";
	@CostomAnnotion()
	int age=25;
	@CostomAnnotion
	double score=20.5;
	
	 public ListDemo() {
		super();
	}
	 
	public ListDemo(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "ListDemo [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Deprecated
	public static void play(){
		System.out.println("这是已经过时的方法！");
	}
}
