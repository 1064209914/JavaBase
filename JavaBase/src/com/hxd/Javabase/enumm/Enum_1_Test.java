package com.hxd.Javabase.enumm;

import java.util.EnumMap;
import java.util.Map.Entry;

public class Enum_1_Test {
	public static void main(String[] args) {
		for (Enum_1 e : Enum_1.values()) {
			System.out.println("今天是：" + e.toString() + "---->" + e.ordinal());
			e.play();
			System.out.println();
		}
		Enum_1 enum_1 = Enum_1.FRI;
		switch (enum_1) {
		case MON:
			System.out.println("今天是星期一" + "----->" + enum_1.ordinal());
			break;
		case TUE:
			System.out.println("今天是星期二" + "----->" + enum_1.ordinal());
			break;
		case WED:
			System.out.println("今天是星期三" + "----->" + enum_1.ordinal());
			break;
		case THU:
			System.out.println("今天是星期四" + "----->" + enum_1.ordinal());
			break;
		case FRI:
			System.out.println("今天是星期五" + "----->" + enum_1.ordinal());
			break;
		case SAT:
			System.out.println("今天是星期六" + "----->" + enum_1.ordinal());
			break;
		case SUN:
			System.out.println("今天是星期日" + "----->" + enum_1.ordinal());
			break;
		default:
			break;
		}
			System.out.println();
			Enum_1 sta=	Enum_1.SAT;
			System.out.println(sta);
		EnumMap<Enum_1, Integer> enumMap = new EnumMap(Enum_1.class);
		enumMap.put(Enum_1.MON, 1);
		enumMap.put(Enum_1.THU, 4);
		enumMap.put(Enum_1.SUN, 7);
		for (Entry<Enum_1, Integer> string : enumMap.entrySet()) {
			System.out.println(string.getKey().getNum()+"--"+string.getValue()+"--"+string.getKey().ordinal());
		}
	}
}
