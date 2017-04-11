package com.hxd.Javabase.io;

import java.io.File;
import java.util.Date;

public class file_1 {

	public static void main(String[] args) {
		File f1 = new File("a.jpg");
		File f2 = new File("D:/temp/");

		System.out.println("Name:" + f1.getName());
		System.out.println("Path:" + f1.getPath());
		System.out.println("AbsolutePath:" + f1.getAbsolutePath());
		System.out.println("Parent:" + f1.getParent());
		System.out.println("lastmodifile:" + new Date(f1.lastModified()));
		System.out.println("length:" + f1.length());
		System.out.println("exists:" + f1.exists());
		System.out.println("Canread:" + f1.canRead());
		System.out.println("CanWriter:" + f1.canWrite());
		System.out.println("isFile:" + f1.isFile());
		System.out.println("ishadden:" + f1.isHidden());
		System.out.println("isDirectore:" + f1.isDirectory());
		System.out.println("isAbsolute:" + f1.isAbsolute());
		System.out.println("length:" + f1.length());
		f1.delete();

	}

}
