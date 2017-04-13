package com.hxd.Javabase.enumm;

import lombok.Getter;
import lombok.Setter;

@Getter

public enum Enum_1 implements Iplay{
	MON("星期一", 1), TUE("星期二", 2), WED("星期三", 3), THU("星期四", 4), FRI("星期五", 5), SAT("星期六", 6){

		@Override
		public void play() {
System.out.println("今天不用上班！");
		}
		
	}, SUN("星期日", 7);
	// Enum(String name, int ordinal)： 执行了7次
	/*
	 * for(Enum_1 e:Enum_1.values){ System.out.println(e.toString()); }
	 */
	private String num;// 星期几
	private int index;// 索引

	// 构造函数
	private Enum_1(String num, int index) {
		this.num = num;
		this.index = index;

	}
		public void Say(){
			
		}
	@Override
	public void play() {
		System.out.println("今天是："+this.num+"---->"+this.index);
		
	}

}
