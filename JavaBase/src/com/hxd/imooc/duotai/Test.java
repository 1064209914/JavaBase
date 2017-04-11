package com.hxd.imooc.duotai;
/**
 * 长方形的周长和面积 继承Shape
 */
import java.util.*;
import com.hxd.imooc.inherit.*;
public class Test {
	public static void main(String[] args){
	Scanner in=new  Scanner(System.in);
	System.out.println("请输入长方形的长和宽");
	int a=in.nextInt();
	int b=in.nextInt();
		Shape rectangle=new Rectangle(a,b);
		rectangle.perimeter();
		rectangle.acreage();
		System.out.println("请输入圆的半径");
	int r=in.nextInt();
		Circle circle=new Circle(r);
		circle.perimeter();
		circle.acreage();
	Bus bus=new Bus();
	bus.have();
 }
}