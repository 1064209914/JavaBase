package com.hxd.Javabase.helloword;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class C_T implements Runnable {

	public C_T() {

	}

	@Override
	public void run() {
		Class c = Cheng.class;
		try {
			Method method = c.getDeclaredMethod("play");
			Cheng c1 = (Cheng) c.newInstance();
			method.invoke(c1);

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
