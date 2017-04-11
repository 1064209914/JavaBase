package com.hxd.imooc.inherit;

public class Test {

	public static void main(String[] args) {
		Vehicle bus=new Bus();
		Vehicle steamer=new Steamer();
		Vehicle plane= new Plane();
		bus.zaikke("公交","公路", 40);
		steamer.zaikke("轮船","海上", 200);
		plane.zaikke("飞机","天空", 500);
		/*bus.wheel=8;
		Bus bus2=new Bus();
		bus2.wheel=8;
		if (bus.equals(bus2)) {
			System.out.println("他们是相同的！");
		}else {
			System.out.println("他们是不相同的！");
		}
		//System.out.println("轮子有："+bus.wheel);
		//bus.run();
		//bus.seat=10;
		//bus.have();
		//System.out.println(bus);
*/
	}

}
