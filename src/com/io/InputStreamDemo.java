

package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * 字节流
 * 加len，为减少输出后有过多的空格。
 * @author Administrator
 *
 */


public class InputStreamDemo{
	public static void main(String []args) throws IOException{
		String fileName = "F:" + File.separator + "hello.txt";
		File f = new File(fileName);
		InputStream in = new FileInputStream(f);
		//byte[] b = new byte[1024];
		byte[] b = new byte[(int) (f.length())];	//自动识别内容的长度
		int len = in.read(b);	//读的长度
		in.read(b);
		/*for (int i = 0; i < f.length(); i++){
			b[i] = (byte) in.read();
		}*/			//一个字节一个字节的读
		in.close();
		System.out.println("读入的长度为：" + len);
		System.out.println(new String(b, 0, len));
	}
}