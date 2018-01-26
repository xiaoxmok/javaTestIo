package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用缓冲区从键盘读入内容
 * @author Administrator
 *
 */

public class BufferedReaderDemo {
	public static void main(String []args){
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please input message:");
		String str = null;
		try {
			str = buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("you input message is:" + str);
	}
}
