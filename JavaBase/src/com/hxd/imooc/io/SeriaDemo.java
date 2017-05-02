package com.hxd.imooc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriaDemo {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {
			/*Student student=new Student("张三", "007",20);
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\vbox\\seria.txt"));
			oos.writeObject(student);
			System.out.println("ok了");
			oos.close();*/
		
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\vbox\\seria.txt"));
			Student student2=(Student) ois.readObject();
			System.out.println(student2);
			ois.close();
	}
		
}
