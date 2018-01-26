package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * ��ӡ��
 * @author Administrator
 *
 */

public class PrintStreamDemo {
	public static void main(String []args) throws FileNotFoundException{
		PrintStreamOut();
		//PrintoOut();
		//SystemOut();
		SystemIn();
	}
	/**
	 * PrintStream������ļ���
	 * @throws FileNotFoundException
	 */
	public static void PrintStreamOut() throws FileNotFoundException{
		PrintStream print = new PrintStream(new FileOutputStream(
				new File("F:" + File.separator + "hello.txt")));
		String name = "china";
		int age = 20;
		print.printf("������%s. ���䣺%d.",name,age);
		print.close();
	}
	/**
	 * OutputStream�������Ļ
	 */
	public static void PrintoOut(){
		OutputStream out = System.out;
		try {
			out.write("hello".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ��������ض���
	 */
	public static void SystemOut(){
		System.out.println("hello china.");
		//System.err.println("hello ksk ksk ");   //System.err���������Ϣ
		File f = new File("F:" + File.separator + "hello1.txt");
		try {
			System.setOut(new PrintStream(new FileOutputStream(f, true)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��ඡ�");
		//System.err.println("ksk ksk ");
	}
	
	public static void SystemIn(){
		File f = new File("F:" + File.separator + "hello.txt");
		if (!f.exists()){
			return;
		}else{
			try {
				System.setIn(new FileInputStream(f));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			byte[] b = new byte[1024];
			int len = 0;
			try {
				len = System.in.read(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(new String(b, 0, len));
		}
	}
}
