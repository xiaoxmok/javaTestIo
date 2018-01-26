package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流
 * @author Administrator
 *
 */

public class WriteDemo {
	public static void main(String []args) throws IOException{
		String fileName = "F:" + File.separator + "helloworld.txt";
		File f = new File(fileName);
		writer1(f);
		reader1(f);
	}
	
	public static void writer1(File f) throws IOException{
		Writer w = new FileWriter(f, true);
		if (!f.exists()){
			f.createNewFile();
			//System.out.println("创建成功。");
		}
		String str = "你好，中国。\r\n";
		w.write(str);
		w.close();
	}
	
	public static void reader1(File f) throws IOException{
		Reader r = new FileReader(f);
		//char[] ch = new char[(int) f.length()];
		char[] ch = new char[100];
		//int len = r.read(ch);
		int temp = 0;
		int count = 0;
		while ((temp = r.read()) != (-1)){
			ch[count++] =(char) temp;
		}
		//r.read(ch);
		r.close();
		System.out.println(new String(ch, 0, count));
	}
}
