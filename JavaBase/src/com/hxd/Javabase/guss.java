package com.hxd.Javabase;

import java.util.*;

public class guss {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("****猜拳游戏****");
	System.out.println("请输入你要出的：1：剪刀，2：石头，3：布");
	int person=in.nextInt();
	int computer=(int)(Math.random()*3)+1;
	String marks1="剪刀";
	String marks2="剪刀";
	switch (person) {
		case 1:
		marks1="剪刀";
		break;
		case 2:
		marks1="石头";
		break;
		case 3:
		marks1="布";	
		break;
		
	}
	switch (computer) {
	case 1:
	marks2="剪刀";
	break;
	case 2:
	marks2="石头";
	break;
	case 3:
	marks2="布";	
	break;
	
}if(person==computer){
	System.out.println("平局\t"+"你出的是："+marks1+"\t"+"电脑出的是："+marks2);	
}else if(person==1&&computer==3||person==2&&computer==1||person==3&&computer==2){
		System.out.println("真厉害！你赢了\t"+"你出的是："+marks1+"\t"+"电脑出的是："+marks2);
		}else{
			System.out.println("你输了\t"+"你出的是："+marks1+"\t"+"电脑出的是："+marks2);
		}
	}

}
