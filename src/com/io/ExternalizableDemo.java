package com.io;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


/**
 * ��Serializable�ӿ���������Ķ�������Զ��������л�������������Զ������л������ݵ�ʱ��
 * ����Ҫʵ��Externalizable�ӿڡ�
 * 
 * @author Administrator
 *
 */

public class ExternalizableDemo {
	public static void main(String []args) throws Exception{
		ser();
		dser();
	}
	public static void ser() throws IOException{
		File f = new File("F:" + File.separator + "hello.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(new Person1("�Ǻ�",30));
		oos.close();
	}
	public static void dser() throws Exception{
		File f = new File("F:" + File.separator + "hello.txt");
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(f));
		Object obj = input.readObject();
		input.close();
		System.out.println(obj);
	}
}
class Person1 implements Externalizable{
	public Person1(){
		
	}
	public Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������" + name + "�����䣺" + age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(this.name);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		this.name = (String) in.readObject();
		this.age = in.readInt();
	}
	private String name;
	private int age;
}
