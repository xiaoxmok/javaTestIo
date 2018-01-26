package com.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * »ØÍËÁ÷
 * @author Administrator
 *
 */


public class PushBackInputStreamDemo {
	public static void main(String []args) throws IOException{
		String str = "Hello, china!";
		PushbackInputStream push = null;
		ByteArrayInputStream bat = null;
		bat = new ByteArrayInputStream(str.getBytes());
		push = new PushbackInputStream(bat);
		int temp = 0;
		while ((temp = push.read()) != -1){
			if (temp == ','){
				push.unread(temp);
				temp = push.read();
				System.out.print("»ØÍË" + (char)temp + "");
			}else{
				System.out.print((char)temp);
			}
		}
	}
}
