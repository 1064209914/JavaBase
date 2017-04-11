package com.hxd.Javabase.annotation;
/**
 * 不同类型的属性 找出他们中与constomannotation注解的 注解 
 * 并用反射方法  赋给 该属性
 */
import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// 先打印出一开始的的初始值
		ListDemo listDemo = new ListDemo();
		System.out.println(listDemo);
		
		//newInstance 出一个对象
		Class<?> c = ListDemo.class;
		Field[] fs = c.getDeclaredFields();
		Object object = c.newInstance();
		
		//遍历所有的  字段(属性)
		for (Field field : fs) {
			//先判断出 属性的类型  然后再判断它有没有改注解的 注解 
			//如果有  就先 打破封装   用反射的方法写
			String tyname = field.getType().getSimpleName();
			switch (tyname) {
			case "String":
				if (field.isAnnotationPresent(CostomAnnotion.class)) {
					CostomAnnotion annotion = field.getAnnotation(CostomAnnotion.class);
					System.out.println("注解为：" + annotion.name());
					field.setAccessible(true);
					field.set(object, annotion.name());
				}
				break;
			case "int":
				if (field.isAnnotationPresent(CostomAnnotion.class)) {
					CostomAnnotion annotion1 = field.getAnnotation(CostomAnnotion.class);
					System.out.println("注解为：" + annotion1.age());
					field.setAccessible(true);
					field.set(object, annotion1.age());
				}
				break;
			case "double":
				if (field.isAnnotationPresent(CostomAnnotion.class)) {
					CostomAnnotion annotion2 = field.getAnnotation(CostomAnnotion.class);
					System.out.println("注解为：" + annotion2.score());
					field.setAccessible(true);
					field.set(object, annotion2.score());
				}
				break;

			default:
				break;
			}
			// 打印出结果 以便比较
			System.out.println(object);
		}

	}

}
