package com.hxd.imooc.inherit;

public class Vehicle extends Object {

	public String name;
	public int wheel;
	public int num;
	public String way;
	 public void   zaikke (String name,String way,int  num) {
		 System.out.println("我是："+name+"   我可以在"+way+"载客"+num+"人");
	}
	/*@Override
	public String toString() {
		return "Bus [seat=" + seat + "]";
	}
	String brand;
	int seat=10;
	public  Vehicle(){
		System.out.println("父类的无参构造方法");
	}
	public void have() {
		System.out.println("拥有"+seat+"个座位数");
	}
	public void  run() {
		System.out.println("可以高速移动！");
	}
	public void play() {
		System.out.println("不错");
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (wheel != other.wheel)
			return false;
		return true;
	}*/
	
}
