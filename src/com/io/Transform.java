package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符流 转 字节流
 * @author Administrator
 *
 */


public class Transform {
	public static void main(String []args) throws IOException{
		String fileName = "F:" + File.separator + "hello.txt";
		File f = new File(fileName);
		WriterToOutputStream(f);	//字符输入流 转 字节输入流	
		ReaderToInputStream(f);		//字符输出流 转 字节输入流
	}
	
	public static void WriterToOutputStream(File f) throws IOException{
		Writer out = new OutputStreamWriter(new FileOutputStream(f, true));
		out.write("hello\r\n");
		out.close();
	}
	
	public static void ReaderToInputStream(File f) throws IOException{
		Reader read = new InputStreamReader(new FileInputStream(f));
		char[] b = new char[100];
		int len = read.read(b);
		read.read(b);
		read.close();
		System.out.println(new String(b, 0, len));
	}
}
