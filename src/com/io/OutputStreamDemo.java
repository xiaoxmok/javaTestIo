package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * �ֽ���OutputStream
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
			System.out.println("д��ɹ���");
		}else{
			f.createNewFile();
			System.out.println("�����ļ�" + fileName + "�ɹ�");
			write1(f);
			System.out.println("д��ɹ�");
		}
	}
	public static void write1(File f) throws Exception{
		OutputStream out = new FileOutputStream(f,true);
		String str = "��á�\r\n";
		byte[] b = str.getBytes();
		/*for (int i = 0; i < b.length; i++){
			out.write(b[i]);
		}
			һ���ֽ�һ���ֽڵ�д��
		*/
		out.write(b);		//ֱ��д���ַ���
		out.close();
	}
}