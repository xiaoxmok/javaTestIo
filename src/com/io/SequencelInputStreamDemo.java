package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

/**
 * 将两个文件内容合并
 * @author Administrator
 *
 */


public class SequencelInputStreamDemo {
	public static void main(String []args) throws IOException{
		File f1 = new File("F:" + File.separator + "hello.txt");
		File f2 = new File("F:" + File.separator + "hello1.txt");
		File f3 = new File("F:" + File.separator + "hello2.txt");
		InputStream input1 = new FileInputStream(f1);
		InputStream input2 = new FileInputStream(f2);
		OutputStream output = new FileOutputStream(f3);
		SequenceInputStream sis = new SequenceInputStream(input1, input2);
		int temp = 0;
		while ((temp = sis.read()) != -1){
			output.write(temp);
		}
		input1.close();
		input2.close();
		output.close();
		sis.close();
	}
}