package com.hxd.imooc.inherit;



public class TelPhone {
	private int length;
	private String colour;
	static int kuan;
	public static void play(int newkuan){
		System.out.println("宽是："+newkuan);
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int newlength) {
		this.length=newlength;
	}
}
