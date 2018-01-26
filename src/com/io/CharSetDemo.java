package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class CharSetDemo {
	public static void main(String[] args) throws IOException {
		//����Ĭ�ϱ���
		System.out.println(System.getProperty("file.encoding"));
		//����Ĳ���
		File f = new File("F:" + File.separator + "hello.txt");
		OutputStream out = new FileOutputStream(f);
		String str = "��ã��й���";
		byte[] b = str.getBytes("GBK");
		out.write(b);
		out.close();
		
		//������롣����������
		InputStream input = new FileInputStream(f);
		byte[] c = new byte[1024];
		int len;
		len = input.read(c);
		input.read(c);
		input.close();
		System.out.println(new String(c, 0, len));
	}
}
