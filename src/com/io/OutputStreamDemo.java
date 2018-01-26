package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 字节流OutputStream
 *
 * @author Administrator
 *
 *
 */

public class OutputStreamDemo{
	public static void main(String []args) throws Exception{
		String fileName = "F:" + File.separator + "hello.txt";
		File f = new File(fileName);
		if (f.exists()){
			//f.delete();
			write1(f);
			System.out.println("写入成功。");
		}else{
			f.createNewFile();
			System.out.println("创建文件" + fileName + "成功");
			write1(f);
			System.out.println("写入成功");
		}
	}
	public static void write1(File f) throws Exception{
		OutputStream out = new FileOutputStream(f,true);
		String str = "你好。\r\n";
		byte[] b = str.getBytes();
		/*for (int i = 0; i < b.length; i++){
			out.write(b[i]);
		}
			一个字节一个字节的写入
		*/
		out.write(b);		//直接写入字符串
		out.close();
	}
}