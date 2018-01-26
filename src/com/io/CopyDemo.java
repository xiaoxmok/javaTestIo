package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ͨ���ֽ��������ļ����������ݸ��Ƶ���һ�ļ��С�
 * @author Administrator
 *
 */


public class CopyDemo {
	public static void main(String []args) throws IOException{
		String file1 = "F:" + File.separator + "hello.txt";
		String file2 = "F:" + File.separator + "hello1.txt";
		File f1 = new File(file1);
		File f2 = new File(file2);
		if (!f1.exists()){
			System.out.println("�������ļ�������");
			System.exit(0);
		}
		InputStream in = new FileInputStream(f1);
		byte[] b = new byte[(int) f1.length()];
 		in.read(b);
 		in.close();
		if (!f2.exists()){
			f2.createNewFile();
		}
		OutputStream out = new FileOutputStream(f2);
		out.write(b);
		out.close();
		System.out.println("���Ƴɹ�");
	}
}
