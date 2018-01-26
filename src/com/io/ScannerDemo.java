package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Scanner类来进行数据输入
 * @author Administrator
 *
 */

public class ScannerDemo {
	public static void main(String []args){
		ScannerFile();
		//test();
	}
	/**
	 * 简单测试
	 */
	public static void test(){
		Scanner sca = new Scanner(System.in);
		int temp = sca.nextInt();	//读整数
		System.out.println(temp);
		float flo = sca.nextFloat();	//读浮点数
		System.out.println(flo);
	}
	/**
	 * 从文件中读内容
	 */
	public static void ScannerFile(){
		File f = new File("F:" + File.separator + "hello.txt");
		Scanner sca1 = null;
		try {
			sca1 = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//for (int i = 0; i < f.length(); i++){
			String str = sca1.next();
		//}
		System.out.println(new String(str));
	}
}
