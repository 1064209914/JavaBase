package com.hxd.imooc.duotai;
public class Rectangle extends Shape {
	int  a;
	int b;
	public  Rectangle(int a ,int b) {
			this.a=a;
			this.b=b;
		
	}
	@Override
	public void perimeter() {	
		int perimeter=(a+b)*2; 
		System.out.println("该长方形周长是："+perimeter);
	}

	@Override
	public void acreage() {
	int acreage=a*b;
		System.out.println("该长方形面积是："+acreage);
		
	}

}
