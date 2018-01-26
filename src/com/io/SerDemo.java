package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * 序列化一组对象
 * @author Administrator
 *
 */


public class SerDemo {
	public static void main(String []args) throws Exception{
		Student[] stu = {new Student("张三", 10), new Student("李四", 20), 
				new Student("王五", 30)};
		ser(stu);
		dser();
	}
	public static void ser(Object[] obj) throws IOException{
		File f = new File("F:" + File.separator + "hello.txt");
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(obj);
		out.close();
	}
	public static void dser() throws Exception{
		File f = new File("F:" + File.separator + "hello.txt");
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(f));
		Object[] obj = (Object[]) input.readObject();
		for (int i = 0; i < obj.length; i++){
			Student s = (Student) obj[i];
			System.out.println(s);
		}
	}
}
@SuppressWarnings("serial")
class Student implements Serializable{
	public Student(){
		
	}
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名：" + name + "，年龄：" + age;
	}
	private String name;
	private int age;
}
