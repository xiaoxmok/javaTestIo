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
 * �ַ��� ת �ֽ���
 * @author Administrator
 *
 */


public class Transform {
	public static void main(String []args) throws IOException{
		String fileName = "F:" + File.separator + "hello.txt";
		File f = new File(fileName);
		WriterToOutputStream(f);	//�ַ������� ת �ֽ�������	
		ReaderToInputStream(f);		//�ַ������ ת �ֽ�������
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
