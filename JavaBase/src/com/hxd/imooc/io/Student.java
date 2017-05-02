package com.hxd.imooc.io;
/**
 * 要进行序列化的对象  必须实现serializable
 */
import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Student implements Serializable {
		private String name;
		private transient String  ID;
		private int age;
		
		public Student(){
			
		}

		public Student(String name, String iD, int age) {
			super();
			this.name = name;
			this.ID = iD;
			this.age = age;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Student [name=" + name + ", ID=" + ID + ", age=" + age + "]";
		}
		 private void writeObject(java.io.ObjectOutputStream s)
			        throws java.io.IOException{			
			 s.defaultWriteObject();	//把jvm能默认序列化的序列化
			 s.writeBytes(ID);			//自己手动序列化
		 }
		    private void readObject(java.io.ObjectInputStream s)
		            throws java.io.IOException, ClassNotFoundException {
		    	s.defaultReadObject();		//
		    	 this.ID=s.readLine();
		    }
}
