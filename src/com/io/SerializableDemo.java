package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ObjectOutputStream 
 * ObjectInputStream
 * 
 * @author Administrator
 *
 */

public class SerializableDemo {
	public static void main(String[] args) throws Exception{
		File f = new File("F:" + File.separator + "hello.txt");
		ObjectOutputStreamDemo(f);
		ObjectInputStreamDemo(f);
	}
	public static void ObjectOutputStreamDemo(File f) throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(new Person("china",20));
		oos.close();
	}
	public static void ObjectInputStreamDemo(File f) throws Exception{
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(f));
		Object obj = input.readObject();
		input.close();
		System.out.println(obj);
	}
}
