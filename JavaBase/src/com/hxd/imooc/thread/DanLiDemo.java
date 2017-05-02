package com.hxd.imooc.thread;
/**
 * 单例模式之懒汉式	改进版
 * 1.构造器私有化
 * 2.声明一个静态变量
 * 3.创建一个对外公共的静态方法，访问该变量
 * 
 * @author Administrator
 *
 */
public class DanLiDemo {
		//声明一个静态变量
		private static DanLiDemo instance;
		//构造器私有化
		private DanLiDemo(){
				
			}
		public static DanLiDemo getinstance(){
			if (instance==null) {	//先判断 如果有直接返回 无需等待  提高效率！
				synchronized (DanLiDemo.class) {
					if (instance==null) {		//安全
						instance=new DanLiDemo();
					}
				}
			}
			return instance;
		}
			
}

/**
 * 饿汉模式
 * 1.
 * 2.+并new个新对象
 */
class DanLiDemo2 {
	//声明一个静态变量
	private static DanLiDemo2 instance=new DanLiDemo2();	//只要调用这个类中任意方法 他没有时都要初始化
	//构造器私有化
	private DanLiDemo2(){
			
		}
	public static DanLiDemo2 getinstance(){
		
		return instance;
	}
		
}
/**
 * 饿汉模式 改进版
 * @author Administrator
 *
 */
class DanLiDemo3 {
	//声明一个静态变量
	public static class DanLi{		//使之成为 内部类 	只有用到getinstance方法时才会创建
	private static DanLiDemo3 instance=new DanLiDemo3();}
	//构造器私有化
	private DanLiDemo3(){
		
	}
	public static DanLiDemo3 getinstance(){
		
		return DanLi.instance;
	}
	
}
