package com.hxd.imooc.duotai;

/**
 * 计算圆的周长和面积
 *
 */
public class Circle extends Shape {
	 int r;
	 public  Circle(int r) {
		 this.r=r;
	}
	
	@Override
	public void perimeter() {
		Double z=2*3.14*r;
		System.out.println("该圆的周长是："+z);
	}

	@Override
	public void acreage() {
		double m=3.14*r*r;
		System.out.println("该圆的面积是："+m);
	}

}
