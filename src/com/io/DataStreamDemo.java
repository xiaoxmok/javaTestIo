package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据操作流DataOutputStream、DataInputStream类
 * @author Administrator
 *
 */

public class DataStreamDemo {
	public static void main(String []args) throws IOException{
		File f = new File("F:" + File.separator + "hello.txt");
			DataOutputStreamDemo(f);
			DataInputStreamDemo(f);
	}
	public static void DataOutputStreamDemo(File f) throws IOException{
		char[] ch = {'A', 'B', 'C'};
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream(f));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (char temp : ch){
			out.writeChar(temp);
		}
		out.close();
	}
	public static void DataInputStreamDemo(File f) throws IOException{
		char[] ch = new char[10];
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		int count = 0;
		char temp;
		while ((temp = in.readChar()) != 'C'){
			ch[count++] = temp;
		}
		in.close();
		System.out.println(ch);
	}
}
